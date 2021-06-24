package com.ubs.utils;

import cucumber.api.DataTable;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReadWriter {
    public static void main(String[] args) throws IOException {
             String jsonArrayString = new String(Files.readAllBytes(Paths.get("src/main/resources/data/sampleData.json")));
             JSONArray jsonArray = new JSONArray(jsonArrayString);

        for (int i = 0; i < jsonArray.length(); i++) {         // OR iterate
            JSONObject tmp = (JSONObject) jsonArray.get(i);
            System.out.println("@@@@@@@@@@"+tmp.get("idBbUnique"));
        }


      //  System.out.println("$$$$$$$$$$" +  getKey(jsonArray,"idBbUnique"));
        System.out.println("$$$$$$$$$$" +  getPArrayPosition(jsonArray,"123"));
    }
    private static Object getKey(JSONArray array, String key)
    {
        Object value = null;
        for (int i = 0; i < array.length(); i++)
        {
            JSONObject item = array.getJSONObject(i);
            if (item.keySet().contains(key))
            {
                value = item.get(key);
                break;
            }
        }

        return value;
    }
    private static JSONObject getPArrayPosition(JSONArray array, String value) throws IOException {
        Object valuesFromKey = null;
      //  System.out.println("array of 0 "+(array.get(0).toString()));
        JSONObject itemArr = null;
        for (int i = 0; i < array.length(); i++)
        {
            itemArr = (JSONObject)array.get(i);
         //   System.out.println("array of 0 "+(array.get(i).toString().equalsIgnoreCase("idBbUnique")));
            if(itemArr.get("idBbUnique").toString().equals("124")){
                itemArr.put("CouponType", "Yes124");
                System.out.println("&&&&&&&&&&& " +itemArr);
               }
        }


        return itemArr;
    }

    public static void updateBack() throws FileNotFoundException {

        FileOutputStream outputStream = new FileOutputStream("src/main/resources/data/testOutput.json");
       // byte[] strToBytes = getPArrayPosition.toString().getBytes();
      //  outputStream.write(strToBytes);
    }

}
