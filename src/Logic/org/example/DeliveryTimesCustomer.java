package org.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeliveryTimesCustomer {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("customer_id")
    @Expose
    public Integer customerId;
    @SerializedName("order_id")
    @Expose
    public Object orderId;
    @SerializedName("strip_id")
    @Expose
    public Integer stripId;
    @SerializedName("address")
    @Expose
    public Address address;
    @SerializedName("hour")
    @Expose
    public String hour;
    @SerializedName("supply_date")
    @Expose
    public String supplyDate;
    @SerializedName("supply_date_no_time")
    @Expose
    public String supplyDateNoTime;
    @SerializedName("order_until_hour")
    @Expose
    public String orderUntilHour;
    @SerializedName("expires_at")
    @Expose
    public Object expiresAt;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("price")
    @Expose
    public Double price;
    @SerializedName("area_id")
    @Expose
    public String areaId;
    @SerializedName("store_id")
    @Expose
    public String storeId;
    @SerializedName("deleted_at")
    @Expose
    public Object deletedAt;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("updated_at")
    @Expose
    public String updatedAt;

}
