package Guia_3.Parte_3.Ejercicio_37;

import Guia_3.Parte_3.Ejercicio_37.entidades.Cuenta;
import Guia_3.Parte_3.Ejercicio_37.operaciones.ConsultaSaldo;
import Guia_3.Parte_3.Ejercicio_37.operaciones.Deposito;
import Guia_3.Parte_3.Ejercicio_37.operaciones.Extraccion;
import Guia_3.Parte_3.Ejercicio_37.operaciones.Transaccion;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1);
        Cuenta cuenta2 = new Cuenta(1);
        
        Transaccion trx1 = new Deposito(cuenta1, 100);
        trx1.procesar();
        Transaccion trx2 = new ConsultaSaldo(cuenta1);
        trx2.procesar(); //Consulto saldo

        Transaccion trx3 = new Extraccion(cuenta1, 50);
        trx3.procesar();
        trx2.procesar(); //Consulto saldo 

        Transaccion trx4 = new Deposito(cuenta1, 150);
        trx4.procesar();
        trx2.procesar(); //Consulto saldo final

        
    }
}
