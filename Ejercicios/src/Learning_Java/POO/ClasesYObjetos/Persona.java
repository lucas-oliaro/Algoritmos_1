package Learning_Java.POO.ClasesYObjetos;

public class Persona {
    // Atributos
    String nombre;
    String apellido;
    int edad;
    String dni;

    /*
     * En este codigo se realiza una sobrecarga de metodos,
     * tanto el constructor como un metodo
     * Se diferencian por el tipo y la cantidad de parametr os
     */


    // Constructor
    public Persona(String nombre, String apellido,int edad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni){
        this.dni = dni;
    }

    // Métodos
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }

    public void mostrarDatos(String edad){
        System.out.println("DNI: " + edad);
    }


}