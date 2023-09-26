package org.example;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "customer_id",
        "order_id",
        "strip_id",
        "address",
        "hour",
        "supply_date",
        "supply_date_no_time",
        "order_until_hour",
        "expires_at",
        "name",
        "price",
        "area_id",
        "store_id",
        "deleted_at",
        "created_at",
        "updated_at"
})

public class DeliveryTimesCustomer {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("customer_id")
    public Integer customerId;
    @JsonProperty("order_id")
    public Object orderId;
    @JsonProperty("strip_id")
    public Integer stripId;
    @JsonProperty("address")
    public Address address;
    @JsonProperty("hour")
    public String hour;
    @JsonProperty("supply_date")
    public String supplyDate;
    @JsonProperty("supply_date_no_time")
    public String supplyDateNoTime;
    @JsonProperty("order_until_hour")
    public String orderUntilHour;
    @JsonProperty("expires_at")
    public Object expiresAt;
    @JsonProperty("name")
    public String name;
    @JsonProperty("price")
    public Double price;
    @JsonProperty("area_id")
    public String areaId;
    @JsonProperty("store_id")
    public String storeId;
    @JsonProperty("deleted_at")
    public Object deletedAt;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;
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
