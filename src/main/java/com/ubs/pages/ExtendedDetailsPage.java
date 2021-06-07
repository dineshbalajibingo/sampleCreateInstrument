package com.ubs.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.ubs.testDataTypes.ExtendedDetailsData;
import com.ubs.testDataTypes.GeneralDetailsData;

public class ExtendedDetailsPage extends WebDriverBaseTestPage<WebDriverTestPage> {


    public void fill_ExtendedDetails(ExtendedDetailsData extendedDetailsData){
        enterIssuePrice(extendedDetailsData.extendedDetails.issuePrice);
        enterMfBook(extendedDetailsData.extendedDetails.mfBook);
        enterFISN(extendedDetailsData.extendedDetails.fisn);
        enterParAmount(extendedDetailsData.extendedDetails.parAmount);
        enterCfi2015(extendedDetailsData.extendedDetails.cfi2015);
        select144AIndicator(extendedDetailsData.extendedDetails._144aIndicator);
        regs144AIndicator(extendedDetailsData.extendedDetails.regs144aIndicator);
        selectFIOfInterest(extendedDetailsData.extendedDetails.fiOfInterest);
        selectIssueStatus(extendedDetailsData.extendedDetails.issueStatus);
        selectSanctionFlag(extendedDetailsData.extendedDetails.sanctionFlag);
        selectEqOfInterest(extendedDetailsData.extendedDetails.eqOfInterest);
        selectIssueForm(extendedDetailsData.extendedDetails.issueForm);
        selectPricingMethod(extendedDetailsData.extendedDetails.pricingMethod);
        selectPercentageQuoteIndicator(extendedDetailsData.extendedDetails.percentageQuotaIndicator);
        selectPriceQuotetye(extendedDetailsData.extendedDetails.priceQuotetye);
        selectStripIndicator(extendedDetailsData.extendedDetails.stripIndicator);
        selectPrincipalBasis(extendedDetailsData.extendedDetails.principalBasis);
        selectDualCurrency(extendedDetailsData.extendedDetails.dualCurrency);
        selectEomIndicator(extendedDetailsData.extendedDetails.eomIndicator);
        /*Coupon Payment History */
        enterEventType(extendedDetailsData.couponPaymentHistory.eventType);
        selectStatus(extendedDetailsData.couponPaymentHistory.status);
        pickCurrentCouponFrom(extendedDetailsData.couponPaymentHistory.currentCouponFrom);
        pickCurrentCouponTo(extendedDetailsData.couponPaymentHistory.currentCouponTo);
        pickCurrentCouponEndDate(extendedDetailsData.couponPaymentHistory.currentCouponEndDate);
        selectParValueCurrency(extendedDetailsData.couponPaymentHistory.parValueCurrency);
        /*Coupon Rate History */
        enterCouponRateHistoryType(extendedDetailsData.couponRateHistory.eventType);
        enterRate(extendedDetailsData.couponRateHistory.rate);
        enterAmount(extendedDetailsData.couponRateHistory.amount);
        selectCouponCurrency(extendedDetailsData.couponRateHistory.couponCurrency);
        pickCouponRateHistoryStartDate(extendedDetailsData.couponRateHistory.startDate);
        pickCouponRateHistoryEndDate(extendedDetailsData.couponRateHistory.endDate);
        /*Comment Section */
        enterComment(extendedDetailsData.sourceDetails.sourceDetails);
    }
    public void enterIssuePrice(String enterIssuePrice)
    {

    }
    public void enterMfBook(String enterMfBook)
    {

    }
    public void enterFISN(String enterFISN)
    {

    }
    public void enterParAmount(String enterParAmount)
    {

    }
    public void enterCfi2015(String cfi2015)
    {

    }
    public void select144AIndicator(String select144AIndicator)
    {

    }
    public void regs144AIndicator(String regs144AIndicator)
    {

    }
    public void selectFIOfInterest(String selectFIOfInterest)
    {

    }
    public void selectIssueStatus(String selectIssueStatus)
    {

    }
    public void selectSanctionFlag(String selectSanctionFlag)
    {

    }
    public void selectEqOfInterest(String selectEqOfInterest)
    {

    }
    public void selectIssueForm(String selectIssueForm)
    {

    }
    public void selectPricingMethod(String selectPricingMethod)
    {

    }
    public void selectPercentageQuoteIndicator(String selectPercentageQuoteIndicator)
    {

    }
    public void selectPriceQuotetye(String selectPriceQuotetye)
    {

    }
    public void selectStripIndicator(String selectStripIndicator)
    {

    }
    public void selectPrincipalBasis(String selectPrincipalBasis)
    {

    }
    public void selectDualCurrency(String selectDualCurrency)
    {

    }
    public void selectEomIndicator(String selectEomIndicator)
    {

    }
    /*Coupon Payment History */
    public void enterEventType(String enterEventType)
    {

    }
    public void selectStatus(String selectStatus)
    {

    }
    public void pickCurrentCouponFrom(String pickCurrentCouponFrom)
    {

    }
    public void pickCurrentCouponTo(String pickCurrentCouponTo)
    {

    }
    public void pickCurrentCouponEndDate(String pickCurrentCouponEndDate)
    {

    }
    public void selectParValueCurrency(String selectParValueCurrency)
    {

    }
    /*Coupon Rate History */
    public void enterCouponRateHistoryType(String enterCouponRateHistoryType)
    {

    }
    public void enterRate(String enterRate)
    {

    }
    public void enterAmount(String enterAmount)
    {

    }
    public void selectCouponCurrency(String selectCouponCurrency)
    {

    }
    public void pickCouponRateHistoryStartDate(String pickCouponRateHistoryStartDate)
    {

    }
    public void pickCouponRateHistoryEndDate(String pickCouponRateHistoryEndDate)
    {

    }
    /*Comment Section */
    public void enterComment(String enterComment)
    {

    }
    @Override
    protected void openPage(PageLocator pageLocator, Object... objects) {

    }
}
