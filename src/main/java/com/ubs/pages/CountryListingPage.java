package com.ubs.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.ubs.testDataTypes.CountryListingData;

public class CountryListingPage extends WebDriverBaseTestPage<WebDriverTestPage> {

    public void fill_CountryListingPageDetails(CountryListingData countryListingData) {
        selectCountryOfQuotation(countryListingData.countryLevelDetails.countryOfQuotation);
        selectCountryOfRegistration(countryListingData.countryLevelDetails.countryOfRegistration);
        selectOfficialPlaceOfListing(countryListingData.countryLevelDetails.officalPlaceOfListing);
        enterAbbreviatedName(countryListingData.countryLevelDetails.abberviatedName);
        enterCOLTBook(countryListingData.countryLevelDetails.coltBook);
        enterCOLTID(countryListingData.countryLevelDetails.coltID);
        selectPercentageQuoteIndicator(countryListingData.countryLevelDetails.percentageQuoteIndicator);
        /* Listing Level Details*/
        selectMarketOfListing(countryListingData.listingLevelDetails.marketOfListing);
        selectTradingCurrency(countryListingData.listingLevelDetails.tradingCurrency);
        selectCountryOfTradingStatus(countryListingData.listingLevelDetails.tradingStatus);
        selectCountryOfDefaultCurrency(countryListingData.listingLevelDetails.defaultCurrency);
        selectDateOfAdmission(countryListingData.listingLevelDetails.dateOfAdmission);
        enterUnitAmount(countryListingData.listingLevelDetails.unitAmount);
        enterRoundLotSize(countryListingData.listingLevelDetails.roundLotSize);
        selectDefaultRic(countryListingData.listingLevelDetails.defaultRic);
        selectCompositeMarket(countryListingData.listingLevelDetails.compositeMarket);
        selectPrimaryRic(countryListingData.listingLevelDetails.primaryRic);
        selectWhenIssuedIndicator(countryListingData.listingLevelDetails.whenIssuedIndicator);
        /* Listing Level Details*/
        selectIdentifierType(countryListingData.identifiers.identifierType);
        enterValue(countryListingData.identifiers.value);
        pickStartDate(countryListingData.identifiers.startDate);
        enterComments(countryListingData.comments.comments);

    }
    public void selectCountryOfQuotation(String selectCountryOfQuotation)
    {

    }
    public void selectCountryOfRegistration(String selectCountryOfRegistration)
    {

    }
    public void selectOfficialPlaceOfListing(String selectOfficialPlaceOfListing)
    {

    }
    public void enterAbbreviatedName(String enterAbbreviatedName)
    {

    }
    public void enterCOLTBook(String enterCOLTBook)
    {

    }
    public void enterCOLTID(String enterCOLTID)
    {

    }
    public void selectPercentageQuoteIndicator(String selectPercentageQuoteIndicator)
    {

    }
    /* Listing Level Details*/

    public void selectMarketOfListing(String selectMarketOfListing)
    {

    }
    public void selectTradingCurrency(String selectTradingCurrency)
    {

    }
    public void selectCountryOfTradingStatus(String selectCountryOfTradingStatus)
    {

    }
    public void selectCountryOfDefaultCurrency(String selectCountryOfDefaultCurrency)
    {

    }
    public void selectDateOfAdmission(String selectDateOfAdmission)
    {

    }
    public void enterUnitAmount(String enterUnitAmount)
    {

    }
    public void enterRoundLotSize(String enterRoundLotSize)
    {

    }
    public void selectDefaultRic(String selectDefaultRic)
    {

    }
    public void selectCompositeMarket(String selectCompositeMarket)
    {

    }
    public void selectPrimaryRic(String selectPrimaryRic)
    {

    }
    public void selectWhenIssuedIndicator(String selectWhenIssuedIndicator)
    {

    }
    /* Listing Level Details*/
    public void selectIdentifierType(String selectIdentifierType)
    {

    }
    public void enterValue(String enterValue)
    {

    }
    public void pickStartDate(String pickStartDate)
    {

    }
    public void enterComments(String enterComments)
    {

    }
    @Override
    protected void openPage(PageLocator pageLocator, Object... objects) {

    }
}
