package com.ubs.testDataTypes;

public class GeneralDetailsData {

        public String id;
        public BasicDetails basicDetails;
        public IssuerDetails issuerDetails;
        public IssuerLevelDetails issuerLevelDetails;
        public Identifiers identifiers;
        public CallSchedule callSchedule;


    public class BasicDetails{
        public String productGroup;
        public String productType;
    }

    public class IssuerDetails{
        public String issuerIdentifierType;
        public String issuerIdentifierValue;
        public String issuerName;
        public String countryOfIncorporation;
        public String bloombergCompanyID;
        public String fIDB;
        public String ubsPartyID;
        public String masterfileConsol;
    }

    public class IssuerLevelDetails{
        public String instrumentName;
        public String couponType;
        public String couponRate;
        public String issueDate;
        public String maturityDate;
        public String couponFrequncy;
        public String firstSettlementDate;
        public String firstAccuralDate;
        public String firstCoupondate;
        public String penultimateCouponDate;
        public String interestAccrualBasis;
        public String tradingCurrency;
        public String currency;
        public String calculationType;
        public String defaultSettlementDays;
        public String minDemonination;
        public String minTradignAmount;
        public String amountIssued;
        public String amountOutstanding;
        public String redemptionRate;
        public String maturityType;
    }

    public class Identifiers{
        public String identifierType;
        public String value;
        public String startDate;
    }

    public class CallSchedule{
        public String callType;
        public String callStatus;
        public String rate;
        public String rateType;
        public String currency;
        public String rateBasis;
        public String amount;
        public String startDate;
        public String endDate;
    }



}
