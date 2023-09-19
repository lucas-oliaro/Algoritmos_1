package TablaMultiplicar;


public class Tablita{
    private int numero;
    private int resultado;
    
    //Clase == Constructor
    public Tablita(int numero){
        this.numero = numero;
    
    }

    public void mostrar(){
    for (int i = 1; i<11; i++){
        
        resultado = numero * i;
        System.out.println(numero + "x" + i + "=" + resultado);
    }
    }
}