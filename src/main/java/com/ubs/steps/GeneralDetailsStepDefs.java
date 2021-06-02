package com.ubs.steps;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.quantum.utils.ConsoleUtils;
import com.ubs.testDataTypes.GeneralDetailsData;
import com.ubs.utils.FileReaderManager;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

@QAFTestStepProvider
public class GeneralDetailsStepDefs {

    @Given("^As an \"([^\"]*)\"$")
    public void asAn(String userRole) throws Throwable {
        ConsoleUtils.logInfoBlocks("******User Role is******"+userRole);
    }

    @And("^I want to issue a bond with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iWantToIssueABondWithAnd(String productGroup, String productType) throws Throwable {
        GeneralDetailsData generalDetailsData = FileReaderManager.getInstance().getJsonReader().getGeneralDetailsDataList(productGroup,productType);
    }
}
