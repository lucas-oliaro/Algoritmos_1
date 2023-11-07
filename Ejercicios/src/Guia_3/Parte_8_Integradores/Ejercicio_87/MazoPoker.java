package Guia_3.Parte_8_Integradores.Ejercicio_87;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MazoPoker {
    private List<Carta> mazo;   
    private List<String> palos = List.of("Pica", "Corazón", "Diamante", "Trébol");
    private List<String> valores = List.of("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J","Q", "K");
    
    public MazoPoker() {
        mazo = new ArrayList<Carta>();
        for (String palo : palos) {
            for (String valor : valores) {
                mazo.add(new Carta(valor, palo));
            }
        }
    }

    public void barajar(){
        Collections.shuffle(mazo);
    }

    public List<Carta> sacarCartasArriba(int cantidad){
        List<Carta> cartasSacadas = new ArrayList<Carta>();

        try {for (int i = 0; i < cantidad; i++) {
            cartasSacadas.add(mazo.remove(0));
            }
            return cartasSacadas;}
        catch (Exception e) {
            System.out.println("No hay más cartas");
            return cartasSacadas;
        }
    }

    public List<Carta> sacarCartasAbajo(int cantidad){
        List<Carta> cartasSacadas = new ArrayList<Carta>();

        try {for (int i = 0; i < cantidad; i++) {
            cartasSacadas.add(mazo.remove(mazo.size() - 1));
            }
            return cartasSacadas;
        } 
        catch (Exception e) {
            System.out.println("No hay más cartas");
            return cartasSacadas;
        }
    }


    public void colocarCartasArriba(List<Carta> cartas){
        if ((cartas.size()+cartas.size())  < 52) {
            mazo.addAll(0, cartas);
        } 
        else {
            throw new RuntimeException("Esta tratando de agregar cartas de más");
        }
    }

    public void colocarCartasAbajo(List<Carta> cartas){
        if ((cartas.size()+cartas.size())  < 52) {
            mazo.addAll(cartas);
        } 
        else {
            throw new RuntimeException("Esta tratando de agregar cartas de más");
        }
    }

    // Ordenar mazo por el orden de palos solicitado y por valor 
    public void ordenarPorPalo(){
        Collections.sort(mazo);
    }

   

    // Main para probar
    public static void main(String[] args) {
        MazoPoker mazo = new MazoPoker();
        mazo.barajar();
        // itero sobre el mazo e imprimo
        for (Carta carta : mazo.mazo) {
            System.out.println(carta);
        }

    }

    

}
