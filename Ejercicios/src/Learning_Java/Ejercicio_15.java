package Learning_Java;

import java.util.Scanner;

public class Ejercicio_15 {
    /*
     * Leer 10 enteros ordenados crecientemente.
     * Leer N y buscarlo en la tabla.
     * Se debe mostrar la posición en que se encuentra.
     * Si no esta, indicarlo con un mensaje.
     */

     public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[], numero;
        arreglo = new int[10]; //creamos el arreglo con 10 posiciones

        boolean creciente = true;

        do{
            //pedimos el arreglo
            System.out.println("Digite los elementos del arreglo: ");
            for(int i = 0; i < 10; i++){
                System.out.print((i+1) + ". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }
            //verficiamos si el arreglo esta ordenado con un bucle
            for (int i=0; i<9;i++){
                if(arreglo[i] < arreglo[i+1]){
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]){
                    creciente = false;
                    break;
                }
            }
            if (creciente == false){
                System.out.println("El arreglo no esta ordenado, vuelva a digitarlo");
            }
        }while(creciente == false);

        //pedimos el numero a buscar
        System.out.print("Digite el numero a buscar: ");
        numero = entrada.nextInt();

        //buscamos el numero
        int i = 0;
        while(i < 10 && arreglo[i] < numero){
            i++;
            }
        if (i == 10){
            System.out.println("El numero no se encuentra en el arreglo");
        }
        else{
            System.out.println("El numero se encuentra en la posicion: " + i);
        }
        entrada.close();   
    }
}