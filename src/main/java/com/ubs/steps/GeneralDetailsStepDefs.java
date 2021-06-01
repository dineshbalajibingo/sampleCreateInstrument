package com.ubs.steps;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.quantum.utils.ConsoleUtils;
import com.ubs.pages.GeneralDetailsPage;
import com.ubs.pages.GooglePage;
import com.ubs.testDataTypes.GeneralDetailsData;
import com.ubs.utils.FileReaderManager;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@QAFTestStepProvider
public class GeneralDetailsStepDefs {

    GeneralDetailsPage GeneralDetailsPage = new GeneralDetailsPage();

    @Given("^As a \"([^\"]*)\"$")
    public void As_a(String userRole) throws Throwable {
        ConsoleUtils.logInfoBlocks("******User Role is******"+userRole);
    }

    @And("^I want to issue a bond with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iWantToIssueABondWithAnd(String productGroup, String productType) throws Throwable {
        ConfigurationManager.getBundle().setProperty("testDatajsonFile", "GeneralDetailsData");
        GeneralDetailsData generalDetailsData = FileReaderManager.getInstance().getJsonReader().getGeneralDetailsDataList(productGroup,productType);
    }

    @When("^I enter the \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterTheAnd(String generalDetails, String extendedDetails, String countryDetails) throws Throwable {

    }

    @And("^submit the details after confirmation$")
    public void submitTheDetailsAfterConfirmation() {

    }

    @Then("^Instrument is created$")
    public void instrumentIsCreated() {

    }


}
