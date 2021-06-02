package com.ubs.utils;

public class FileReaderManager {

    private static FileReaderManager fileReaderManager = new FileReaderManager();
     private static GeneralDetailsPageDataReader jsonDataReader;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance( ) {
        return fileReaderManager;
    }

    public GeneralDetailsPageDataReader getJsonReader(){
        return (jsonDataReader == null) ? new GeneralDetailsPageDataReader() : jsonDataReader;
    }
}