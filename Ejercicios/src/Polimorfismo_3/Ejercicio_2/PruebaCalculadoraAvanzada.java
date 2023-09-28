package Polimorfismo_3.Ejercicio_2;

public class PruebaCalculadoraAvanzada {
    

    public static void main(String[] args) {
        CalculadoraAvanzada calculadora = new CalculadoraAvanzada();

        System.out.println("Suma de 2 + 3 = " + calculadora.sumar(2, 3));
        System.out.println("Suma de 2.5 + 3.5 = " + calculadora.sumar(2.5, 3.5));
        System.out.println("Resta de 2 - 3 = " + calculadora.restar(2, 3));
        System.out.println("Resta de 2.5 - 3.5 = " + calculadora.restar(2.5, 3.5));
        System.out.println("Multiplicación de 2 * 3 = " + calculadora.multiplicar(2, 3));
        System.out.println("Multiplicación de 2.5 * 3.5 = " + calculadora.multiplicar(2.5, 3.5));
        System.out.println("División de 2 / 3 = " + calculadora.dividir(2, 3));
        System.out.println("División de 2.5 / 3.5 = " + calculadora.dividir(2.5, 3.5));
    
    }
}
