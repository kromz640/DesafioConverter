package desafioconvertidor.alura.com;

import java.io.IOException;

public class Menu
{

    public void MOSTRAR_MENU()
    {
        System.out.println("""
            CONVERSOR DE MONEDA UTILIZANDO API EXCHANGE RATES
            
            MENU
            BIENVENIDO AL CONVERSOR DE MONEDA
            1- DOLAR A PESO ARGENTINO
            2- PESO ARGENTINO A DOLAR
            3- DOLAR A REAL BRASILENO
            4- REAL BRASILENO A DOLAR
            5- DOLAR A PESO COLOMBIANO
            6- PESO COLOMBIANO A DOLAR
            7- SALIR
            
            ELIJE UNA OPCION: """);
    }

    public void MOSTRAR_AUTOR()
    {
        System.out.println("G6-ONE Backend Java");
        System.out.println("Rolando Roque Kuan");
        System.out.println("Abril 2024");
    }

    public void LIMPIAR_PANTALLA() throws IOException, InterruptedException {
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }


}