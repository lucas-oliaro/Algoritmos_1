package Guia_3.Parte_3.Ejercicio_34;

public class app {
    //Creo metodo main para testear la clase numero y sus subclases
    public static void main(String[] args) {
        Numero numero1 = new Entero(10);
        Numero numero3 = new Complejo(2.5f);

        numero1.mostrarValor();
        numero3.mostrarValor();

        numero1.sumar(numero3).mostrarValor();
        numero3.sumar(numero1).mostrarValor();

        numero1.producto(numero3).mostrarValor();
    }
}
