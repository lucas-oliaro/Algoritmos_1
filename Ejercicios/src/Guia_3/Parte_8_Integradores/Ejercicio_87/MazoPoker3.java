package Guia_3.Parte_8_Integradores.Ejercicio_87;

import java.util.*;

public class MazoPoker3 {
    private Deque<Carta3> mazo;


    private MazoPoker3(){
        mazo = new LinkedList<>();
        String[] palos = {"D", "C", "T", "P"};
        String[] valores = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String palo : palos){
            for (String valor : valores){
                mazo.add(new Carta3(valor, palo));
            }
        }
    }

    public MazoPoker3 crearMazoPoker3(){
        return new MazoPoker3();
    }

    public void barajar(){
        List<Carta3> mazoLista = new ArrayList<>(mazo);
        Collections.shuffle(mazoLista);
        mazo = new LinkedList<>(mazoLista);
    }

    public List<Carta3> sacarCartasArriba(int cantidad){
        List<Carta3> cartas = new ArrayList<>();
        if (cantidad <= mazo.size()){
            for (int i = 0; i < cantidad; i++){
                cartas.add(mazo.removeFirst());
            }
        } else {
            throw new IllegalArgumentException("No hay suficientes cartas");
        }
        return cartas;
    }

    public List<Carta3> sacarCartasAbajo(int cantidad){
        List<Carta3> cartas = new ArrayList<>();
        if (cantidad <= mazo.size()){
            for (int i = 0; i < cantidad; i++){
                cartas.add(mazo.removeLast());
            }
        } else {
            throw new IllegalArgumentException("No hay suficientes cartas");
        }
        return cartas;
    }

    public void colocarCartasArriba(List<Carta3> cartas){
        Collections.reverse(cartas);
        for (Carta3 carta : cartas) {
           mazo.addFirst(carta); 
        }
    }

    public void colocarCartasAbajo(List<Carta3> cartas){
        mazo.addAll(cartas);
    }

    public void ordenar(String[] orden_palos){
        List<Carta3> ordenadas = new ArrayList<>(mazo);
        int n = mazo.size();
        boolean hubo_cambio;

        do {
            hubo_cambio = false;
            for (int i = 1; i < n; i++){
                Carta3 carta1 = ordenadas.get(i);
                Carta3 carta2 = ordenadas.get(i-1);

                if(comparacion(carta1, carta2, orden_palos) > 0){
                    ordenadas.set(i-1, carta1);
                    ordenadas.set(i, carta2);
                    hubo_cambio = true;
                }
            }
            n--;
        } while (hubo_cambio);

        mazo = new LinkedList<>(ordenadas);
    }

    private int comparacion(Carta3 carta1, Carta3 carta2, String[] orden_palos) {
        String palo1 = carta1.getPalo();
        int valor1 = carta1.getValorInt();

        String palo2 = carta2.getPalo();
        int valor2 = carta2.getValorInt();

        List<String> palos = new ArrayList<>(Arrays.asList(orden_palos));

        int comparacion = Integer.compare(palos.indexOf(palo1), palos.indexOf(palo2));
        
        if (comparacion == 0){
            return Integer.compare(valor1, valor2);
        }
        return comparacion;
    }

    // Main 
    public static void main(String[] args) {
        MazoPoker3 mazo = new MazoPoker3();
        mazo.barajar();
        // itero sobre el mazo e imprimo
        for (Carta3 carta : mazo.mazo) {
            System.out.println(carta);
        }
    }
}