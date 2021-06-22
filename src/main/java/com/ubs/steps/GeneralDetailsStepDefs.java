package com.ubs.steps;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.quantum.utils.ConsoleUtils;
import com.ubs.pages.GeneralDetailsPage;
import com.ubs.testDataTypes.ExtendedDetailsData;
import com.ubs.testDataTypes.GeneralDetailsData;
import com.ubs.utils.FileReaderManager;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

@QAFTestStepProvider
public class GeneralDetailsStepDefs {

    GeneralDetailsPage generalDetailsPage = new GeneralDetailsPage();

    @Given("^As an \"([^\"]*)\"$")
    public void asAn(String userRole) throws Throwable {
        ConsoleUtils.logInfoBlocks("******User Role is******"+userRole);
    }

    @And("^I want to issue a bond with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iWantToIssueABondWithAnd(String productGroup, String productType) throws Throwable {
        GeneralDetailsData generalDetailsData = FileReaderManager.getInstance().getJsonReader().getGeneralDetailsDataList(productGroup,productType);
        generalDetailsPage.fill_PersonalDetails_GeneralDetails(generalDetailsData);
        //Filling Negative Values

    }

    @Given("^I am on github login page$")
    public void iAmOnGithubLoginPage() {
        //new WebDriverTestBase().getDriver().get("https://www.google.com/");
        ConsoleUtils.logInfoBlocks("Hello");
    }

    @And("^I enter usernames and passwords$")
    public void iEnterUsernamesAndPasswords(DataTable table) {
        {
            System.out.println("*************************"+table);
        }
    }


    @Given("^I want to enter below \"([^\"]*)\"$")
    public void iWantToEnterBelow(String dateValue) throws Throwable {
        generalDetailsPage.enterDates(dateValue);

    }

    @And("^I want to validate rule order$")
    public void iWantToValidateRule() {

    }

    @Given("^as a valid user in DB$")
    public void asAValidUserInDB() {
        
    }

    @When("^rule is validated$")
    public void ruleIsValidated() {
        
    }

   @And("^I want to validate rule order:$")
    public void iWantToValidateRuleOrder(List<String> rule) {

        System.out.println("*************" + rule);
        if(rule.get(1).equalsIgnoreCase("rule1"))
        {
            System.out.println("*************" + rule.get(1) + " is Printed");
            return;

        }
       if(rule.get(1).equalsIgnoreCase("rule2"))
       {
           System.out.println("*************" + rule.get(1) + " is Printed");
       }

    }




/*    @And("^I want to validate rule order:$")
    public void iWantToValidateRuleOrder(Object[] objArray0) {

        System.out.println("*************" + objArray0.length);

    }*/

    @Then("^values in DB are verified$")
    public void valuesInDBAreVerified() {
    }

    @And("^then I click on login in page$")
    public void thenIClickOnLoginInPage() {
    }
}
