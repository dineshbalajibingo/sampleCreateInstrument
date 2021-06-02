package com.ubs.utils;

import com.google.gson.Gson;
import com.quantum.utils.ConsoleUtils;
import com.ubs.testDataTypes.ExtendedDetailsData;
import com.ubs.testDataTypes.GeneralDetailsData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ExtendedDetailsPageDataReader {
    private final String jsonFilePath = "src/main/resources/data/ExtendedDetailsData.json";
    private List<ExtendedDetailsData> ExtendedDetailsDataList;


    public ExtendedDetailsPageDataReader(){
        ExtendedDetailsDataList = getExtendedDetailsData();
    }
    private List<ExtendedDetailsData> getExtendedDetailsData() {
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(jsonFilePath));
            ExtendedDetailsData[] data = gson.fromJson(bufferReader, ExtendedDetailsData[].class);
            return Arrays.asList(data);
        }catch(FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + jsonFilePath);
        }finally {
            try { if(bufferReader != null) bufferReader.close();}
            catch (IOException ignore) {}
        }
    }

    public final ExtendedDetailsData getExtendedDetailsDataAndFillForm(String mandatoryValues){
        for(ExtendedDetailsData getExtendedDetailsData : ExtendedDetailsDataList) {
            if(mandatoryValues.equals("Mandatory Values")) {
                return getExtendedDetailsData;
            }
        }
        return null;
    }

}
