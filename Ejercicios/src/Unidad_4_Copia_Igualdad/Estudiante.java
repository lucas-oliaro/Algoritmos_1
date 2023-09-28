package Unidad_4_Copia_Igualdad;

public class Estudiante {
    protected String nombre;
    protected int edad;
    protected int matricula;
    
    //Constructor
    public Estudiante(String nombre, int edad, int matricula){
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }
    
    //Metodos
    //Sobrescribir el método equals en las clases Estudiante, EstudianteGrado y EstudiantePosgrado para comparar dos estudiantes en función de su matrícula y su carrera (ya sea grado o posgrado).
    @Override

    public boolean equals(Object obj) {
        if (obj instanceof Estudiante) {
            Estudiante estudiante = (Estudiante) obj; //converti obj en una clase de obj a estudiante (Casting)

            if (this.matricula == estudiante.matricula){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
