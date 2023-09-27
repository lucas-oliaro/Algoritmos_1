package Learning_Java.POO.Herencia;

public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;


    //Consturctor
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
        super(nombre, apellido, edad); //Ya estan inicializados en la clase padre
        
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos(){
        //Se pueden hacer dos cosas modificar el metodo de acceso o usar los getters a protegidos
        System.out.println("Nombre: " + getNombre() + "\nApellido: " 
        + getApellido() + "\nEdad: " + getEdad() +
         "\nCodigo: "+ codigoEstudiante + "\nNota Final: " + notaFinal);
    }

}
