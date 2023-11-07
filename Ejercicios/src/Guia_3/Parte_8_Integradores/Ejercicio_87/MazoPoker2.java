package Guia_3.Parte_8_Integradores.Ejercicio_87;

import java.util.ArrayList;
import java.util.Collections;


public class MazoPoker2 {
    private ArrayList<Carta> mazo;

    public MazoPoker2() {
        mazo = new ArrayList<Carta>();
        for (int i = 1; i <= 10; i++) {
            mazo.add(new Carta(i, "Pica"));
            mazo.add(new Carta(i, "Corazón"));
            mazo.add(new Carta(i, "Diamante"));
            mazo.add(new Carta(i, "Trébol"));
        }
        mazo.add(new Carta("J", "Pica"));
        mazo.add(new Carta("J", "Corazón"));
        mazo.add(new Carta("J", "Diamante"));
        mazo.add(new Carta("J", "Trébol"));
        mazo.add(new Carta("Q", "Pica"));
        mazo.add(new Carta("Q", "Corazón"));
        mazo.add(new Carta("Q", "Diamante"));
        mazo.add(new Carta("Q", "Trébol"));
        mazo.add(new Carta("K", "Pica"));
        mazo.add(new Carta("K", "Corazón"));
        mazo.add(new Carta("K", "Diamante"));
        mazo.add(new Carta("K", "Trébol"));
    }

    public void barajar() {
        Collections.shuffle(mazo);
    }

    public ArrayList<Carta> sacarCartasArriba(int cantidad) {
        ArrayList<Carta> cartas = new ArrayList<Carta>();
        for (int i = 0; i < cantidad; i++) {
            cartas.add(mazo.remove(0));
        }
        return cartas;
    }

    public ArrayList<Carta> sacarCartasAbajo(int cantidad) {
        ArrayList<Carta> cartas = new ArrayList<Carta>();
        for (int i = 0; i < cantidad; i++) {
            cartas.add(mazo.remove(mazo.size() - 1));
        }
        return cartas;
    }

    public void colocarCartasArriba(ArrayList<Carta> cartas) {
        mazo.addAll(0, cartas);
    }

    public void colocarCartasAbajo(ArrayList<Carta> cartas) {
        mazo.addAll(cartas);
    }

    public void ordenarPorPalo() {
        Collections.sort(mazo);
    }
}

class Carta implements Comparable<Carta> {
    private int numero;
    private String palo;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Carta(String letra, String palo) {
        switch (letra) {
            case "J":
                this.numero = 11;
                break;
            case "Q":
                this.numero = 12;
                break;
            case "K":
                this.numero = 13;
                break;
        }
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    public int compareTo(Carta otraCarta) {
        int paloComparado = this.palo.compareTo(otraCarta.getPalo());
        if (paloComparado == 0) {
            return Integer.compare(this.numero, otraCarta.getNumero());
        } else {
            return paloComparado;
        }
    }

    // Main para probar
    public static void main(String[] args) {
        MazoPoker2 mazo = new MazoPoker2();
        mazo.barajar();
        System.out.println(mazo.sacarCartasArriba(5));
        System.out.println(mazo.sacarCartasAbajo(5));
        mazo.colocarCartasArriba(mazo.sacarCartasAbajo(5));
        mazo.colocarCartasAbajo(mazo.sacarCartasArriba(5));
        System.out.println(mazo.sacarCartasArriba(5));
        System.out.println(mazo.sacarCartasAbajo(5));
        mazo.ordenarPorPalo();
        System.out.println(mazo.sacarCartasArriba(5));
        System.out.println(mazo.sacarCartasAbajo(5));
    }
}
