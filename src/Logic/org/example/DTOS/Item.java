package org.example.DTOS;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "countUsesSale",
        "FormatedSavePrice",
        "FormatedTotalPrice",
        "FormatedSavePriceClub",
        "FormatedSavePriceWallet",
        "FormatedTotalPriceClub",
        "FormatedTotalPriceWallet",
        "FormatedTotalPriceWithoutDiscount",
        "finalPriceClub",
        "finalPriceWallet",
        "PromotionIdClub",
        "site_id",
        "id",
        "name",
        "price",
        "quantity",
        "has_coupon",
        "is_delivery",
        "isClub",
        "countUsesSaleWallet",
        "PromotionId",
        "department_id",
        "group_id",
        "sub_group_id",
        "isWallet"
})

public class Item {

    @JsonProperty("countUsesSale")
    public CountUsesSale countUsesSale;
    @JsonProperty("FormatedSavePrice")
    public int formatedSavePrice;
    @JsonProperty("FormatedTotalPrice")
    public double formatedTotalPrice;
    @JsonProperty("FormatedSavePriceClub")
    public int formatedSavePriceClub;
    @JsonProperty("FormatedSavePriceWallet")
    public double formatedSavePriceWallet;
    @JsonProperty("FormatedTotalPriceClub")
    public double formatedTotalPriceClub;
    @JsonProperty("FormatedTotalPriceWallet")
    public double formatedTotalPriceWallet;
    @JsonProperty("FormatedTotalPriceWithoutDiscount")
    public double formatedTotalPriceWithoutDiscount;
    @JsonProperty("finalPriceClub")
    public double finalPriceClub;
    @JsonProperty("finalPriceWallet")
    public double finalPriceWallet;
    @JsonProperty("PromotionIdClub")
    public Object promotionIdClub;
    @JsonProperty("site_id")
    public int siteId;
    @JsonProperty("id")
    public int id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("price")
    public double price;
    @JsonProperty("quantity")
    public int quantity;
    @JsonProperty("has_coupon")
    public boolean hasCoupon;
    @JsonProperty("is_delivery")
    public boolean isDelivery;
    @JsonProperty("isClub")
    public boolean isClub;
    @JsonProperty("countUsesSaleWallet")
    public CountUsesSaleWallet countUsesSaleWallet;
    @JsonProperty("PromotionId")
    public List<Integer> promotionId;
    @JsonProperty("department_id")
    public int departmentId;
    @JsonProperty("group_id")
    public int groupId;
    @JsonProperty("sub_group_id")
    public int subGroupId;
    @JsonProperty("isWallet")
    public boolean isWallet;
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
