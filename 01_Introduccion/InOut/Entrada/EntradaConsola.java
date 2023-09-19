package Entrada;

import java.util.Scanner;
import Salida.SalidaConsola;

public class EntradaConsola {
    
    //Metodo main
    public static void obtenerEntradas(String[] arg){
        System.out.println("Ingrese un número entero: ");
        Scanner sc = new Scanner(System.in);
        int numEntrada = sc.nextInt();

        //Creo string para guardas las entradas de texto
        String[] entradas = new String[numEntrada];

        for (int i = 0; i < numEntrada; i++) {
            System.out.println("Ingrese una entrada: ");
            String entrada = sc.next();
            entradas[i] = entrada; //agrego la entrada al array                      
            SalidaConsola.mostrar(entrada);
        }

        
        sc.close();

    }
}
