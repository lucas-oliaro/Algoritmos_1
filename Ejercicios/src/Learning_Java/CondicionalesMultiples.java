import java.util.Scanner;

public class CondicionalesMultiples {
    

    public static void main(String[] args){
        /*
         * switch (variable) {
         * case 1:
         * instruccion;
         * break;
         * case 2:
         * instruccion;
         * break;
         * default:
         * instruccion;
         * break;
         * 
         */
        int numero;
        //Pido a usuario un numero
        System.out.println("Ingrese un numero");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        
        switch (numero) {
            case 1:
                System.out.println("El numero es 1");
                break;
            case 2:
                System.out.println("El numero es 2");
                break;
            case 3:
                System.out.println("El numero es 3");
                break;
            case 4:
                System.out.println("El numero es 4");
                break;
            case 5:
                System.out.println("El numero es 5");
                break;
            default: //Caso contrario si no se cumplen los casos
                System.out.println("El numero es diferente a 1, 2, 3, 4, 5");
                break;
        }
        entrada.close();
    }
}
