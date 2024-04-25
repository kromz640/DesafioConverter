package desafioconvertidor.alura.com;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionAPI
{

    private static String URL_API="https://v6.exchangerate-api.com/v6/c109df3faf83392b6b3853e5/latest/USD";

    public static Monedas obtenerRespuestaAPI() throws IOException, InterruptedException
    {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL_API))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        Monedas respuestaAPI = gson.fromJson(response.body(), Monedas.class);
        return respuestaAPI;
    }


}
