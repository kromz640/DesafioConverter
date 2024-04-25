package desafioconvertidor.alura.com;
import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
    while(true)
    {
        byte bytOpcion;
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();
        menu.MOSTRAR_MENU();

        bytOpcion = sc.nextByte();

        if(bytOpcion==7)
        {
            System.out.println("Gracias pior usar el conversor de moneda");
            menu.MOSTRAR_AUTOR();
            break;
        }

        try
        {
            System.out.println("Escribi el valor a convertir: ");
            double dblValor=sc.nextDouble();
            Monedas respuestasMonedas=ConexionAPI.obtenerRespuestaAPI();


            ConversorMoneda.convertirMoneda(dblValor,bytOpcion,respuestasMonedas);
        }

        catch (IOException | InterruptedException e)
        {
            System.out.println("Hay un error con la API " + e.getMessage());
        }

    }
    }
}
