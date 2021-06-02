package com.ubs.pages;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.quantum.utils.ConsoleUtils;
import com.ubs.testDataTypes.GeneralDetailsData;
import org.openqa.selenium.support.ui.Select;

public class GeneralDetailsPage extends WebDriverBaseTestPage<WebDriverTestPage> {

    /************************Web Elements for Basic Details Section*************************/
    @FindBy(locator = "basicDetails.productGroup")
    private QAFExtendedWebElement selectProductGroup;

    @FindBy(locator = "basicDetails.productType")
    private QAFExtendedWebElement selectProductType;

    /************************Web Elements for Issuer Details Section*************************/
    @FindBy(locator = "issuerDetails.issuerIdentifierType")
    private QAFExtendedWebElement selectIssuerIdentifierType;

    @FindBy(locator = "issuerDetails.issuerIdentifierValue")
    private QAFExtendedWebElement enterIssuerIdentifierValue;

    @FindBy(locator = "issuerDetails.issuerName")
    private QAFExtendedWebElement enterIssuerName;

    @FindBy(locator = "issuerDetails.countryOfIncorporation")
    private QAFExtendedWebElement enterCountryOfIncorporation;

    @FindBy(locator = "issuerDetails.bloombergCompanyID")
    private QAFExtendedWebElement enterBloombergCompanyID;

    @FindBy(locator = "issuerDetails.fIDB")
    private QAFExtendedWebElement enterFIDB;

    @FindBy(locator = "issuerDetails.ubsPartyID")
    private QAFExtendedWebElement enterUbsPartyID;

    @FindBy(locator = "issuerDetails.masterfileConsol")
    private QAFExtendedWebElement enterMasterfileConsol;

    /************************Web Elements for  Issuer Level Details Section*************************/

    @FindBy(locator = "issuerLevelDetails.instrumentName")
    private QAFExtendedWebElement enterInstrumentName;

    @FindBy(locator = "issuerLevelDetails.couponType")
    private QAFExtendedWebElement enterCouponType;

    @FindBy(locator = "issuerLevelDetails.couponRate")
    private QAFExtendedWebElement enterCouponRate;

    @FindBy(locator = "issuerLevelDetails.issueDate")
    private QAFExtendedWebElement enterIssueDate;

    @FindBy(locator = "issuerLevelDetails.maturityDate")
    private QAFExtendedWebElement picktMaturityDate;

    @FindBy(locator = "issuerLevelDetails.couponFrequncy")
    private QAFExtendedWebElement selectCouponFrequncy;

    @FindBy(locator = "issuerLevelDetails.firstSettlementDate")
    private QAFExtendedWebElement pickFirstSettlementDate;

    @FindBy(locator = "issuerLevelDetails.firstAccuralDate")
    private QAFExtendedWebElement pickFirstAccuralDate;

    @FindBy(locator = "issuerLevelDetails.firstCoupondate")
    private QAFExtendedWebElement pickFirstCoupondate;

    @FindBy(locator = "issuerLevelDetails.penultimateCouponDate")
    private QAFExtendedWebElement pickPenultimateCouponDate;

    @FindBy(locator = "issuerLevelDetails.interestAccrualBasis")
    private QAFExtendedWebElement pickInterestAccrualBasis;

    @FindBy(locator = "issuerLevelDetails.tradingCurrency")
    private QAFExtendedWebElement selectTradingCurrency;

    @FindBy(locator = "issuerLevelDetails.currency")
    private QAFExtendedWebElement selectIssuerLevelDetailsCurrency;

    @FindBy(locator = "issuerLevelDetails.calculationType")
    private QAFExtendedWebElement selectCalculationType;

    @FindBy(locator = "issuerLevelDetails.defaultSettlementDays")
    private QAFExtendedWebElement pickDefaultSettlementDays;

    @FindBy(locator = "issuerLevelDetails.minDemonination")
    private QAFExtendedWebElement enterMinDemonination;

