package Guia_3.Parte_3.Ejercicio_34;

public class Entero extends Numero{
    public Entero(float valor) {
        super(valor);
    }

    @Override
    public Numero sumar(Numero otroNumero) {
        return new Complejo(this.valor + otroNumero.valor);
    }

    @Override
    public Numero producto(Numero otroNumero) {
        return new Complejo(this.valor * otroNumero.valor);
    }

    @Override
    public void mostrarValor() {
        System.out.println("Valor: " + this.valor);
    }
    
}
