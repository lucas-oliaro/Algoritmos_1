package Estudiante;

public class Estudiante {
    // Atributos
    private String nombre;
    private int edad;
    private String carrera;
    private String[] materias;

    // Constructor
    public Estudiante(String nombre, int edad, String carrera, String[] materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.materias = materias;
    }

    //Creo un metodo para mostrar la info
    public void mostrar_info(){
        System.out.println("Los datos son: " + nombre + "," + edad + "," +  carrera + " Materias:");
        //Bucle para las materias 
        for (String materia : materias){
            System.out.println(materia);    
        }
    }

    //Creo un objeto de tipo Estudiante 
    public static void main(String[] args) {
        String[] materias = {"Matematica", "Fisica", "Quimica"};
        Estudiante estudiante1 = new Estudiante("Juan", 20, "Ingenieria", materias);
        estudiante1.mostrar_info();
    }
}
