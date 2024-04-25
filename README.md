Conversor de monedas Java utiizando API de exchange rates
ROLANDO ROQUE KUAN
G6-ONE Alura
Backned Java
24 ABRIL 2024


Clase Monedas
En esta clase almancenamos la serializacion de los codigos iso de las monedas y sus respectivos valores de tasa de cambio

Clase ConexionAPI
Inicia la conexion con el servidor y verifica si hay conexion caso contrario devolvera un error de excepcion, si la conexcion es satisfactoria, estos datos json son enviados a la clase Monedas.class

Clase Menu
   Despliega el menu de opciones

Clase Principal
Clase principal y su metodo main(), declaramos el objeto menu, lo mostramos en pantalla, luego hacemos la pregunta al usuario sobre la opcion deseada, tiene un validador, no se aceptan numeros negativos, cero, ni mayores de 7, sin embargo no se implemento manejador de introduccion de letras
el metodo main, es el que se encarga de enviar los diferentes datos e interconectarlos con los diferentes objetos del programa

Clase ConversorMoneda
Esta es la clase que se encarga de hacer la conversion, recibe por parametro la opcion de conversion del usuario, el iso de las monedas y su tasa de cambio
segun sea la opcion elegida entrara a un switch y de acuerdo al caso realizara la opcion correspondiente, luego de hacer los calculos, enviara por parametros
moneda1,moneda2,resultado al metodo mostrarresultado, este metodo es un metodo generico para evitar escribir demasiado codigo en cada uno de los casos de los switchs

 Requerimientos del programa:

 Conexion a internet
 Java Sdk 22
 Gson
