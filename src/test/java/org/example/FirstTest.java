package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.example.HttpFacade;

import java.io.IOException;

public class FirstTest {
//    private static String apiUrl = "https://us-central1-testomate-test.cloudfunctions.net/api";
    @Test
    public void first() throws IOException {
//        GetResturantsResponse getResturantsResponse = HttpFacade.get(apiUrl + "/restaurants", GetResturantsResponse.class);
        assertTrue(true);
    }

}
