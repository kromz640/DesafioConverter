package desafioconvertidor.alura.com;

import com.google.gson.annotations.SerializedName;

import java.util.Map;


//ACA LA CLASE MONEDA SERIALIZA EN UN MAP LOS conversion_rates del json, tomamos el iso de la moneda y el valor numerico
public class Monedas {
    @SerializedName("conversion_rates")

    private Map<String, Double> tasasCambio;

    public Map<String, Double> getTasasCambio() {
        return tasasCambio;
    }


    //esto me copie del profesor
    @Override
    public String toString()
    {
        return "Tasas de Cambio: " + tasasCambio;
    }
}
