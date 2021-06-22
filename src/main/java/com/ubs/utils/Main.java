package com.ubs.utils;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, CsvException {
        String filePath = System.getProperty("user.dir")+"/src/main/resources/data/testDatas.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(filePath),
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.RFC4180_LINE_END);
        List<String[]> rows = new LinkedList<String[]>();
        rows.add(new String[]{"rc","idBbUnique","ISIN","Ticker","CouponType","TradeStatus","ticker","cpn","maturity","series","name","shortName","issuerIndustry"});
        rows.add(new String[]{"-1","123","","","","12","3.71","05/16/2021","1803","DALIAN","DALIAN","FINANCIAL"});
        rows.add(new String[]{"-1","124","","","","12","3.71","05/16/2021","1803","DALIAN","DALIAN","FINANCIAL"});
        rows.add(new String[] {"-1","126","","","","12","3.71","05/16/2021","1803","DALIAN","DALIAN","FINANCIAL"})  ;


        CSVReader reader = new CSVReader(new FileReader(filePath));
        String[] outValues = new String[2];
        while (reader.verifyReader()) {
           // String idBbUnique = reader.get("idBbUnique");
            //String ISIN = reader.get("ISIN");

        }
        writer.writeAll(rows);
        writer.close();

    }
}
