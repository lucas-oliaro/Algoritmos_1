package Guia_3.Parte_3.Ejercicio_34;

public abstract class Numero {
    protected float valor;

    // Constructor
    public Numero(float valor) {
        this.valor = valor;
    }

    // Operaciones Suma, producto y mostrar valor
    public abstract Numero sumar(Numero otroNumero);
    public abstract Numero producto(Numero otroNumero);
    public abstract void mostrarValor();
}
