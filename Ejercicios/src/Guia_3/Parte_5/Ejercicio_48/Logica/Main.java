package Guia_3.Parte_5.Ejercicio_48.Logica;

import java.util.ArrayList;
import Guia_3.Parte_5.Ejercicio_48.Interfaces.Medible;

public class Main {
    public static void main(String[] args) {
        ArrayList<Medible> listaMedibles = new ArrayList<>();
        listaMedibles.add(new Termometro());
        listaMedibles.add(new CuentaBancaria());
        listaMedibles.add(new MedidorDePresion());

        for (Medible medible : listaMedibles) {
            System.out.println(medible.getClass().getSimpleName());
            for (int i = 0; i < 100; i++) {
                if (i % 10 == 0) {
                    System.out.println(medible.obtenerMedida());
                }
                if (i % 2 == 0) {
                    medible.incremntarMedida(i);
                } else {
                   
                        medible.decrementarMedida(i);
                }
            }
        }
    }
}