    @FindBy(locator = "issuerLevelDetails.minTradignAmount")
    private QAFExtendedWebElement enterMinTradignAmount;

    @FindBy(locator = "issuerLevelDetails.amountIssued")
    private QAFExtendedWebElement enterAmountIssued;

    @FindBy(locator = "issuerLevelDetails.amountOutstanding")
    private QAFExtendedWebElement enterAmountOutstanding;

    @FindBy(locator = "issuerLevelDetails.redemptionRate")
    private QAFExtendedWebElement enterRedemptionRate;

    @FindBy(locator = "issuerLevelDetails.maturityType")
    private QAFExtendedWebElement enterMaturityType;


    /************************Web Elements for Identifiers Section*************************/

    @FindBy(locator = "identifiers.identifierType")
    private QAFExtendedWebElement selectIdentifierType;

    @FindBy(locator = "identifiers.value")
    private QAFExtendedWebElement enterValue;

    @FindBy(locator = "identifiers.startDate")
    private QAFExtendedWebElement pickIdentifiersStartDate;

    /************************Web Elements for CallSchedule Section*************************/
    @FindBy(locator = "callSchedule.callType")
    private QAFExtendedWebElement selectCallType;

    @FindBy(locator = "callSchedule.callStatus")
    private QAFExtendedWebElement selectCallStatus;

    @FindBy(locator = "callSchedule.rate")
    private QAFExtendedWebElement enterRate;

    @FindBy(locator = "callSchedule.rateType")
    private QAFExtendedWebElement selectRateType;

    @FindBy(locator = "callSchedule.currency")
    private QAFExtendedWebElement selectCallScheduleCurrency;

    @FindBy(locator = "callSchedule.rateBasis")
    private QAFExtendedWebElement selectRateBasis;

    @FindBy(locator = "callSchedule.amount")
    private QAFExtendedWebElement enterAmount;

    @FindBy(locator = "callSchedule.startDate")
    private QAFExtendedWebElement pickCallScheduleStartDate;

    @FindBy(locator = "callSchedule.endDate")
    private QAFExtendedWebElement pickCallScheduleEndDate;

    /************************End of web element Section*************************/

