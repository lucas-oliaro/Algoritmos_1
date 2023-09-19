
//int a = 10;
//int b = 3;
//int suma = a + b;
//int resta = a - b;
//int multiplicacion = a * b;
//int division = a / b;
//int modulo = a % b;

import java.util.Scanner;

public class Calculadora{

    public static void main(String[] args){
        System.out.println("Ingrese el primer numero");

        
        //Ver como sigue el programa hasta que ingrese un numero correcto
        double a;
        try {
            a = Double.parseDouble(System.console().readLine());
        } catch (NumberFormatException nfe) {
            System.out.println("No es un numero");
        }
        
       
        Scanner sc = new Scanner(System.in);
        String opcion = sc.next();

        //Select Operation to work

        //preguntar deberia hacer un paquete por cada operacion o lo hago en el main.
        //seria correcto usar esto que recomendo Copilot
         switch (opcion) {
            case "+":
                System.out.println("Suma");
                break;
            case "-":
                System.out.println("Resta");
                break;
            case "*":
                System.out.println("Multiplicacion");
                break;
            case "/":
                System.out.println("Division");
                break;
            case "%":
                System.out.println("Modulo");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        


        Double b;
        System.out.println("Ingrese el segundo numero");
        try {
            b = Double.parseDouble(System.console().readLine());
        } catch (NumberFormatException nfe) {
            System.out.println("No es un numero");
        }
        

        
    }
}