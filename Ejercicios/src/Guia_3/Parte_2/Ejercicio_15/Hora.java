package Guia_3.Parte_2.Ejercicio_15;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void visualizarHora() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    public Hora sumarHoras(Hora otraHora) {
        int totalSegundos = this.segundos + otraHora.segundos;
        int segundos = totalSegundos % 60;
        int totalMinutos = this.minutos + otraHora.minutos + totalSegundos / 60;
        int minutos = totalMinutos % 60;
        int horas = this.horas + otraHora.horas + totalMinutos / 60;
        horas %= 24;
        return new Hora(horas, minutos, segundos);
    }

    public void sumarHorasEnLugar(Hora otraHora) {
        int totalSegundos = this.segundos + otraHora.segundos;
        int segundos = totalSegundos % 60;
        int totalMinutos = this.minutos + otraHora.minutos + totalSegundos / 60;
        int minutos = totalMinutos % 60;
        int horas = this.horas + otraHora.horas + totalMinutos / 60;
        horas %= 24;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public static void main(String[] args) {
        Hora hora1 = new Hora(10, 30, 45);
        Hora hora2 = new Hora(2, 15, 20);
        Hora hora3 = new Hora();

        hora3.sumarHorasEnLugar(hora1.sumarHoras(hora2));

        hora3.visualizarHora();
    }
}

