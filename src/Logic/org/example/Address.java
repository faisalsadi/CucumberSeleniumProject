package org.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

public class Address {

    @SerializedName("city")
    @Expose
    public String city;
    @SerializedName("city_id")
    @Expose
    public Integer cityId;

}
