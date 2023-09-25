package Learning_Java;


import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        //Formas de comentar
        /*
         * Muhco tenxto aqui
         * mucho texto aqui
         * 
         */

        System.out.print("Hello World");
        System.out.println("Hello World"); //Con salto sin salto

        //Hay tipos de datos primitivos y no primitivos
        /*
         * int numero = null; EERror
         * numero.prueba(); Error
         * 
         * Integer numero = null; No error
         * numero.prueba(); No error necesariemtne
         * 
         * String palabra = "hola que tal"; No error No primitivo
         * palabra.length(); No error; Tiene metodos y podemos hacer acciones
         * 
         * 
         * 
         */

         //Constantes
         /*
          * final int numero = 10;
            numero = 20; Error
          */

        //Entrada y salida
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();
        /*
         * nextInt() -> int guardamos un entero en varaible numero
         */
        float numero2;
        System.out.println("Ingrese un numero2");
        numero2 = entrada.nextFloat();
        /*
         * nextFloat() -> float guardamos un float en varaible numero2
         */
        Double numero3;
        System.out.println("Ingrese un numero3");
        numero3 = entrada.nextDouble();
        /*
         * nextDouble() -> double guardamos un double en varaible numero3
         */
        String palabra;
        System.out.println("Ingrese un palabra");
        palabra = entrada.next();
        /*
         * next() -> guardamos hasta el espacio
         * nextline() -> String guardamos un String en varaible palabra
         */
        entrada.close();

    }
}