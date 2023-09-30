package org.example.DTOS;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "apartment",
        "area",
        "area_id",
        "city",
        "city_id",
        "default",
        "entrance",
        "floor",
        "name",
        "store_id",
        "street",
        "street_id",
        "street_number",
        "zip"
})
public class Address {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("apartment")
    public String apartment;
    @JsonProperty("area")
    public Object area;
    @JsonProperty("area_id")
    public Object areaId;
    @JsonProperty("city")
    public String city;
    @JsonProperty("city_id")
    public Integer cityId;
    @JsonProperty("default")
    public Integer _default;
    @JsonProperty("entrance")
    public Object entrance;
    @JsonProperty("floor")
    public String floor;
    @JsonProperty("name")
    public Object name;
    @JsonProperty("store_id")
    public Object storeId;
    @JsonProperty("street")
    public String street;
    @JsonProperty("street_id")
    public Integer streetId;
    @JsonProperty("street_number")
    public String streetNumber;
    @JsonProperty("zip")
    public String zip;
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
