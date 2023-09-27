package Learning_Java.POO.Constantes;

public class Persona {
    //Atributo que es una variable
    private int edad;
    /*Atributo que es una constante
    No puedo crear cambiar una constante, una vez que esta no se puede cambiar
    */
    private final String nombre;

    //Constructor
    public Persona(int edad ,String nombre){
    this.nombre = nombre;
    this.edad = edad;
    }
 
    //
    public void getDatos(){
        System.out.println("La edad es " + edad + " y su nombre es " + nombre);
    }

    //getter
    public int getEdad(){
        return edad;
    }
    //Setter
    public void setEdad(int edad){
        this.edad = edad;
    }

    

    
}
