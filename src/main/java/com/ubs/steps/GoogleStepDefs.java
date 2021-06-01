package com.ubs.steps;

import java.util.List;
import java.util.Map;

import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.ubs.pages.GooglePage;
import com.quantum.utils.ConfigurationUtils;
import com.quantum.utils.ConsoleUtils;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@QAFTestStepProvider
public class GoogleStepDefs {

	GooglePage googlePage = new GooglePage();

	@Given("^I am on Google Search Page$")
	public void I_am_on_Google_Search_Page() throws Throwable {
		String url = ConfigurationUtils.getBaseBundle().getPropertyValue("env.baseurl");
		new WebDriverTestBase().getDriver().get(url);
	}

	@When("^I search for \"([^\"]*)\"$")
	public void I_search_for(String searchKey) throws Throwable {
		googlePage.search(searchKey);
	}

	@Then("^it should have \"([^\"]*)\" in search results$")
	public void it_should_have_in_search_results(String result) throws Throwable {
		googlePage.verifyResult(result);
	}

	@Then("^it should have following search results:$")
	public void it_should_have_all_in_search_results(List<String> results) {
		ConsoleUtils.logInfoBlocks("Result is " + results);
		googlePage.verifyResult(results);
	}


	@Given("^I am on github login page$")
	public void iAmOnGithubLoginPage() {
		String url = ConfigurationUtils.getBaseBundle().getPropertyValue("env.gitURL");
		new WebDriverTestBase().getDriver().get(url);
	}


	@And("^I enter the UN and PW:$")
	public void iEnterTheUNAndPW(List<Map<Object, Object>> dataList) {
		googlePage.enterCred(dataList);
	}

	@And("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void iEnterAnd(Map <String, String> data) throws Throwable {
			//System.out.println("*************************))))))))))))))))))))))"+ un);
		System.out.println("*************************))))))))))))))))))))))"+ data.get("username") + data.get("password"));
		//enterValue(data.get("username"),data.get("password"));
	}

	public void enterValue(String a, String b)
	{
		googlePage.enterGitCred(a,b);
	}

	@And("^I enter un and password$")
	public void iEnterUnAndPassword(Map <String, String> data) {
		System.out.println("*************************))))))))))))))))))))))");
		//doLogin(data.get("Username"),data.get("password"));
		//System.out.println("*************************))))))))))))))))))))))"+ data.get("username") + data.get("password"));
	}


	@And("^I enter usernames and passwords$")
	public void iEnterUsernamesAndPasswords(String un, String pw) {
		System.out.println("*************************"+ un);

	}


}
