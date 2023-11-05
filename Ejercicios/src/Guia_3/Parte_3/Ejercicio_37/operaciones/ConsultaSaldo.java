package Guia_3.Parte_3.Ejercicio_37.operaciones;


import Guia_3.Parte_3.Ejercicio_37.entidades.Cuenta;

public class ConsultaSaldo extends Transaccion {

    public ConsultaSaldo(Cuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void procesar() {
        System.out.println(this.getCuenta() + " - Saldo: " + this.getCuenta().getSaldo());
    }
    
}
