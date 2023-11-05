package Guia_3.Parte_3.Ejercicio_37.entidades;

import java.util.ArrayList;
import java.util.List;

import Guia_3.Parte_3.Ejercicio_37.excepciones.MontoInsuficienteException;
import Guia_3.Parte_3.Ejercicio_37.operaciones.Transaccion;

public class Cuenta {
    
    private int numero;
    private CodigoBancario codigoBancario;
    private float saldo;
    private List<Transaccion> operaciones;

    public Cuenta(int numero) {
        this.numero = numero;
        this.operaciones = new ArrayList<>();
        this.codigoBancario = new CodigoBancario();
    }

    public void agregarTransaccion(Transaccion trx) {
        operaciones.add(trx);
    }
    
    
    @Override
    public String toString() {
        return "Cuenta bancaria nro: " + numero + " (" + hashCode() + ")";
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float monto) {
        this.saldo += monto;
    }

    public void extraer(float monto) {
        if (saldo < monto) {
            throw new MontoInsuficienteException();
        }
        this.saldo -= monto;
    }

}
