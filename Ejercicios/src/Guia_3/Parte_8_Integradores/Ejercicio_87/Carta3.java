package Guia_3.Parte_8_Integradores.Ejercicio_87;
import java.util.*;

public class Carta3{
    public String valor;
    public String palo;
    public String color;

    public Carta3(String valor, String palo){
        this.palo = palo;
        this.valor = valor;
        
        if(palo == "C" || palo == "D"){
            this.color = "R";
        } else {
            this.color = "N";
        }
    }

    public String getPalo() {
        return palo;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor + palo;
    }

    public int getValorInt() {
        String[] valores = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        return Arrays.asList(valores).indexOf(valor) + 1;
    }
}