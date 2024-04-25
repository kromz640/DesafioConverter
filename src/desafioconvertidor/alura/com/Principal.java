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

        if((bytOpcion <0) || (bytOpcion >8))
        {
            System.out.println("Saliendo");
            break;
        }

        try
        {
            double dblValor=sc.nextDouble();
            Monedas respuestasMonedas=ConexionAPI.obtenerRespuestaAPI();
            System.out.println("Escribi el valor a convertir: ");

            ConversorMoneda.convertirMoneda(valor,bytOpcion,respuestasMonedas);
        }

        catch (IOException e)
        {
            System.out.println("Hay un error con la API " + e.getMessage());
        }

    }
    }
}
