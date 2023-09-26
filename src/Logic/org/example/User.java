package org.example;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@Data

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "first_name",
        "last_name",
        "email",
        "token",
        "user_id",
        "meta",
        "store_id",
        "locale",
        "identity_card",
        "accounting_card_id",
        "business",
        "birth_date",
        "phone",
        "additional_phone",
        "sex_id",
        "edit_order",
        "send_email",
        "send_sms",
        "subscribe_at",
        "subscribe_ip",
        "club_accept_at",
        "club_accept_ip",
        "club_accept",
        "send_club_database",
        "disabled_at",
        "activated_at",
        "deleted_at",
        "area_id",
        "deactivated_at",
        "customer_id_club",
        "name",
        "orders",
        "cards",
        "addresses",
        "popularProducts",
        "features",
        "coupons"
})

public class User {

//    @Override
//    public String toString() {
//        return "{" +
//                "\"id\"=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", email='" + email + '\'' +
//                ", token='" + token + '\'' +
//                ", userId='" + userId + '\'' +
//                ", meta=" + meta +
//                ", storeId='" + storeId + '\'' +
//                ", locale=" + locale +
//                ", identityCard='" + identityCard + '\'' +
//                ", accountingCardId=" + accountingCardId +
//                ", business=" + business +
//                ", birthDate=" + birthDate +
//                ", phone=" + phone +
//                ", additionalPhone=" + additionalPhone +
//                ", sexId=" + sexId +
//                ", editOrder=" + editOrder +
//                ", sendEmail=" + sendEmail +
//                ", sendSms=" + sendSms +
//                ", subscribeAt='" + subscribeAt + '\'' +
//                ", subscribeIp='" + subscribeIp + '\'' +
//                ", clubAcceptAt='" + clubAcceptAt + '\'' +
//                ", clubAcceptIp='" + clubAcceptIp + '\'' +
//                ", clubAccept=" + clubAccept +
//                ", sendClubDatabase=" + sendClubDatabase +
//                ", disabledAt=" + disabledAt +
//                ", activatedAt=" + activatedAt +
//                ", deletedAt=" + deletedAt +
//                ", areaId=" + areaId +
//                ", deactivatedAt=" + deactivatedAt +
//                ", customerIdClub=" + customerIdClub +
//                ", name='" + name + '\'' +
//                ", orders=" + orders +
//                ", cards=" + cards +
//                ", addresses=" + addresses +
//                ", popularProducts='" + popularProducts + '\'' +
//                ", features=" + features +
//                ", coupons=" + coupons +
//                ", additionalProperties=" + additionalProperties +
//                '}';
//    }

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("email")
    public String email;
    @JsonProperty("token")
    public String token;
    @JsonProperty("user_id")
    public String userId;
    @JsonProperty("meta")
    public Object meta;
    @JsonProperty("store_id")
    public String storeId;
    @JsonProperty("locale")
    public Object locale;
    @JsonProperty("identity_card")
    public String identityCard;
    @JsonProperty("accounting_card_id")
    public Object accountingCardId;
    @JsonProperty("business")
    public Integer business;
    @JsonProperty("birth_date")
    public Object birthDate;
    @JsonProperty("phone")
    public Object phone;
    @JsonProperty("additional_phone")
    public Object additionalPhone;
    @JsonProperty("sex_id")
    public Object sexId;
    @JsonProperty("edit_order")
    public Object editOrder;
    @JsonProperty("send_email")
    public Integer sendEmail;
    @JsonProperty("send_sms")
    public Integer sendSms;
    @JsonProperty("subscribe_at")
    public String subscribeAt;
    @JsonProperty("subscribe_ip")
    public String subscribeIp;
    @JsonProperty("club_accept_at")
    public String clubAcceptAt;
    @JsonProperty("club_accept_ip")
    public String clubAcceptIp;
    @JsonProperty("club_accept")
    public Integer clubAccept;
    @JsonProperty("send_club_database")
    public Integer sendClubDatabase;
    @JsonProperty("disabled_at")
    public Object disabledAt;
    @JsonProperty("activated_at")
    public Object activatedAt;
    @JsonProperty("deleted_at")
    public Object deletedAt;
    @JsonProperty("area_id")
    public Integer areaId;
    @JsonProperty("deactivated_at")
    public Object deactivatedAt;
    @JsonProperty("customer_id_club")
    public Object customerIdClub;
    @JsonProperty("name")
    public String name;
    @JsonProperty("orders")
    public List<Object> orders;
    @JsonProperty("cards")
    public List<Object> cards;
    @JsonProperty("addresses")
    public Addresses addresses;
    @JsonProperty("popularProducts")
    public String popularProducts;
    @JsonProperty("features")
    public List<Object> features;
    @JsonProperty("coupons")
    public List<Object> coupons;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
