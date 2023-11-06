package Guia_3.Parte_7.Introduccion_Coleccitons;

import java.util.*;


public class PruebaMapas {
    public static void main(String[] args){
        // Clave, Valor
        HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
        personal.put("145", new Empleado("Pepe"));
        personal.put("146", new Empleado("Juan"));
        personal.put("147", new Empleado("Maria"));
        personal.put("148", new Empleado("Luis"));

        System.out.println(personal);
        //Remuevo
        personal.remove("147");

        System.out.println(personal);
        // Sustituyo
        personal.put("146", new Empleado("Pedro"));
        
        // Sirve para recorrer el mapa
        System.out.println(personal.entrySet());
    
        for (Map.Entry<String, Empleado> entrada: personal.entrySet()){
            String clave = entrada.getKey();
            Empleado valor = entrada.getValue();
            System.out.println("Clave: " + clave + " Valor: " + valor);
        }
    
    }

}

class Empleado{
    private String nombre;
    private double sueldo;

    public Empleado(String nombre){
        this.nombre = nombre;
        this.sueldo = 1000;
    }


    public String toString(){
        return "Nombre: " + this.nombre + " Sueldo: " + this.sueldo;
    }
}