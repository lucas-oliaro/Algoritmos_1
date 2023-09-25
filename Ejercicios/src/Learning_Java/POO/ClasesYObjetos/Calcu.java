package Learning_Java.POO.ClasesYObjetos;

public class Calcu {
    //Atributos
    private int num1, num2;
    private int suma, resta;

    //Metodos
    public void leerNumeros() {
        //Usuario introduce los numeros
        System.out.println("Introduce el primer numero: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce el segundo numero: ");
        num2 = Integer.parseInt(System.console().readLine());
    }

    //Metodos
    public void sumar() {
        this.suma = num1 + num2;
    }

    public void restar() {
        this.resta = num1 - num2;
    }


    //mostrar resultados
    public void mostrarResultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
    }
}
