package Guia_3.Parte_4.Ejercicio_44;

import java.util.ArrayList;
import java.util.List;

public class Pila2<E> {
    private List<E> elementos;

    public Pila2() {
        elementos = new ArrayList<>();
    }

    public void push(E elemento) {
        elementos.add(elemento);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.remove(elementos.size() - 1);
    }

    public int size() {
        return elementos.size();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public static void main(String[] args) {
        Pila2<Integer> pilaArrayList = new Pila2<>();
        pilaArrayList.push(1);
        pilaArrayList.push(2);
        pilaArrayList.push(3);

        while (!pilaArrayList.isEmpty()) {
            System.out.println("Elemento pop: " + pilaArrayList.pop());
        }
    }
}
