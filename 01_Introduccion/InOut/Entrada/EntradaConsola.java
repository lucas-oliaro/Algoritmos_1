package InOut.Entrada;

import java.util.Scanner;

public class EntradaConsola {
    


    //Metodo main
    public static void main(String[] arg){
        if (args.lenght != 1){
            System.out.println("Error: Debe ingresar un numero");
            System.exit(1);
        }

        int numEntradas = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);

    }
}
