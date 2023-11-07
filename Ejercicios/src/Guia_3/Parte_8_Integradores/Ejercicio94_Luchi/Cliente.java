package Guia_3.Parte_8_Integradores.Ejercicio94_Luchi;

import java.util.*;

public class Cliente {
    private String nombre;
    private List<Reserva> reservas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void reservar(Hotel hotel, int cant_ocupantes, String fechaEntrada, String fechaSalida){
        if (hotel.getTipos().contains(cant_ocupantes)){

            if (hotel.verDisponibilidad(cant_ocupantes,fechaEntrada, fechaSalida)) {
                    Reserva reserva = new Reserva(hotel, fechaEntrada, fechaSalida);
                    hotel.guardarReserva(reserva, cant_ocupantes);
                    reservas.add(reserva);
            } else {
                throw new NoHayDisponibilidadException();
            }
        } else {
            throw new IllegalArgumentException();
        } 
    }

    public void canceclarReserva(Reserva reserva){
        reserva.getHotel().getHabitaciones().get(reserva.getHabitacion()).remove(reserva);
        reservas.remove(reserva);
    }

    public int calcularReserva(Reserva reserva){
        return reserva.calcularPrecio();
    }

    public void mostrarReservas(){
        for (Reserva reserva : reservas){
            System.out.println(reserva.toString());
            System.out.println();
        }
    }

}
