
package org.example.DTOS;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sales",
        "items",
        "log_id",
        "price",
        "priceClub",
        "discountClub",
        "priceWallet",
        "discountWallet",
        "discount",
        "quantity",
        "meta",
        "status"
})
public class AddItemResponse {

    @JsonProperty("sales")
    public List<Sale> sales;
    @JsonProperty("items")
    public List<Item> items;
    @JsonProperty("log_id")
    public Object logId;
    @JsonProperty("price")
    public double price;
    @JsonProperty("priceClub")
    public double priceClub;
    @JsonProperty("discountClub")
    public int discountClub;
    @JsonProperty("priceWallet")
    public double priceWallet;
    @JsonProperty("discountWallet")
    public double discountWallet;
    @JsonProperty("discount")
    public int discount;
    @JsonProperty("quantity")
    public int quantity;
    @JsonProperty("meta")
    public Meta meta;
    @JsonProperty("status")
    public int status;
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






