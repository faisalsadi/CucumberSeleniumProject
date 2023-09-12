package org.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginResponse {

    @SerializedName("user")
    @Expose
    public User user;
    @SerializedName("deliveryTimesCustomer")
    @Expose
    public DeliveryTimesCustomer deliveryTimesCustomer;
    @SerializedName("orderTokens")
    @Expose
    public List<Object> orderTokens;
    @SerializedName("order")
    @Expose
    public Object order;
    @SerializedName("cart")
    @Expose
    public Object cart;
    @SerializedName("shopLists")
    @Expose
    public List<Object> shopLists;

}
