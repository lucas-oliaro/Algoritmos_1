package Unidad_8_colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HisotriaAcademica {

    public static void main(String[] args){
        //Map que relacione a una materia con un conjunto de calificaciones (Set de Double).
        Map<Materia, Set<Double>> materias = new HashMap<>();

    }

    //Funcion que calcule el promedio de calificaciones de una materia
    public static double promedio(Set<Double> calificaciones){
        double suma = 0;
        for (Double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }

    //Funcion que devuelva la cantidad de aplazos
    public static int aplazos(Set<Double> calificaciones){
        int aplazos = 0;
        for (Double calificacion : calificaciones) {
            if (calificacion < 2) {
                aplazos++;
            }
        }
        return aplazos;
    }

    //Funcion que devuelva la cantidad de materias 
    public static int materiasCursadas(Map<Materia, Set<Double>> materias){
        return materias.size();
    }

}
