package org.example;

import com.google.gson.Gson;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.impl.classic.BasicHttpClientResponseHandler;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.StringEntity;

import java.io.IOException;
import java.util.Map;

public class HttpFacade {

    public HttpFacade() {
//        this.httpClient = HttpClients.createDefault();
    }

    public static <T> T get(String url, Class<T> clz) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(url);
        String response = httpClient.execute(request, new BasicHttpClientResponseHandler());
        Gson gson = new Gson();
        T object = gson.fromJson(response, clz);
        return object;
    }
    public static <T> T post(String url, Map<String, Object> requestBodyMap, Class<T> clz) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost request = new HttpPost(url);

        Gson gson = new Gson();
        String requestBody = gson.toJson(requestBodyMap);

        StringEntity entity = new StringEntity(requestBody);
        request.setEntity(entity);
        request.setHeader("accept", "application/json");
        request.setHeader("Content-Type", "application/json");
//        request.setHeader("Host","<calculated when request is sent>");

        String response = httpClient.execute(request, new BasicHttpClientResponseHandler());

        T object = gson.fromJson(response, clz);
        return object;
    }

    public static <T> T put(String url, Map<String, Object> requestBodyMap, Class<T> clz) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPut request = new HttpPut(url);

        Gson gson = new Gson();
        String requestBody = gson.toJson(requestBodyMap);

        StringEntity entity = new StringEntity(requestBody);
        request.setEntity(entity);

        request.setHeader("accept", "application/json");
        request.setHeader("Content-Type", "application/json");

        String response = httpClient.execute(request, new BasicHttpClientResponseHandler());

        T object = gson.fromJson(response, clz);
        return object;
    }
    public static <T> T patch(String url, Map<String, Object> requestBodyMap, Class<T> clz) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPatch request = new HttpPatch(url);

        Gson gson = new Gson();
        String requestBody = gson.toJson(requestBodyMap);

        StringEntity entity = new StringEntity(requestBody);
        request.setEntity(entity);

        request.setHeader("Content-Type", "application/json");
        request.setHeader("accept", "application/json");

        String response = httpClient.execute(request, new BasicHttpClientResponseHandler());

        T object = gson.fromJson(response, clz);
        return object;
    }
    public static <T> T delete(String url, Map<String, Object> requestBodyMap, Class<T> clz) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpDelete request = new HttpDelete(url);

        Gson gson = new Gson();
        String requestBody = gson.toJson(requestBodyMap);

        StringEntity entity = new StringEntity(requestBody);
        request.setEntity(entity);

        request.setHeader("Content-Type", "application/json");

        String response = httpClient.execute(request, new BasicHttpClientResponseHandler());

        T object = gson.fromJson(response, clz);
        return object;
    }

}
