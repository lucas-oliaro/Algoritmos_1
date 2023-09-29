package TP_Ideas;

public class Vector {
    
    public static void main(String[] args){
        Object vector[] = new Object[4];
        Object matriz[][]  = new Object[2][2];

        vector[0] = 1;
        vector[1] = "Hola";
        vector[2] = 3.14;
        vector[3] = true;
        
        mostrarVector(vector);

        matriz[0][0] = 1;
        matriz[0][1] = "Hola";
        matriz[0][2] = 3.14;
        matriz[0][3] = true;
        matriz[1][0] = 1;
        matriz[1][1] = "Hola";
        matriz[1][2] = 3.14;
        matriz[1][3] = true;

    }

    public static void mostrarVector(Object[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
