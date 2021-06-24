package com.ubs.utils;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class newJsonReader {
    public static void main(String[] args) throws IOException, ParseException {

        String jsonArrayString = new String(Files.readAllBytes(Paths.get("src/main/resources/data/sampleData.json")));
        JSONArray jsonArray = new JSONArray(jsonArrayString);

        JSONObject itemObj = new JSONObject();
        JSONArray jsonArray1 = new JSONArray();
        System.out.println("Printing Array  +++ " +jsonArray);

        for (int i = 0; i < jsonArray.length(); i++)
        {
            itemObj = (JSONObject)jsonArray.get(i);
              if(itemObj.get("idBbUnique").toString().equals("124")){
                  itemObj.put("CouponType", "Yes124");
                System.out.println("&&&&&&&&&&& " +itemObj);
            }
            jsonArray1.put(itemObj);
        }
        System.out.println("Printing Obj  +++" +itemObj);
        System.out.println("Printing jsonArray1  +++" +jsonArray1);


        FileWriter file = new FileWriter("src/main/resources/data/sampleDataaaaa.json");
        file.write(jsonArray1.toString());
        file.flush();



    }
}
