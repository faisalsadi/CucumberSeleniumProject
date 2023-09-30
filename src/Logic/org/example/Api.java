package org.example;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.DTOS.AddItemBody;
import org.example.DTOS.AddItemResponse;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.example.HttpFacade.post;

/*

EcomToken:

eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczpcL1wvYXBpLXByb2QucmFtaS1sZXZ5LmNvLmlsIiwiYXVkIjoiaHR0cHM6XC9cL2FwaS1wcm9kLnJhbWktbGV2eS5jby5pbCIsImlhdCI6MTY5NDcwNzQyOSwibmJmIjoxNjk0NzA3NDg5LCJleHAiOjE2OTQ3OTM4MjksImlkIjo4ODk0MDQsImVtYWlsIjoiZmVzYWxzYWRpQGdtYWlsLmNvbSIsImNpZCI6Ijk5MDAxNTQ3NjI4In0.3BeOGC3omqqV3gkzPzmnDKtRX1E3RpR47cs6pqdWGvQ
 */
//
// https://www.rami-levy.co.il/api/v2/cart
public class Api {
    private static ObjectMapper objectMapper = new ObjectMapper();
    private static IdToName idToName=new IdToName();

    public static ResponseWrapper<JSONObject> loginUser( ) throws IOException {
        JSONObject post = post("https://api-prod.rami-levy.co.il/api/v2/site/auth/login", "{\"username\": \"fesalsadi@gmail.com\",\"password\": \"123456789\",\"restore_account\": false,\"id_delivery_times\": null}");
        ResponseWrapper<JSONObject> ret = new ResponseWrapper<>();
        ret.setStatus(200);
        ret.setData(post);
        return ret;
    }
    public static ResponseWrapper<AddItemResponse> addItem(String name , double quantity) throws IOException {

        HashMap<String, String> items = new HashMap<>();
        items.put(idToName.get(name),Double.toString(quantity));
        AddItemBody object =new AddItemBody(items);
        Map<String, Object> body = objectMapper.convertValue(object, new TypeReference<Map<String, Object>>() {
        });
        Map<String,String> headers= new HashMap<>();
        headers.put("Ecomtoken","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczpcL1wvYXBpLXByb2QucmFtaS1sZXZ5LmNvLmlsIiwiYXVkIjoiaHR0cHM6XC9cL2FwaS1wcm9kLnJhbWktbGV2eS5jby5pbCIsImlhdCI6MTY5NTkxMjIxNiwibmJmIjoxNjk1OTEyMjc2LCJleHAiOjE2OTU5OTg2MTYsImlkIjo4ODk0MDQsImVtYWlsIjoiZmVzYWxzYWRpQGdtYWlsLmNvbSIsImNpZCI6Ijk5MDAxNTQ3NjI4In0.Ao8Lqa_-P8AVkybBAyT_TLEHdOI91EhQrsSf9OR4Jfk");
        AddItemResponse ret = post("https://www.rami-levy.co.il/api/v2/cart", headers, body, AddItemResponse.class);
        return new ResponseWrapper<>(200,ret);
    }
    public static ResponseWrapper<AddItemResponse> emptycart( ) throws IOException {


        AddItemBody object =new AddItemBody(null);
        Map<String, Object> body = objectMapper.convertValue(object, new TypeReference<Map<String, Object>>() {
        });
        Map<String,String> headers= new HashMap<>();
        headers.put("Ecomtoken","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczpcL1wvYXBpLXByb2QucmFtaS1sZXZ5LmNvLmlsIiwiYXVkIjoiaHR0cHM6XC9cL2FwaS1wcm9kLnJhbWktbGV2eS5jby5pbCIsImlhdCI6MTY5NTkxMjIxNiwibmJmIjoxNjk1OTEyMjc2LCJleHAiOjE2OTU5OTg2MTYsImlkIjo4ODk0MDQsImVtYWlsIjoiZmVzYWxzYWRpQGdtYWlsLmNvbSIsImNpZCI6Ijk5MDAxNTQ3NjI4In0.Ao8Lqa_-P8AVkybBAyT_TLEHdOI91EhQrsSf9OR4Jfk");
        AddItemResponse ret = post("https://www.rami-levy.co.il/api/v2/cart", headers, body, AddItemResponse.class);
        return new ResponseWrapper<>(200,ret);
    }


}
