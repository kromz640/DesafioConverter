package desafioconvertidor.alura.com;
import java.io.IOException;

import java.util.Map;

public class ConversorMoneda extends Menu {

    private static void TEXTO_RESULTADO(String strMoneda1, String strMoneda2, double dlbResultado) throws IOException
    {
        System.out.println("El resultado de la conversion de " + strMoneda1 + " a " + strMoneda2 + " es= " + dlbResultado);
        System.out.println("Presiona ENTER para continuar");
        System.in.read();
    }

    public static double convertirMoneda(double dblValor, byte bytOpcion, Monedas respuestaAPI) throws IOException
    {

        double dlbResultado = 0;
        String strMoneda1;
        String strMoneda2;
        Map<String, Double> tasasCambio = respuestaAPI.getTasasCambio();

   /*     if (bytOpcion == 1)
        {

            dlbResultado= dblValor * tasasCambio.get("ARS");
            strMoneda1="USD";
            strMoneda2="BRL";
            TEXTO_RESULTADO(strMoneda1,strMoneda2,dlbResultado);
        }

    */
        Menu menu= new Menu();
        switch(bytOpcion)
        {
            case 1:
                dlbResultado= dblValor * tasasCambio.get("ARS");
                strMoneda1="USD";
                strMoneda2="ARS";
                TEXTO_RESULTADO(strMoneda1,strMoneda2,dlbResultado);
                break;
            case 2:
                dlbResultado= dblValor / tasasCambio.get("ARS");
                strMoneda1="ARS";
                strMoneda2="USD";
                TEXTO_RESULTADO(strMoneda1,strMoneda2,dlbResultado);
                break;

            case 3:
                dlbResultado= dblValor * tasasCambio.get("BRL");
                strMoneda1="USD";
                strMoneda2="BRL";
                TEXTO_RESULTADO(strMoneda1,strMoneda2,dlbResultado);
                break;
            case 4:
                dlbResultado= dblValor / tasasCambio.get("BRL");
                strMoneda1="BRL";
                strMoneda2="USD";
                TEXTO_RESULTADO(strMoneda1,strMoneda2,dlbResultado);
                break;

            case 5:
                dlbResultado= dblValor * tasasCambio.get("COP");
                strMoneda1="USD";
                strMoneda2="COP";
                TEXTO_RESULTADO(strMoneda1,strMoneda2,dlbResultado);
                break;
            case 6:
                dlbResultado= dblValor / tasasCambio.get("COP");
                strMoneda1="COP";
                strMoneda2="USD";
                TEXTO_RESULTADO(strMoneda1,strMoneda2,dlbResultado);
                break;
            default:
                System.out.println("Opcion no valida");
                menu.MOSTRAR_AUTOR();
                break;

        }



        return dlbResultado;
    }


}