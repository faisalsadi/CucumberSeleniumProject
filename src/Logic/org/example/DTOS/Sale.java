package org.example.DTOS;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "code",
        "sw_kefel",
        "k_cmt",
        "k_acz_dis",
        "active",
        "cmt",
        "type",
        "is_wallet",
        "is_personal",
        "name",
        "k_scm",
        "days",
        "k_items",
        "from",
        "id",
        "to",
        "scm",
        "is_club",
        "countInEveryDivided"
})

public class Sale {

    @JsonProperty("code")
    public int code;
    @JsonProperty("sw_kefel")
    public int swKefel;
    @JsonProperty("k_cmt")
    public Object kCmt;
    @JsonProperty("k_acz_dis")
    public Object kAczDis;
    @JsonProperty("active")
    public int active;
    @JsonProperty("cmt")
    public int cmt;
    @JsonProperty("type")
    public int type;
    @JsonProperty("is_wallet")
    public int isWallet;
    @JsonProperty("is_personal")
    public int isPersonal;
    @JsonProperty("name")
    public String name;
    @JsonProperty("k_scm")
    public Object kScm;
    @JsonProperty("days")
    public List<Object> days;
    @JsonProperty("k_items")
    public List<Object> kItems;
    @JsonProperty("from")
    public String from;
    @JsonProperty("id")
    public int id;
    @JsonProperty("to")
    public String to;
    @JsonProperty("scm")
    public double scm;
    @JsonProperty("is_club")
    public int isClub;
    @JsonProperty("countInEveryDivided")
    public int countInEveryDivided;
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
