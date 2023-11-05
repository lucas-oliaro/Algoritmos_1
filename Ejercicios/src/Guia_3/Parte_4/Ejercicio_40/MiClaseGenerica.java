package Guia_3.Parte_4.Ejercicio_40;

public class MiClaseGenerica<T> {
    private T dato;

    public MiClaseGenerica(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }


    // Main
    public static void main(String[] args) {
        MiClaseGenerica<Integer> miClaseGenerica = new MiClaseGenerica<>(1);
        System.out.println(miClaseGenerica.getDato());

        MiClaseGenerica<String> miClaseGenerica2 = new MiClaseGenerica<>("Hola");
        System.out.println(miClaseGenerica2.getDato());
    }
}
