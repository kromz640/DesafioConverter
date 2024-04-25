package desafioconvertidor.alura.com;
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
                menu.MOSTRAR_AUTOR();
                break;
            }
            if (bytOpcion >= 1 && bytOpcion < 7)
            {

                try {
                    System.out.println("Escribi el valor a convertir: ");
                    double dblValor = sc.nextDouble();
                    Monedas respuestasMonedas = ConexionAPI.obtenerRespuestaAPI();


                    ConversorMoneda.convertirMoneda(dblValor, bytOpcion, respuestasMonedas);
                } catch (IOException | InterruptedException e) {
                    System.out.println("Hay un error con la API " + e.getMessage());
                }
            }
            else
            {
                menu.MOSTRAR_MENU();
            }


        }
    }
}
