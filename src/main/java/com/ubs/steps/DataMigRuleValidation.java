package com.ubs.steps;

import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.ubs.pages.DataMigrationPage;
import com.ubs.utils.CsvReader;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;
import java.util.Map;

@QAFTestStepProvider
public class DataMigRuleValidation {

    @Then("^values in DB are verified$")
    public void valuesInDBAreVerified() {
    }

    @Given("^user has the input file in raw zone with following data$")
    public void userHasTheInputFileInRawZoneWithFollowingData(Map<String, String> hm) throws IOException {
        System.out.println("************"+hm);

       /*if(DataMigrationPage.validateFilePresent())
        {
            DataMigrationPage.updateTestData();
        }else{
            CsvReader.createTestDataTemplate();
            DataMigrationPage.updateTestData();

        }*/
    }

    @And("^file is placed in \"([^\"]*)\" for processing$")
    public void fileIsPlacedInForProcessing(String arg0) throws Throwable {

    }

    @And("^pipeline job is executed \"([^\"]*)\"$")
    public void pipelineJobIsExecuted(String arg0) throws Throwable {

    }

    @When("^I look for Instrument table populated in \"([^\"]*)\"$")
    public void iLookForInstrumentTablePopulatedIn(String arg0) throws Throwable {

    }

    @Then("^the table should have following values for idBbUnique \"([^\"]*)\"$")
    public void theTableShouldHaveFollowingValuesForIdBbUnique(String arg0) throws Throwable {

    }
}
