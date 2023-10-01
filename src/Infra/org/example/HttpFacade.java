package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.impl.classic.BasicHttpClientResponseHandler;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class HttpFacade {

    public HttpFacade() {

    }

    public static <T> T get(String url, Class<T> clz) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(url);
        String response = httpClient.execute(request, new BasicHttpClientResponseHandler());

        ObjectMapper objectMapper = new ObjectMapper();
        T object = objectMapper.readValue(response, clz);
        return object;
    }

    public static <T> ResponseWrapper<T> post(String url,Map<String, String> headers, Map<String, Object> requestBodyMap, Class<T> clz) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost request = new HttpPost(url);

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(requestBodyMap);

        StringEntity entity = new StringEntity(requestBody);
        request.setEntity(entity);
        // Set headers
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                request.setHeader(entry.getKey(), entry.getValue());
            }
        }

        request.setHeader("accept", "application/json");
        request.setHeader("Content-Type", "application/json");

        CloseableHttpResponse execute = httpClient.execute(request);
        String responseString = "";
        if (execute.getCode() == HttpStatus.SC_OK) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            execute.getEntity().writeTo(out);
            responseString = out.toString();
            out.close();
        } else {
            new ResponseWrapper<>(execute.getCode(),null);
        }
        return new ResponseWrapper<>(execute.getCode(),objectMapper.readValue(responseString, clz));
    }
    public static JSONObject post(String url, String requestBodyMap) throws IOException {
        URL urlObj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);
        connection.setDoInput(true);
        try (DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream())) {
            outputStream.writeBytes(requestBodyMap);
            outputStream.flush();
        }
        connection.getResponseCode();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            return new JSONObject(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }
        return null;
    }

    public static <T> T put(String url, Map<String, Object> requestBodyMap, Class<T> clz) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPut request = new HttpPut(url);

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(requestBodyMap);

        StringEntity entity = new StringEntity(requestBody);
        request.setEntity(entity);

        request.setHeader("accept", "application/json");
        request.setHeader("Content-Type", "application/json");

        String response = httpClient.execute(request, new BasicHttpClientResponseHandler());

        return objectMapper.readValue(response, clz);
    }

    public static <T> T patch(String url, Map<String, Object> requestBodyMap, Class<T> clz) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPatch request = new HttpPatch(url);

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(requestBodyMap);

        StringEntity entity = new StringEntity(requestBody);
        request.setEntity(entity);

        request.setHeader("Content-Type", "application/json");
        request.setHeader("accept", "application/json");

        String response = httpClient.execute(request, new BasicHttpClientResponseHandler());

        return objectMapper.readValue(response, clz);
    }

    public static <T> T delete(String url, Map<String, Object> requestBodyMap, Class<T> clz) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpDelete request = new HttpDelete(url);

        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(requestBodyMap);

        StringEntity entity = new StringEntity(requestBody);
        request.setEntity(entity);

        request.setHeader("Content-Type", "application/json");

        String response = httpClient.execute(request, new BasicHttpClientResponseHandler());

        return objectMapper.readValue(response, clz);
    }

}
