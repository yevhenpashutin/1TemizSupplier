package com.digitaldna.supplier.network.beans;


import android.support.annotation.Keep;

import com.digitaldna.supplier.network.beans.base.BaseJsonDataBean;
import com.digitaldna.supplier.network.deserializer.BeanDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = GetSupplierSummaryBean.Deserializer.class)
public class GetSupplierSummaryBean extends BaseJsonDataBean<SupplierSummaryBean> {
    @Keep
    public GetSupplierSummaryBean() {
    }

    public static final class Deserializer extends BeanDeserializer<SupplierSummaryBean> {
        public Deserializer() {
            super(GetSupplierSummaryBean.class, SupplierSummaryBean.class);
        }
    }

}
