package Unidad_4_Copia_Igualdad.Ejercicio_2;


public class Documento implements Cloneable {
    private int numero;

    public Documento(int numero) {
        this.numero = numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public Documento clone() {
        try {
            return (Documento) super.clone();   // Copia superficial de Documento
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}