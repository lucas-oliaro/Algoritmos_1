package Guia_3.Parte_3.Ejercicio_37.excepciones;

public class MontoInsuficienteException extends RuntimeException {
    
        public MontoInsuficienteException() {
            super("El monto ingresado es mayor al saldo disponible.");
        }
}
