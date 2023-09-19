package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.HashMap;



public class FirstTest {
//    private static String apiUrl = "https://us-central1-testomate-test.cloudfunctions.net/api";
    @Test
    public void first() throws IOException {
//        GetResturantsResponse getResturantsResponse = HttpFacade.get(apiUrl + "/restaurants", GetResturantsResponse.class);
        HashMap<String,Object> map=new HashMap<>();
        /*

        {
    "username": "fesalsadi@gmail.com",
    "password": "123456789",
    "restore_account": false,
    "id_delivery_times": null
}
         */
        map.put("username","fesalsadi@gmail.com");
        map.put("password","123456789");

        LoginResponse post = HttpFacade.post("https://api-prod.rami-levy.co.il/api/v2/site/auth/login", map, LoginResponse.class);
        assertTrue(true);
    }

}
