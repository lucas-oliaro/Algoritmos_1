package EjTabla;

public class Tabla {
    private int valorEntrada;

    public Tabla(int valorEntrada){
        this.valorEntrada = valorEntrada;
    }

    public void generarTabla(){
        System.out.println("Tabla de multiplicar del " + valorEntrada + ":");
        for(int i = 1; i < 10; i++){
            System.out.println(valorEntrada + " x " + i + " = " + valorEntrada*i);
        }
    }
}
