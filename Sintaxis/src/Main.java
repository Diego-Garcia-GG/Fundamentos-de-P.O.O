//Importaciones
import java.util.Random;
import java.beans.JavaBean;
import java.util.Scanner;

//Clase principal
public class Main {

    //Método principal
    public static void main(String[] args) {

        /*Comentario
        * de
        * varias
        * líneas */

        System.out.println("Hello, Diego García :)");

        //Cadenas 1.-
        String cadenas = "Diego" + " " + "Garcia" + " " + "García";

        System.out.println(cadenas);

        //Longitud
        System.out.println(cadenas.length());

        //Extraer posiciones
        System.out.println(cadenas.substring(2,5));
        System.out.println(cadenas.substring(2));
        System.out.println(cadenas.substring(0,5));
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();

        //---------------------------------------------------------
        //Manejo de variables 2.-

        int x = 5,x2;
        double y = 1.25,y2;
        String z = "204",z2;

        //Conversión string a int
        x2 = Integer.parseInt(z);
        //Coversión double a string
        z = String.valueOf(y);
        //Conversión int a double
        double asd = Double.valueOf(x);
        //Conversión implícita
        int a1 = 10;
        double a2 = a1;
        System.out.println("Conversión implícita" +a2);
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();

        //---------------------------------------------------------
        //Instancia 3.-
        Random rndm = new Random();
        int R1 = rndm.nextInt();
        double R2 = rndm.nextDouble();

        System.out.println("Aleatorio entero: "+R1);
        System.out.println("Aleatorio double: "+R2);
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();

        //---------------------------------------------------------
        //Scanner 4.-
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce cualquier dato: ");
        String dato = sc.nextLine();

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        System.out.print("Introduce un número con decimal: ");
        double numConD = sc.nextDouble();

        System.out.println("Cualquier dato: "+dato);
        System.out.println("Un número: "+num);
        System.out.println("Un número con decimal: "+numConD);
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();

        //---------------------------------------------------------
        //Boolean, operadores lógicos y de comparación 5.-
        System.out.println(10 > 9);
        System.out.println(10 == 9);
        System.out.println(10 < 9);
        System.out.println(10 >= 9);
        System.out.println(10 <= 9);
        System.out.println(10 != 9);

        int x3 = 3;
        System.out.println(x3 < 5 && x3 > 10);
        System.out.println(x3 < 5 || x3 > 10);
        System.out.println(!(x3 < 5 && x3 > 10));
    }
}