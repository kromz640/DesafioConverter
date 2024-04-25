/*
ROLANDO ROQUE KUAN
CONVERTIDOR DE MONEDA USANDO API
ABRIL 2024
G6-ONE BACKNED JAVA

*/


package desafioconvertidor.alura.com;
import java.io.IOException;
import java.util.Scanner;

//Programa de conversor de monedas utilizando api exchange rate

public class Principal
{
    public static void main(String[] args)
    {
        while(true)             //forzamos un ciclo infinito hasta que salgamos o continuemos convirtiendo con 7 salimos
        {
            byte bytOpcion;
            Scanner sc = new Scanner(System.in);

            Menu menu = new Menu();                 //Objeto menu y llamamos al metodo mostrar menu de la Clase Menu
            menu.MOSTRAR_MENU();

            bytOpcion = sc.nextByte();              //leemos la opcion para el menu

            if(bytOpcion==7)                        //salida del programa
            {
                menu.MOSTRAR_AUTOR();               //muestra los credito del autor del programa
                break;
            }
            if (bytOpcion >= 1 && bytOpcion < 7)        //verifica si la opcion dada esta en rango de 1 a 6 para conversion
            {

                try {                           //try leemos el valor de la moneda a convertir y hacemos la conexion api
                    System.out.println("Escribi el valor a convertir: ");
                    double dblValor = sc.nextDouble();
                    Monedas respuestasMonedas = ConexionAPI.obtenerRespuestaAPI();  //obtenemos la rspesta del api esta en la clase Monedas


                    ConversorMoneda.convertirMoneda(dblValor, bytOpcion, respuestasMonedas);        //mandamos los datos por parametro a la funcion cionvertirMoneda de la clase Conversormoneda
                }

                catch (IOException | InterruptedException e)        //manejo de exepciones
                {
                    System.out.println("Hay un error con la API " + e.getMessage());
                }
            }
            else
            {
                menu.MOSTRAR_MENU();        //opcion invalida muestra el menu nuevamente
            }


        }
    }
}