    public void fill_PersonalDetails_GeneralDetails(GeneralDetailsData generalDetailsData){
        /*******Filling Basic Details Section********/
        selectProductGroup(generalDetailsData.basicDetails.productGroup);
        selectProductType(generalDetailsData.basicDetails.productType);
        /*******Filling Issuer Details Section********/
        selectIssuerIdentifierType(generalDetailsData.issuerDetails.issuerIdentifierType);
        selectIssuerIdentifierType(generalDetailsData.issuerDetails.issuerIdentifierValue);
        selectIssuerIdentifierType(generalDetailsData.issuerDetails.issuerName);
        selectIssuerIdentifierType(generalDetailsData.issuerDetails.countryOfIncorporation);
        selectIssuerIdentifierType(generalDetailsData.issuerDetails.bloombergCompanyID);
        selectIssuerIdentifierType(generalDetailsData.issuerDetails.fIDB);
        selectIssuerIdentifierType(generalDetailsData.issuerDetails.ubsPartyID);
        selectIssuerIdentifierType(generalDetailsData.issuerDetails.masterfileConsol);
        /*******Filling Issuer Level Details Section********/
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.instrumentName);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.couponType);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.couponRate);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.issueDate);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.maturityDate);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.couponFrequncy);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.firstSettlementDate);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.firstAccuralDate);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.firstCoupondate);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.penultimateCouponDate);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.interestAccrualBasis);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.tradingCurrency);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.currency);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.calculationType);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.defaultSettlementDays);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.minDemonination);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.minTradignAmount);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.amountIssued);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.amountOutstanding);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.redemptionRate);
        selectIssuerIdentifierType(generalDetailsData.issuerLevelDetails.maturityType);
        /*******Filling Identifiers Sectionn********/
        selectIssuerIdentifierType(generalDetailsData.identifiers.identifierType);
        selectIssuerIdentifierType(generalDetailsData.identifiers.value);
        selectIssuerIdentifierType(generalDetailsData.identifiers.startDate);
        /*******Filling Call Schedule Sectionn********/
        selectIssuerIdentifierType(generalDetailsData.callSchedule.callType);
        selectIssuerIdentifierType(generalDetailsData.callSchedule.callStatus);
        selectIssuerIdentifierType(generalDetailsData.callSchedule.rate);
        selectIssuerIdentifierType(generalDetailsData.callSchedule.rateType);
        selectIssuerIdentifierType(generalDetailsData.callSchedule.currency);
        selectIssuerIdentifierType(generalDetailsData.callSchedule.rateBasis);
        selectIssuerIdentifierType(generalDetailsData.callSchedule.amount);
        selectIssuerIdentifierType(generalDetailsData.callSchedule.startDate);
        selectIssuerIdentifierType(generalDetailsData.callSchedule.endDate);
        /*******Logs********/
        ConsoleUtils.logInfoBlocks(generalDetailsData.basicDetails.productGroup);
        ConsoleUtils.logInfoBlocks(generalDetailsData.issuerDetails.issuerName);
        ConsoleUtils.logInfoBlocks(generalDetailsData.issuerLevelDetails.couponType);
        ConsoleUtils.logInfoBlocks(generalDetailsData.identifiers.value);
        ConsoleUtils.logInfoBlocks(generalDetailsData.callSchedule.callStatus);

    }
    /************************Implentation Methods for Basic Details Section*************************/

    public void selectProductGroup(String productGroup){
        Select selectData = new Select(selectProductGroup);
        selectData.selectByValue(productGroup);
   }

    public void selectProductType(String productType){
        Select selectData = new Select(selectProductType);
        selectData.selectByValue(productType);
    }
    /************************Implentation Methods for Issuer Details Section*************************/
    public void selectIssuerIdentifierType(String issuerIdentifierType){
        Select selectData = new Select(selectIssuerIdentifierType);
        selectData.selectByValue(issuerIdentifierType);
    }

    public void enterIssuerIdentifierValue(String issuerIdentifierValue){
        enterIssuerIdentifierValue.sendKeys(issuerIdentifierValue);
    }

    public void enterIssuerName(String issuerName){
        enterIssuerName.sendKeys(issuerName);
    }

    public void enterCountryOfIncorporation(String countryOfIncorporation){
        enterCountryOfIncorporation.sendKeys(countryOfIncorporation);
    }

    public void enterBloombergCompanyID(String bloombergCompanyID){
        enterBloombergCompanyID.sendKeys(bloombergCompanyID);
    }

    public void enterFIDB(String FIDB){
        enterFIDB.sendKeys(FIDB);
    }

    public void enterUbsPartyID(String ubsPartyID){
        enterUbsPartyID.sendKeys(ubsPartyID);
    }

    public void enterMasterfileConsol(String masterfileConsol){
        enterMasterfileConsol.sendKeys(masterfileConsol);
    }
    /************************Implentation Methods for  Issuer Level Details Section*************************/

    public void enterInstrumentName(String instrumentName){
        enterInstrumentName.sendKeys(instrumentName);
    }

    public void enterCouponType(String couponType){
        enterCouponType.sendKeys(couponType);
    }

    public void enterCouponRate(String couponRate){
        enterCouponRate.sendKeys(couponRate);
    }

    public void enterIssueDate(String issueDate){
        enterIssueDate.sendKeys(issueDate);
    }


    public void picktMaturityDate(String maturityDate){
        Select selectData = new Select(picktMaturityDate);
        selectData.selectByValue(maturityDate);
    }

    public void selectCouponFrequncy(String couponFrequncy){
        Select selectData = new Select(selectCouponFrequncy);
        selectData.selectByValue(couponFrequncy);
    }

    public void pickFirstSettlementDate(String firstSettlementDate){
        Select selectData = new Select(pickFirstSettlementDate);
        selectData.selectByValue(firstSettlementDate);
    }

    public void pickFirstAccuralDate(String firstAccuralDate){
        Select selectData = new Select(pickFirstAccuralDate);
        selectData.selectByValue(firstAccuralDate);
    }


    public void pickFirstCoupondate(String firstCoupondate){
        Select selectData = new Select(pickFirstCoupondate);
        selectData.selectByValue(firstCoupondate);
    }

    public void pickPenultimateCouponDate(String penultimateCouponDate){
        Select selectData = new Select(pickPenultimateCouponDate);
        selectData.selectByValue(penultimateCouponDate);
    }

    public void pickInterestAccrualBasis(String interestAccrualBasis){
        Select selectData = new Select(pickInterestAccrualBasis);
        selectData.selectByValue(interestAccrualBasis);
    }

    public void selectTradingCurrency(String tradingCurrency){
        Select selectData = new Select(selectTradingCurrency);
        selectData.selectByValue(tradingCurrency);
    }

    public void selectIssuerLevelDetailsCurrency(String currency){
        Select selectData = new Select(selectIssuerLevelDetailsCurrency);
        selectData.selectByValue(currency);
    }

    public void selectCalculationType(String calculationType){
        Select selectData = new Select(selectCalculationType);
        selectData.selectByValue(calculationType);
    }

    public void pickDefaultSettlementDays(String defaultSettlementDays){
        Select selectData = new Select(pickDefaultSettlementDays);
        selectData.selectByValue(defaultSettlementDays);
    }

    public void enterMinDemonination(String minDemonination){
        enterMinDemonination.sendKeys(minDemonination);
    }

    public void enterMinTradignAmount(String minTradignAmount){
        enterMinTradignAmount.sendKeys(minTradignAmount);
    }

    public void enterAmountIssued(String amountIssued){
        enterAmountIssued.sendKeys(amountIssued);
    }

    public void enterAmountOutstanding(String amountOutstanding){
        enterAmountOutstanding.sendKeys(amountOutstanding);
    }

    public void enterRedemptionRate(String redemptionRate){
        enterRedemptionRate.sendKeys(redemptionRate);
    }

    public void enterMaturityType(String maturityType){
        enterMaturityType.sendKeys(maturityType);
    }

    /************************Implentation Methods for Identifiers Section*************************/

    public void selectIdentifierType(String identifierType){
        Select selectData = new Select(selectIdentifierType);
        selectData.selectByValue(identifierType);
    }

    public void enterValue(String value){
        enterValue.sendKeys(value);
    }

    public void pickIdentifiersStartDate(String startDate){
        Select selectData = new Select(pickIdentifiersStartDate);
        selectData.selectByValue(startDate);
    }
    /************************Implentation Methods for CallSchedule Section*************************/

    public void selectCallType(String callType){
        Select selectData = new Select(selectCallType);
        selectData.selectByValue(callType);
    }

    public void selectCallStatus(String callStatus){
        Select selectData = new Select(selectCallStatus);
        selectData.selectByValue(callStatus);
    }

    public void enterRate(String rate){
        enterRate.sendKeys(rate);
    }

    public void selectRateType(String rateType){
        Select selectData = new Select(selectRateType);
        selectData.selectByValue(rateType);
    }

    public void selectCallScheduleCurrency(String currency){
        Select selectData = new Select(selectCallScheduleCurrency);
        selectData.selectByValue(currency);
    }

    public void selectRateBasis(String rateBasis){
        Select selectData = new Select(selectRateBasis);
        selectData.selectByValue(rateBasis);
    }

    public void enterAmount(String amount){
        enterAmount.sendKeys(amount);
    }

    public void pickCallScheduleStartDate(String startDate){
        Select selectData = new Select(pickCallScheduleStartDate);
        selectData.selectByValue(startDate);
    }

    public void pickCallScheduleEndDate(String endDate){
        Select selectData = new Select(pickCallScheduleEndDate);
        selectData.selectByValue(endDate);
    }


    @Override
    protected void openPage(PageLocator pageLocator, Object... objects) {

    }


}
