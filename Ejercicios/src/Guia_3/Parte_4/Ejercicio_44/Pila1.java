package Guia_3.Parte_4.Ejercicio_44;

import java.util.Arrays;

public class Pila1<E> {
    private static final int CAPACIDAD_INICIAL = 10;
    private Object[] elementos;
    private int tamaño;

    public Pila1() {
        elementos = new Object[CAPACIDAD_INICIAL];
        tamaño = 0;
    }

    public void push(E elemento) {
        if (tamaño == elementos.length) {
            ampliarCapacidad();
        }
        elementos[tamaño] = elemento;
        tamaño++;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        E elemento = (E) elementos[tamaño - 1];
        elementos[tamaño - 1] = null;
        tamaño--;
        return elemento;
    }

    public int size() {
        return tamaño;
    }

    public boolean isEmpty() {
        return tamaño == 0;
    }

    private void ampliarCapacidad() {
        int nuevaCapacidad = elementos.length * 2;
        elementos = Arrays.copyOf(elementos, nuevaCapacidad);
    }

    public static void main(String[] args) {
        Pila1<Integer> pilaArray = new Pila1<>();
        pilaArray.push(1);
        pilaArray.push(2);
        pilaArray.push(3);

        while (!pilaArray.isEmpty()) {
            System.out.println("Elemento pop: " + pilaArray.pop());
        }
    }
}
