package com.ubs.utils;

import com.google.gson.Gson;
import com.ubs.testDataTypes.CountryListingData;
import com.ubs.testDataTypes.ExtendedDetailsData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CountryListingPageDataReader {
    private final String jsonFilePath = "src/main/resources/data/CountryListingData.json";
    private List<CountryListingData> CountryListingDataList;


    public CountryListingPageDataReader(){
        CountryListingDataList = getCountryListingData();
    }
    private List<CountryListingData> getCountryListingData() {
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(jsonFilePath));
            CountryListingData[] data = gson.fromJson(bufferReader, CountryListingData[].class);
            return Arrays.asList(data);
        }catch(FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + jsonFilePath);
        }finally {
            try { if(bufferReader != null) bufferReader.close();}
            catch (IOException ignore) {}
        }
    }

    public final CountryListingData getCountryListingDataAndFillForm(String mandatoryValues){
        for(CountryListingData getCountryListingData : CountryListingDataList) {
            if(mandatoryValues.equals("Mandatory Values")) {
                return getCountryListingData;
            }
        }
        return null;
    }

}
