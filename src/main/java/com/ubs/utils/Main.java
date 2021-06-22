package com.ubs.utils;

import com.opencsv.CSVWriter;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.CDL;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static FileWriter file;
    public static void main(String[] args) throws IOException, ParseException {
        //  JSONParser parser = new JSONParser();
        // Object obj = parser.parse(new FileReader("src/main/resources/data/testData.json"));
        // JSONObject jsonObject1 = (JSONObject) obj;

        String jsonArrayString  = new String(Files.readAllBytes(Paths.get("src/main/resources/data/testData.json")));
        JSONObject output;

        try {
            output = new JSONObject(jsonArrayString);

            JSONArray docs = output.getJSONArray("fileName");

            for (int i=0; i < docs.length(); i++){
                JSONObject itemArr = (JSONObject)docs.get(i);

                    itemArr.put("ISIN", "aaa");

                }

            String csv;

            File f = new File("src/main/resources/data/testDatassss.csv");
            if(f.exists())
            {
                 csv = CDL.toString(docs.getJSONObject(0).names(), docs);
            }else{
                csv = CDL.toString(docs);
            }
            FileWriter file = new FileWriter ("src/main/resources/data/testDatassss.csv",true);
            BufferedWriter bw = new BufferedWriter(file);
            bw.write(csv);
            //FileUtils.writeStringToFile(file, csv);
           System.out.println("Data has been Sucessfully Writeen to "+ docs);
            System.out.println(csv);
            bw.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }

}
