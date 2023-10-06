import java.util.Arrays;

public class ListaNoGenerica {
    private static final int LONGITUD_BASE = 3;
    private Object[] elementos = new Object[LONGITUD_BASE];
    private int size = 0;

    public boolean esVacia() {
        return size == 0;
    }

    private boolean estructuraLlena() {
        return size == elementos.length;
    }

    public void agregar(Object elemento) {
        if (estructuraLlena()) {
            elementos = Arrays.copyOf(elementos, size + LONGITUD_BASE);
        }
        elementos[size++] = elemento;
    }

    public Object obtener(int indice) {
        if (indice < 0 || indice >= size) {
            throw new IndexOutOfBoundsException(indice);
        }
        return elementos[indice];
    }

    public void remover(Object elemento) {
        /*
         * No es una reduccion general del arreglo
         * EStamos haciendo un shift, hacemos un while y movemos cad aelemento actual
         * por el elemento que sigue.
         * Hago un desplazamiento desde el que quiero, ejemplo remover posicion 2.
         * Por lo que debeo trasaldar todos los elmentos que esten ubicados a la derecha de 2 (2+1,2+2,etc)
         * a la izquierda asi se elimina. 
         */
        int i = 0;
        boolean encontrado = false;
        while (i < size - 1) {
            
            if (encontrado || elementos[i].equals(elemento)) {
                encontrado = true;
                elementos[i] = elementos[i + 1];
            }
            i++;
        }
        if (encontrado || elementos[size-1].equals(elemento)) {
            elementos[i] = null;
            size--;
        }
    }



    

}