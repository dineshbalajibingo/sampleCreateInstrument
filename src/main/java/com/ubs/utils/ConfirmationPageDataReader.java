package com.ubs.utils;

import com.google.gson.Gson;
import com.ubs.testDataTypes.ConfirmationData;
import com.ubs.testDataTypes.CountryListingData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ConfirmationPageDataReader {
    private final String jsonFilePath = "src/main/resources/data/ConfirmationData.json";
    private List<ConfirmationData> ConfirmationPageDataList;


    public ConfirmationPageDataReader(){
        ConfirmationPageDataList = getConfirmationPageData();
    }
    private List<ConfirmationData> getConfirmationPageData() {
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(jsonFilePath));
            ConfirmationData[] data = gson.fromJson(bufferReader, ConfirmationData[].class);
            return Arrays.asList(data);
        }catch(FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + jsonFilePath);
        }finally {
            try { if(bufferReader != null) bufferReader.close();}
            catch (IOException ignore) {}
        }
    }

    public final ConfirmationData getConfirmationPageDatandFillForm(String mandatoryValues){
        for(ConfirmationData getConfirmationData : ConfirmationPageDataList) {
            if(mandatoryValues.equals("Mandatory Values")) {
                return getConfirmationData;
            }
        }
        return null;
    }

}
