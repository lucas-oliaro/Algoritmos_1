package Guia_3.Parte_8_Integradores.Ejercicio94_Luchi;


public class Habitacion {
    private int numero;
    private int ocupantes;
    private int precio;

    public Habitacion(int numero, int ocupantes, int precio){
        this.numero = numero;
        this.precio = precio;
        this.ocupantes = ocupantes;
    }

    public int getOcupantes(){
        return this.ocupantes;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public int getPrecio() {
            return precio;
        }
}
