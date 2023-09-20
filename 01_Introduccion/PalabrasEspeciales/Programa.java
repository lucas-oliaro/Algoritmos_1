package PalabrasEspeciales;
import AnalisisEspecial.Especial;

public class Programa {
        public static void main(String[] args){
            System.out.println("Ingrese una frase");
            String frase = System.console().readLine();
            
            System.out.println("Ingrese un separador");
            String separador = System.console().readLine();
            
            //Clase Especial
            Especial analisis = new Especial(frase, separador);
            analisis.mostrar();
    
    }
}
