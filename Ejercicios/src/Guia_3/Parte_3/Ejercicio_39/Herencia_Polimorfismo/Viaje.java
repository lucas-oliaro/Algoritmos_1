package Guia_3.Parte_3.Ejercicio_39.Herencia_Polimorfismo;

import Unidad_2_Herencia.Ejercicio_Viaje.AltaVelocidad;
import Unidad_2_Herencia.Ejercicio_Viaje.Diesel;

public class Viaje {
    
    public class ViajeEjercicio39 {
        private String origen;
        private String destino;
        private double distancia;
        private int estaciones;
        private int vagones;
        private int capacidadPasajeros;
        private String tipo;

        public ViajeEjercicio39(String origen, String destino, double distancia, int estaciones, int vagones, int capacidadPasajeros, String tipo) {
            this.origen = origen;
            this.destino = destino;
            this.distancia = distancia;
            this.estaciones = estaciones;
            this.vagones = vagones;
            this.capacidadPasajeros = capacidadPasajeros;
            this.tipo = tipo;
        }

        public double tiempoDeDemora() {
            TipoDeViaje tipoDeViaje = null;

            if ("diesel".equals(tipo)) {
                tipoDeViaje = new Diesel();
            } else if ("eléctrico".equals(tipo)) {
                tipoDeViaje = new Eléctrico();
            } else if ("alta velocidad".equals(tipo)) {
                tipoDeViaje = new AltaVelocidad();
            }

            return tipoDeViaje.tiempoDeDemora(distancia, estaciones, capacidadPasajeros);
        }

        public static void main(String[] args) {
            ViajeEjercicio39 viaje1 = new ViajeEjercicio39("Buenos Aires", "Córdoba", 700, 10, 5, 200, "alta velocidad");
            System.out.println("El tiempo de demora es de " + viaje1.tiempoDeDemora() + " horas.");
        
            System.out.println("Tiempo de demora para viaje diesel: " + viaje1.tiempoDeDemora());

            Viaje viaje2 = new ViajeEjercicio39("Estación C", "Estación D", 150, 3, 2, 120, "eléctrico");
            System.out.println("Tiempo de demora para viaje eléctrico: " + viaje2.tiempoDeDemora());
        }
    }
}
