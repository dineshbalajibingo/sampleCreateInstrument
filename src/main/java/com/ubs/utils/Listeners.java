package com.ubs.utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Listeners {

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite will always execute at last when all the annotations or test in the suite have run.");
        //tell that test data is udpated
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite will always execute prior to all annotations or tests in the suite.");
    }
}
