package Guia_3.Parte_7.Introduccion_Coleccitons;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayLists {

    public static void main(String[] args) {
      
        // Lista que guarda personas  
        List<Persona> lista = new ArrayList<Persona>();
        
        
        lista.add(new Persona(1, "Luisina", 30));
        lista.add(new Persona(2, "Gabriel", 30));
        lista.add(new Persona(3, "Ibra", 9));
        lista.add(new Persona(4, "TodoCode", 2));        
      
        System.out.println("------PRUEBA FOR COMÚN--------");
        //recorido for por índice
        for (int i=0; i<lista.size(); i++) {
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }
        
        System.out.println("------PRUEBA FOREACH--------");
        //recorrido por foreach
            for (Persona persona:lista) {
                System.out.println("prueba " + persona.getNombre());
            }
            
        // Linked lista
        List<Persona> lista2 = new LinkedList<Persona>();
        lista2.add(new Persona(1, "Luisina", 30));
        lista2.add(new Persona(2, "Gabriel", 30));
        lista2.add(new Persona(3, "Ibra", 9));
        lista2.add(new Persona(4, "TodoCode", 2));   

        //Agregar al principio
        lista2.add(1,new Persona(5, "Lucas", 25));


        System.out.println("------PRUEBA FOREACH--------");
        //recorrido por foreach
            for (Persona persona:lista2) {
                System.out.println("prueba " + persona.getNombre());
            }
     }
    
}
