package com.ubs.pages;


import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.keys.ApplicationProperties;
import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.util.PropertyUtil;
import com.qmetry.qaf.automation.ws.rest.RestTestBase;
import com.quantum.utils.ReportUtils;
import cucumber.api.DataTable;


public class GooglePage extends WebDriverBaseTestPage<WebDriverTestPage> {

	PropertyUtil props = ConfigurationManager.getBundle();
	private final String serviceUrl = ApplicationProperties.INTEGRATION_PARAM_QMETRY_SERVICE_URL.getStringVal();
	@Override
	protected void openPage(PageLocator locator, Object... args) {

	}

	@FindBy(locator = "search.text.box")
	private QAFExtendedWebElement searchTextBox;
	@FindBy(locator = "search.option")
	private QAFExtendedWebElement searchOption;
	@FindBy(locator = "search.result.link")
	private QAFExtendedWebElement searchResultLink;

	@FindBy(locator = "git.un")
	private QAFExtendedWebElement gitUN;
	@FindBy(locator = "git.pw")
	private QAFExtendedWebElement gitPW;


	public void search(String searchKey) {
		searchTextBox.clear();
		searchTextBox.sendKeys(searchKey);
		// The following element is an example of creating run time objects on the fly
		QAFExtendedWebElement search = new QAFExtendedWebElement(String.format(props.getString("search.option"), searchKey));
		search.click();
	}

	public void verifyResult(String result) {
		QAFExtendedWebElement searchResult = new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("search.result.link"), result));
		//ReportUtils.logAssert("Expected result: " + result, searchResult.isDisplayed());
		CommonStep.verifyLinkWithPartialTextPresent(result);

	}

	public void verifyResult(List<String> results) {
		QAFExtendedWebElement searchResultElement;
		for (String result : results) {
			QAFExtendedWebElement searchResult = new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("search.result.link"), result));
			//ReportUtils.logAssert("Expected result: " + result, searchResult.isDisplayed());
			searchResult.assertVisible();
			//CommonStep.assertVisible(searchResult);
		}
	}

	public void enterCred(List<Map<Object,Object>> dataList) {
		String un="";
		String pw="";
		for (Map<Object, Object> dataMap : dataList) {
			for (Map.Entry<Object, Object> entry : dataMap.entrySet()) {
				System.out.println(entry.getKey().toString() + "*************" + entry.getValue().toString());
				 un = entry.getKey().toString();

			}
			gitUN.sendKeys(un);
			System.out.println("Value Entered for UN*********************");
			gitPW.sendKeys(pw);


		}
	}
	public void enterGitCred(String un, String pw)
	{
		gitUN.sendKeys(un);
		System.out.println("Value Entered for UN*********************");
		gitPW.sendKeys(pw);
	}


	public void sampleTest(String data)
	{

	}
}
