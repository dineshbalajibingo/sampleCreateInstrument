package com.ubs.utils;

public class FileReaderManager {

    private static FileReaderManager fileReaderManager = new FileReaderManager();
     private static GeneralDetailsDataReader jsonDataReader;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance( ) {
        return fileReaderManager;
    }

    public GeneralDetailsDataReader getJsonReader(){
        return (jsonDataReader == null) ? new GeneralDetailsDataReader() : jsonDataReader;
    }
}