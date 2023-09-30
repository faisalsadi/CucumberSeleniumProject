package org.example.DTOS;

import lombok.Data;

import java.util.Map;
@Data
public class AddItemBody {
    private String store;
    private int isClub;
    private String supplyAt;
    private Map<String, String> items;
    private Object meta; // You can change the type of meta field as per your needs

    public AddItemBody(Map<String, String> items) {
        this.setStore("1323");
        this.setIsClub(0);
        this.setSupplyAt("2023-10-03T00:00:00.000Z");
        this.setItems(items);
        this.setMeta(null);
    }
}
