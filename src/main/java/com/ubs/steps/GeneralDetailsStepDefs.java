package com.ubs.steps;

import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.ubs.pages.GeneralDetailsPage;
import com.ubs.pages.GooglePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@QAFTestStepProvider
public class GeneralDetailsStepDefs {

    GeneralDetailsPage GeneralDetailsPage = new GeneralDetailsPage();

    @Given("^As a <\"([^\"]*)\">$")
    public void asA(String user) throws Throwable {

    }

    @And("^I want to issue a bind with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iWantToIssueABindWithAnd(String arg0, String arg1) throws Throwable {

    }

    @When("^I enter the \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterTheAnd(String arg0, String arg1, String arg2) throws Throwable {

    }

    @And("^submit the details after confirmation$")
    public void submitTheDetailsAfterConfirmation() {

    }

    @Then("^Instrument is created$")
    public void instrumentIsCreated() {

    }
}
