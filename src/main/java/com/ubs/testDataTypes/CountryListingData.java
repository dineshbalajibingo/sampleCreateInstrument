package com.ubs.testDataTypes;

public class CountryListingData {

    public String id;
    public CountryLevelDetails countryLevelDetails;
    public ListingLevelDetails listingLevelDetails;
    public Identifiers identifiers;
    public Comments comments;

    public class CountryLevelDetails{
        public String countryOfQuotation;
        public String countryOfRegistration;
        public String officalPlaceOfListing;
        public String abberviatedName;
        public String coltBook;
        public String coltID;
        public String percentageQuoteIndicator;
    }

    public class ListingLevelDetails{
        public String marketOfListing;
        public String tradingCurrency;
        public String tradingStatus;
        public String defaultCurrency;
        public String dateOfAdmission;
        public String unitAmount;
        public String roundLotSize;
        public String defaultRic;
        public String compositeMarket;
        public String defaultExchange;
        public String primaryRic;
        public String whenIssuedIndicator;
    }

    public class Identifiers{
        public String identifierType;
        public String value;
        public String startDate;
    }

    public class Comments{
        public String comments;
    }
}
