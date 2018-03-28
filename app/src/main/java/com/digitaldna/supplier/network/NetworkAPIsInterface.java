package com.digitaldna.supplier.network;


import com.digitaldna.supplier.network.beans.GetLoginBean;
import com.digitaldna.supplier.network.beans.GetOrderDetailsBean;
import com.digitaldna.supplier.network.beans.GetOrdersBean;
import com.digitaldna.supplier.network.beans.GetSupplierSummaryBean;
import com.digitaldna.supplier.network.requests.GetOrderDetailsRequest;
import com.digitaldna.supplier.network.requests.LoginRequest;
import com.digitaldna.supplier.network.requests.BasicRequest;

import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/*
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;*/

public interface NetworkAPIsInterface {

    /**
     * Authorize with ticket
     * http://apidocs.1temiz.com/Method/Index/136
     * Api #50.2
     */

    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST(Urls.SUPPLIER +  "/" + Urls.LOGIN)
    Observable<GetLoginBean> login(@NonNull @Body LoginRequest body);

    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST(Urls.SUPPLIER +  "/" + Urls.GET_ORDERS)
    Observable<GetOrdersBean> getSupplierOrders(@NonNull @Body BasicRequest body);

    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST(Urls.SUPPLIER +  "/" + Urls.GET_ORDER_DETAILS)
    Observable<GetOrderDetailsBean> getOrderDetails(@NonNull @Body GetOrderDetailsRequest body);

    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST(Urls.SUPPLIER +  "/" + Urls.GET_SUPPLIER_SUMMARY_INFO)
    Observable<GetSupplierSummaryBean> getSummary(@NonNull @Body BasicRequest body);
}
