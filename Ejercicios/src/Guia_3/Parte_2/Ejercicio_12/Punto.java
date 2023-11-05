package Guia_3.Parte_2.Ejercicio_12;

public class Punto { 
    public int x; 
    public int y; 
    public Punto(int a, int b) {x = a; y = b;} 
    public Punto(int z) {this(z, z);} 
    } 

public class Prueba { 
    public static void main(String[] args) { 
    Punto p = new Punto(25); 
    System.out.println("x = " + p.x + " y = " + p.y); 
    } 
} 

