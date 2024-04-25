package desafioconvertidor.alura.com;
import java.io.IOException;
import java.util.Map;

public class ConversorMoneda extends Menu
{

    //esta es una funcion generica para no escribir tanto codigo en los cases del swich
    //recibe datos por parametro los decimales los formatea a 4 decimales ya van truncados
    private static void TEXTO_RESULTADO(String strMoneda1, String strMoneda2, double dlbResultado) throws IOException
    {
        System.out.printf("El resultado de la conversión de %s a %s es= %.4f\n", strMoneda1, strMoneda2, dlbResultado);
        System.out.println("Presiona ENTER para continuar");
        System.in.read();   //simulamos un readkey
    }

    //esta es la funcion que convierte la moneda, recibe el valor la cantidad a convertir, la opcion del menui, y la respuesta de la api
    public static double convertirMoneda(double dblValor, byte bytOpcion, Monedas respuestaAPI) throws IOException
    {

        double dlbResultado = 0;
        String strMoneda1;          //variable generica para almacena ISO de la moneda la usamos en la funcion TEXTO_RESULTADO()
        String strMoneda2;          //variable generica para almacena ISO de la moneda la usamos en la funcion TEXTO_RESULTADO()

        Map<String, Double> tasasCambio = respuestaAPI.getTasasCambio();        //ACA GUARDAMOS LOS ISO DE MONEDAS Y SU VALOR

   /*     if (bytOpcion == 1)
        {

            dlbResultado= dblValor * tasasCambio.get("ARS");
            strMoneda1="USD";
            strMoneda2="BRL";
            TEXTO_RESULTADO(strMoneda1,strMoneda2,dlbResultado);
        }

    */
        Menu menu= new Menu();              //NO ME ACUERDO PQ DECLARE ESTO

        switch(bytOpcion)           //SWITCH DE LAS OPERACIONES SEGUN SEA LA OPCION QUE ESCOGIMOS DEL MENU HARA LA OPERACION
        {
            case 1:
                dlbResultado= dblValor * tasasCambio.get("ARS");
                strMoneda1="USD";
                strMoneda2="ARS";
                TEXTO_RESULTADO(strMoneda1,strMoneda2,dlbResultado);
                break;
            case 2:
                dlbResultado= dblValor / tasasCambio.get("ARS");
                dlbResultado = Math.floor(dlbResultado * 10000) / 10000;        //TRUNCAMOS
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
                dlbResultado = Math.floor(dlbResultado * 10000) / 10000;        //TRUNCAMOS
                strMoneda1="BRL";
                strMoneda2="USD";
                TEXTO_RESULTADO(strMoneda1,strMoneda2,dlbResultado);
                break;

            case 5:
                dlbResultado= dblValor * tasasCambio.get("COP");
                strMoneda1="USD";
                strMoneda2="COP";
                TEXTO_RESULTADO(strMoneda1,strMoneda2,dlbResultado);            //TRUNCAMOS
                break;
            case 6:
                dlbResultado= dblValor / tasasCambio.get("COP");
                dlbResultado = Math.floor(dlbResultado * 10000) / 10000;
                strMoneda1="COP";
                strMoneda2="USD";
                TEXTO_RESULTADO(strMoneda1,strMoneda2,dlbResultado);            //TRUNCAMOS
                break;
            default:
                System.out.println("Opcion no valida");                         //OPCION FUERA DE RANGO SE SALE Y MUESTA CREDITOS DEL AUTOR
                menu.MOSTRAR_AUTOR();
                break;

        }



        return dlbResultado;        //YA NO ME ACUERDO POQ LO MANDE COMO RETURN SI AL FINAL LO HAGO ACA
    }


}