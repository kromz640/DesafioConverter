package desafioconvertidor.alura.com;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Map;

public class ConversorMoneda {
    public static double convertirMoneda(double dblValor, byte bytOpcion, Monedas respuestaAPI) throws IOException {

        double dlbResultado = 0;
        Map<String, Double> tasasCambio = respuestaAPI.getTasasCambio();

        if (bytOpcion == 1)
        {
            dlbResultado= dblValor * tasasCambio.get("ARS");
            System.out.println("El resultado en BRL es = " + dlbResultado);
            System.out.println("Presiona ENTER para continuar");
            System.in.read();
          //  Menu menu = new Menu();
          //  menu.LIMPIAR_PANTALLA();


        }


        return dlbResultado;
    }

}