package com.ubs.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.quantum.utils.ConsoleUtils;
import com.ubs.testDataTypes.*;

public class GeneralDetailsPageDataReader {
    private final String jsonFilePath = "src/main/resources/data/GeneralDetailsData.json";
    private List<GeneralDetailsData> GeneralDetailsDataList;


    public GeneralDetailsPageDataReader(){
        GeneralDetailsDataList = getGeneralDetailsData();
    }
    private List<GeneralDetailsData> getGeneralDetailsData() {
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(jsonFilePath));
            GeneralDetailsData[] data = gson.fromJson(bufferReader, GeneralDetailsData[].class);
            return Arrays.asList(data);
        }catch(FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + jsonFilePath);
        }finally {
            try { if(bufferReader != null) bufferReader.close();}
            catch (IOException ignore) {}
        }
    }

    public final GeneralDetailsData getGeneralDetailsDataList(String productGroupData,String productTypeData){
        for(GeneralDetailsData generalDetailsData : GeneralDetailsDataList) {
            String productGroupDataName = productGroupData+" with "+productTypeData;
            ConsoleUtils.logInfoBlocks("******************"+productGroupDataName);
            if(generalDetailsData.id.equalsIgnoreCase(productGroupDataName)) {
                           ConsoleUtils.logInfoBlocks("productGroup--->" + generalDetailsData.basicDetails.productGroup);
                ConsoleUtils.logInfoBlocks("productType---->" + generalDetailsData.basicDetails.productType);
                ConsoleUtils.logInfoBlocks("issuerIdentifierType---->" + generalDetailsData.issuerDetails.issuerIdentifierType);
                return generalDetailsData;
            }
        }
        return null;
    }

}
