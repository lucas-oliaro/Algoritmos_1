package Unidad_4_Copia_Igualdad.Ejercicio_1;

public class EstudianteGrado extends Estudiante {
    protected String carreraGrado;

    //Constructor
    public EstudianteGrado(String carreraGrado ,String nombre, int edad, int matricula){
        super(nombre, edad, matricula);
        this.carreraGrado = carreraGrado;
    }


}
