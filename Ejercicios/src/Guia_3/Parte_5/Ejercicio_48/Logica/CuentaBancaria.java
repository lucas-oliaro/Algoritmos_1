package Guia_3.Parte_5.Ejercicio_48.Logica;

import Guia_3.Parte_5.Ejercicio_48.Interfaces.Medible;

public class CuentaBancaria implements Medible{
     private float saldo;

    public CuentaBancaria() {
        this.saldo = 0.f;
    }

    @Override
    public float obtenerMedida() {
        return saldo;
    }

    @Override
    public void incremntarMedida(float incremento) {
        saldo += incremento;
    }

    @Override
    public boolean decrementarMedida(float valor) {
        if (saldo - valor > 0) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    
}
