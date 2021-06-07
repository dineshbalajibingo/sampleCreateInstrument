package com.ubs.testDataTypes;

public class ExtendedDetailsData {

    public String id;
    public ExtendedDetails extendedDetails;
    public CouponPaymentHistory couponPaymentHistory;
    public CouponRateHistory couponRateHistory;
    public SourceDetails sourceDetails;

    public class ExtendedDetails{
        public String issuePrice;
        public String mfBook;
        public String fisn;
        public String parAmount;
        public String cfi2015;
        public String _144aIndicator;
        public String regs144aIndicator;
        public String fiOfInterest;
        public String issueStatus;
        public String sanctionFlag;
        public String eqOfInterest;
        public String issueForm;
        public String pricingMethod;
        public String percentageQuotaIndicator;
        public String priceQuotetye;
        public String stripIndicator;
        public String principalBasis;
        public String dualCurrency;
        public String eomIndicator;
    }

    public class CouponPaymentHistory{
        public String eventType;
        public String status;
        public String currentCouponFrom;
        public String currentCouponTo;
        public String currentCouponEndDate;
        public String parValueCurrency;
    }

    public class CouponRateHistory{
        public String eventType;
        public String rate;
        public String amount;
        public String couponCurrency;
        public String startDate;
        public String endDate;
    }

    public class SourceDetails{
        public String sourceDetails;
    }

}
