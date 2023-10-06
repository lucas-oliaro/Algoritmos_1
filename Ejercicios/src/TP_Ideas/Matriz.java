package TP_Ideas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Matriz<T>{
    List<List<T>> columnas;
    //se podria cambiar en vez de T con celda

    //Ahora vemos lo de map
    /*
     * Agarra un dato y le pone un valor
     * Map<K = key, V = Value>
     * Para cambiar las etiquetas, 
     * 
     */
    Map<String, Integer> colLabels;

    
    public Matriz(int cantidadColumnas){
        //Inicializa la fila con las columnas
        columnas = new ArrayList<>();
        for (int j=0; j< cantidadColumnas; j++){
            columnas.add(j, new ArrayList<>());
        }
    }

    //Sobreescribo cosntructor
     
    public Matriz(int cantidadColumnas, String[] etiquetas){
        if (cantidadColumnas != etiquetas.length){
            throw new IllegalArgumentException("La longitud de etiqueteas no coincide");
        }

        //Inicializa la fila con las columnas
        columnas = new ArrayList<>();
        //Por cada nueva columna hay que propagar en ese map/diccionario la etiqueta con el indiice de la columna que creo
        colLabels = new HashMap<>(); //C
        for (int j=0; j< cantidadColumnas; j++){
            columnas.add(j, new ArrayList<>());
            //Con j, seria el valor de mi map 
            colLabels.put(etiquetas[j], j);
            //Armado el mapa de oclumna
        }
    }
    
    public Matriz(T[][] matriz){
        this(matriz[0].length);
        for (int j=0; j<columnas.size(); j++){
            //Constructor a nivel fila y a columna
            for (int i=0; i < matriz.length ;i++){
                columnas.get(j).add(i, matriz[i][j]);

            }
        }
    }

    public T getCelda(int fila, int columna){
        return columnas.get(columna).get(fila); //Columnas[Columna][fila]
    }
    public void setCelda(int fila, int columna, T Valor){
        columnas.get(columna).set(fila, Valor);
    }

    @Override
    public String toString(){
        String out = "";
        String sep = " | ";
        for (int i=0; i < columnas.get(index=0).size().)
    }
}

