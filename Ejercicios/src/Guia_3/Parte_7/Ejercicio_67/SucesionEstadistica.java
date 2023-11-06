package Guia_3.Parte_7.Ejercicio_67;

import java.util.ArrayList;

public class SucesionEstadistica {
    private ArrayList<Double> sucesion;
    
    public SucesionEstadistica() {
        sucesion = new ArrayList<Double>();
    }
    
    public void agregarElemento(double elemento) {
        sucesion.add(elemento);
    }
    
    public int cantidadElementos() {
        return sucesion.size();
    }
    
    public double mediaAritmetica() {
        double suma = 0;
        for (double elemento : sucesion) {
            suma += elemento;
        }
        return suma / sucesion.size();
    }
    
    public double desvioStandard() {
        double media = mediaAritmetica();
        double suma = 0;
        for (double elemento : sucesion) {
            suma += Math.pow(elemento - media, 2);
        }
        return Math.sqrt(suma / sucesion.size());
    }
}
