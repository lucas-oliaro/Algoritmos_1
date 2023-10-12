package Unidad_8_colecciones;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Escuela {
    
    private List<String> listaEstudiantes;
    //Conjunto de tipo set para alamcenar materias y su estado (abierta, cerrada)
    private Map<String, String> materiasOfrecidas;


    public static void main(String[] args){
        //Crear objeto de tipo escuela
        Escuela escuela = new Escuela();
        //Agregar estudiantes
        escuela.agregarEstudiante("Juan");
        escuela.agregarEstudiante("Pedro");
        escuela.agregarEstudiante("Maria");

       //Agregar materias al mapa con estado (abierta, cerrada)
        escuela.materiasOfrecidas.put("Matematicas", "abierta");
        escuela.materiasOfrecidas.put("Fisica", "abierta");
        escuela.materiasOfrecidas.put("Quimica", "cerrada");
        escuela.materiasOfrecidas.put("Programacion", "abierta");

        // Ingresar calificaciones para Juan
        escuela.ingresarCalificacion("Juan", "Matematicas", 8.5);
        escuela.ingresarCalificacion("Juan", "Fisica", 7.0);
        escuela.ingresarCalificacion("Juan", "Quimica", 9.0);
        escuela.ingresarCalificacion("Juan", "Programacion", 8.0);

        // Ingresar calificaciones para Pedro
        escuela.ingresarCalificacion("Pedro", "Matematicas", 7.0);
        escuela.ingresarCalificacion("Pedro", "Fisica", 6.5);
        escuela.ingresarCalificacion("Pedro", "Quimica", 8.0);
        escuela.ingresarCalificacion("Pedro", "Programacion", 7.5);

        // Ingresar calificaciones para Maria
        escuela.ingresarCalificacion("Maria", "Matematicas", 9.0);
        escuela.ingresarCalificacion("Maria", "Fisica", 8.5);
        escuela.ingresarCalificacion("Maria", "Quimica", 7.0);
        escuela.ingresarCalificacion("Maria", "Programacion", 9.5);
    }

    //Metodo que agrega estudiantes
    public void agregarEstudiante(String nombre){
        listaEstudiantes.add(nombre);
    }

    public void ingresarCalificacion(String nombreEstudiante, String nombreMateria, double calificacion) {
        // Check if the subject exists in the materiasOfrecidas map
        if (!materiasOfrecidas.containsKey(nombreMateria)) {
            System.out.println("La materia " + nombreMateria + " no existe en la escuela.");
            return;
        }
    
        // Add the grade for the student in the subject
        // First, find the index of the student in the listaEstudiantes list
        int index = listaEstudiantes.indexOf(nombreEstudiante);
        if (index == -1) {
            System.out.println("El estudiante " + nombreEstudiante + " no existe en la escuela.");
            return;
        }
    
        // Create a new map to store the grades for the student
        Map<String, Double> calificaciones = new HashMap<>();
    
        // Check if the student already has grades for other subjects
        if (index < calificacionesEstudiantes.size()) {
            calificaciones = calificacionesEstudiantes.get(index);
        }
    
        // Add the grade for the subject
        calificaciones.put(nombreMateria, calificacion);
    
        // Update the calificacionesEstudiantes list with the new grades for the student
        if (index < calificacionesEstudiantes.size()) {
            calificacionesEstudiantes.set(index, calificaciones);
        } else {
            calificacionesEstudiantes.add(calificaciones);
        }
    }
}
