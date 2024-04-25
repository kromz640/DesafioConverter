package desafioconvertidor.alura.com;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionAPI
{

    //DECLARE COMO VARIABLE MI URL DE LA API KEY
    private static String URL_API="https://v6.exchangerate-api.com/v6/c109df3faf83392b6b3853e5/latest/USD";


    //NOS CONECTAMOS CON LA API
        //esto me lo copie deel video del curso y lo ajuste
    public static Monedas obtenerRespuestaAPI() throws IOException, InterruptedException
    {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL_API))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //CONVERTIMOS EL JSON
        Gson gson = new Gson();  //aca esta el GSON invocado
        Monedas respuestaAPI = gson.fromJson(response.body(), Monedas.class); //mandamos los datos codigo iso y valor a la clase Monedas,class
        return respuestaAPI;  //DEVOLVEMOS LA RESPIESTA DE LA API ES DECIR EL JSON
    }


}
