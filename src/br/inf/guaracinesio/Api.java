package br.inf.guaracinesio;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/*
Real BRL
Dolar USD
Guarani PYG
 */

public class Api {
    private static final String API_KEY = "08b0a9f60dc0ec2f5f7337b2"; // Tu clave de API
    private static final String API_BASE_URL = "https://v6.exchangerate-api.com/v6/";

    static double getTaxaDeCambio(String moedaOrigem, String moedaDestino) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_BASE_URL + API_KEY + "/latest/" + moedaOrigem))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String responseBody = response.body();

        String searchStr = "\"" + moedaDestino + "\":";
        int startIndex = responseBody.indexOf(searchStr) + searchStr.length();
        int endIndex = responseBody.indexOf(",", startIndex);
        String taxaStr = responseBody.substring(startIndex, endIndex);

        return Double.parseDouble(taxaStr);
    }
}