package Guia_3.Parte_2.Ejercicio_27;

public class CuentaCorriente {
    private float saldo;
    private int cantidadOperaciones;
    private int cantidadExtraccionesInvalidas;

    public CuentaCorriente(float saldoInicial) {
        saldo = saldoInicial;
        cantidadOperaciones = 0;
        cantidadExtraccionesInvalidas = 0;
    }

    public float saldo() {
        return saldo;
    }

    public void deposito(float imp) {
        saldo += imp;
        cantidadOperaciones++;
    }

    public void extraccion(float imp) {
        if (saldo >= imp) {
            saldo -= imp;
            cantidadOperaciones++;
        } else {
            cantidadExtraccionesInvalidas++;
        }
    }

    public int cantidadOperaciones() {
        return cantidadOperaciones;
    }

    public int cantidadExtraccionesInvalidas() {
        return cantidadExtraccionesInvalidas;
    }
    //Creo metodo main para testear la clase
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente(1000);
        cuenta.deposito(500);
        cuenta.extraccion(200);
        cuenta.extraccion(2000);
        System.out.println("Saldo: " + cuenta.saldo());
        System.out.println("Cantidad de operaciones: " + cuenta.cantidadOperaciones());
        System.out.println("Cantidad de extracciones invalidas: " + cuenta.cantidadExtraccionesInvalidas());
    }
}
