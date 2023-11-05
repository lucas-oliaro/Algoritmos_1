package Guia_3.Parte_3.Ejercicio_37.operaciones;


import Guia_3.Parte_3.Ejercicio_37.entidades.Cuenta;

public class Extraccion extends Transaccion {

    private float monto = 0;

    public Extraccion(Cuenta cuenta, float monto) {
        super(cuenta);
        if (monto < 0) {
            throw new RuntimeException();   // MontoInvalidoException
        }
        this.monto = monto;
    }

    @Override
    public void procesar() {
        this.getCuenta().extraer(this.monto);
    }
    
}
