package Guia_3.Parte_3.Ejercicio_39;

public class Viaje {
    private String origen;
    private String destino;
    private double distancia;
    private int estaciones;
    private int vagones;
    private int capacidadPasajeros;
    private String tipo;

    public Viaje(String origen, String destino, double distancia, int estaciones, int vagones, int capacidadPasajeros, String tipo) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.estaciones = estaciones;
        this.vagones = vagones;
        this.capacidadPasajeros = capacidadPasajeros;
        this.tipo = tipo;
    }

    public double tiempoDemora() {
        if (tipo.equals("Diesel")) {
            return ((distancia*estaciones) / 2) + ((estaciones + capacidadPasajeros)/10);
        } if (tipo.equals("Electrico")) {
            return ((distancia*estaciones) / 2);
        } else {
            return (distancia/10);

        }
    }

    // Metodo main para testear cada caso de tipo
    public static void main(String[] args) {
        Viaje viaje1 = new Viaje("Buenos Aires", "La Plata", 50, 5, 10, 100, "Diesel");
        Viaje viaje2 = new Viaje("Buenos Aires", "La Plata", 50, 5, 10, 100, "Electrico");
        Viaje viaje3 = new Viaje("Buenos Aires", "La Plata", 50, 5, 10, 100, "Tren Bala");

        System.out.println("Tiempo de demora viaje 1: " + viaje1.tiempoDemora()+ " mins");
        System.out.println("Tiempo de demora viaje 2: " + viaje2.tiempoDemora()+ " mins");
        System.out.println("Tiempo de demora viaje 3: " + viaje3.tiempoDemora()+ " mins");
    }

}
