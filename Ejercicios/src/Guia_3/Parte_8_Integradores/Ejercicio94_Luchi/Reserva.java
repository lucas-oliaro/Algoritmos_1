package Guia_3.Parte_8_Integradores.Ejercicio94_Luchi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private Hotel hotel;
    private Habitacion habitacion;
    private String fechaEntrada;
    private String fechaSalida;

    public Reserva(Hotel hotel,String fechaEntrada, String fechaSalida) {
        this.hotel = hotel;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Hotel getHotel() {
            return hotel;
        }
    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }
    public Habitacion getHabitacion() {
        return habitacion;
    }

    public int calcularPrecio(){
        return habitacion.getPrecio() * cantDias();
    }

    private int cantDias() {
        LocalDate inicio = LocalDate.parse(fechaEntrada);
        LocalDate fin = LocalDate.parse(fechaSalida);
        return (int) ChronoUnit.DAYS.between(inicio, fin);
    }

    public String toString() {
        return "Reserva en " + hotel.getNombre() +
               " - Habitación: " + habitacion.getNumero() +
               " - Entrada: " + fechaEntrada +
               " - Salida: " + fechaSalida +
               " - Precio: " + calcularPrecio();
    }
}
