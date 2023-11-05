package Guia_3.Parte_4.Ejercicio_41;

public class Wrapper<T> {
    private T attribute;

    public Wrapper(T attribute) {
        this.attribute = attribute;
    }

    public T getAttribute() {
        return attribute;
    }

    public void setAttribute(T attribute) {
        this.attribute = attribute;
    }

    public void display() {
        System.out.println("Valor del atributo: " + attribute.toString());
    }

    public static void main(String[] args) {
        // Ejemplo de uso con un Integer
        Wrapper<Integer> intWrapper = new Wrapper<>(42);
        intWrapper.display(); // Muestra "Valor del atributo: 42"

        intWrapper.setAttribute(99);
        intWrapper.display(); // Muestra "Valor del atributo: 99"

        // Ejemplo de uso con una String
        Wrapper<String> stringWrapper = new Wrapper<>("Hola, mundo");
        stringWrapper.display(); // Muestra "Valor del atributo: Hola, mundo"

        stringWrapper.setAttribute("Hola, Java");
        stringWrapper.display(); // Muestra "Valor del atributo: Hola, Java"
    }
}
