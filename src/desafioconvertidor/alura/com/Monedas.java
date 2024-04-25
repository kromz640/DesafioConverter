package desafioconvertidor.alura.com;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Monedas {
    @SerializedName("conversion_rates")

    private Map<String, Double> tasasCambio;

    public Map<String, Double> getTasasCambio() {
        return tasasCambio;
    }

    @Override
    public String toString() {
        return "Tasas de Cambio: " + tasasCambio;
    }
}
