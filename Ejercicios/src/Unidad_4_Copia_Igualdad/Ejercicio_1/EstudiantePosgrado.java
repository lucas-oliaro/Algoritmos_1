package Unidad_4_Copia_Igualdad.Ejercicio_1;

public class EstudiantePosgrado extends Estudiante {
    protected String carreraPosgrado;

    public EstudiantePosgrado(String carreraPosgrado ,String nombre, int edad, int matricula) {
        super(nombre, edad, matricula);
        this.carreraPosgrado = carreraPosgrado;
    }
    
}
