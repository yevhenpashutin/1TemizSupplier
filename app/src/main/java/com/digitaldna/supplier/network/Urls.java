package com.digitaldna.supplier.network;

/**
 * Created by yevgen on 3/13/18.
 */

public class Urls {


    public static final String HOST_URL = "https://beta-api.1temiz.com";

    public static final String SUPPLIER = "Supplier.svc";
    public static final String MEMBERSHIP = "Membership.svc";
    public static final String PROPERTY = "Property.svc";

    public static final String LOCATION = HOST_URL + "Location.svc";
    public static final String TRANSLATION = HOST_URL + "Translation.svc";

    public static final String PRODUCT = HOST_URL + "Product.svc";


    public static final String LOGIN = "Login";
    public static final String GET_VERIFICATION_CODE = "GetUserVerificationCode";
    public static final String VERIFY_USER_PHONE_NUMBER = "VerifyUserPhoneNumber";
    public static final String SET_LANGUAGE = "SetLanguage";

    public static final String GET_CANCEL_REASONS_LIST = "GetCancelReasonList";

    public static final String GET_ORDERS = "GetSupplierOrders";
    public static final String GET_ORDER_DETAILS = "GetOrderDetails";
    public static final String ACCEPT_ORDER = "AcceptOrder";
    public static final String REJECT_ORDER = "RejectOrder";

    public static final String GET_SUPPLIER_SUMMARY_INFO = "GetSupplierSummaryInfo";
    public static final String RATE_AVERAGE = "RepSupplierRateAverages";
    public static final String SUPPLIER_COMMENTS = "RepSupplierComments";
    public static final String STATISTICS = "RepSupplierSuccessRate";
    public static final String SUPPLIER_ORDERS = "RepSupplierOrders";

    public static final Integer PLATFORM = 50;
}
