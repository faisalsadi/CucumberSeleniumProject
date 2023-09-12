package org.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("first_name")
    @Expose
    public String firstName;
    @SerializedName("last_name")
    @Expose
    public String lastName;
    @SerializedName("email")
    @Expose
    public String email;
    @SerializedName("token")
    @Expose
    public String token;
    @SerializedName("user_id")
    @Expose
    public String userId;
    @SerializedName("meta")
    @Expose
    public Object meta;
    @SerializedName("store_id")
    @Expose
    public String storeId;
    @SerializedName("locale")
    @Expose
    public Object locale;
    @SerializedName("identity_card")
    @Expose
    public String identityCard;
    @SerializedName("accounting_card_id")
    @Expose
    public Object accountingCardId;
    @SerializedName("business")
    @Expose
    public Integer business;
    @SerializedName("birth_date")
    @Expose
    public Object birthDate;
    @SerializedName("phone")
    @Expose
    public Object phone;
    @SerializedName("additional_phone")
    @Expose
    public Object additionalPhone;
    @SerializedName("sex_id")
    @Expose
    public Object sexId;
    @SerializedName("edit_order")
    @Expose
    public Object editOrder;
    @SerializedName("send_email")
    @Expose
    public Integer sendEmail;
    @SerializedName("send_sms")
    @Expose
    public Integer sendSms;
    @SerializedName("subscribe_at")
    @Expose
    public String subscribeAt;
    @SerializedName("subscribe_ip")
    @Expose
    public String subscribeIp;
    @SerializedName("club_accept_at")
    @Expose
    public String clubAcceptAt;
    @SerializedName("club_accept_ip")
    @Expose
    public String clubAcceptIp;
    @SerializedName("club_accept")
    @Expose
    public Integer clubAccept;
    @SerializedName("send_club_database")
    @Expose
    public Integer sendClubDatabase;
    @SerializedName("disabled_at")
    @Expose
    public Object disabledAt;
    @SerializedName("activated_at")
    @Expose
    public Object activatedAt;
    @SerializedName("deleted_at")
    @Expose
    public Object deletedAt;
    @SerializedName("area_id")
    @Expose
    public Integer areaId;
    @SerializedName("deactivated_at")
    @Expose
    public Object deactivatedAt;
    @SerializedName("customer_id_club")
    @Expose
    public Object customerIdClub;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("orders")
    @Expose
    public List<Object> orders;
    @SerializedName("cards")
    @Expose
    public List<Object> cards;
    @SerializedName("addresses")
    @Expose
    public List<Object> addresses;
    @SerializedName("popularProducts")
    @Expose
    public String popularProducts;
    @SerializedName("features")
    @Expose
    public List<Object> features;
    @SerializedName("coupons")
    @Expose
    public List<Object> coupons;

}
