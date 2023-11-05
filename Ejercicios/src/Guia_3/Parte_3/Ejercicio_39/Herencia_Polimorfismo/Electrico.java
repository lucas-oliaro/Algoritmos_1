package Guia_3.Parte_3.Ejercicio_39.Herencia_Polimorfismo;

public class Electrico extends TipoDeViaje{
    @Override
    public double tiempoDeDemora(double distancia, int estaciones, int capacidadPasajeros) {
        return distancia * estaciones / 2;
    }
}
