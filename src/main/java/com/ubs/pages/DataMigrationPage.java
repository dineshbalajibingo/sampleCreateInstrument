package com.ubs.pages;

import java.io.File;

public class DataMigrationPage {


    public static boolean validateFilePresent() {
        File f = new File(System.getProperty("user.dir")+"/src/main/resources/data/testDatas.csv");
        boolean status =f.exists();
        return status;
    }

    public static void updateTestData() {

    }
}
