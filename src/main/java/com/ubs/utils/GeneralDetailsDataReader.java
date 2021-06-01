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

public class GeneralDetailsDataReader {
    String fileName = (String) ConfigurationManager.getBundle().getProperty("testDatajsonFile");
    private final String jsonFilePath = "src/main/resources/data/"+fileName+".json";
    private List<GeneralDetailsData> GeneralDetailsDataList;


    public GeneralDetailsDataReader(){
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

    public final GeneralDetailsData getGeneralDetailsDataList(String productGroup, String productType){
        for(GeneralDetailsData generalDetailsData : GeneralDetailsDataList) {
            ConsoleUtils.logInfoBlocks("******************" +generalDetailsData.basicDetails.productGroup);
            ConsoleUtils.logInfoBlocks("******************" +generalDetailsData.basicDetails.productType);
            if(generalDetailsData.basicDetails.productGroup.equals(productGroup) && generalDetailsData.basicDetails.productType.equals(productType))
                return generalDetailsData;
        }
        return null;
    }

}
