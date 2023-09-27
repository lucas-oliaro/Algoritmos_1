package Learning_Java.POO.Encasuplamiento.paquete;

public class Clase1 {
    /*
     * encapsular los valores de los metodos.
     * Es ocultar los atributos de una clase y solo se puedan acceder por los metodos de la clase.
     */
    private int edad;
    private String nombre;

    //Setter
    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Getter
    public int getEdad(){
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

    
}
