import TablaMultiplicar.Tablita; //O * importa todas las clases

public class Programa {
    

    public static void main(String[] args){
        System.out.println("Ingrese un numero");
        int numero = Integer.parseInt(System.console().readLine());
        
        Tablita tablita = new Tablita(numero);
        tablita.mostrar();


    }
    
}
