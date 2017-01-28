package com.mserpa.facade.swapi.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mserpa.facade.swapi.rest.model.CharacterApi;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class SwapiRestClient {

    private final static String URL_API = "http://swapi.co/api";

    public CharacterApi findById(Long id){
        try(CloseableHttpClient httpClient = HttpClientBuilder.create().build()){
            HttpGet httpGet = buildGetRequest(id);
            return performRequest(httpClient, httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private CharacterApi performRequest(CloseableHttpClient httpClient, HttpGet httpGet) throws IOException {
        try(CloseableHttpResponse httpResponse = httpClient.execute(httpGet)){
            HttpEntity entity = httpResponse.getEntity();
            return extractCharacterApiModel(entity);
        }
    }

    private CharacterApi extractCharacterApiModel(HttpEntity entity) throws IOException {
        try(InputStream content = entity.getContent()){
            Reader reader = new InputStreamReader(content);
            Gson gson = new GsonBuilder().create();
            return gson.fromJson(reader, CharacterApi.class);
        }
    }

    public HttpGet buildGetRequest(Long id){
        HttpGet httpGet = new HttpGet(buildUrl(id));
        httpGet.addHeader("User-Agent", "Mozilla/5.0");
        return httpGet;
    }

    private String buildUrl(Long id) {
        return String.format("%s/people/%d/", URL_API, id);
    }

}
