package Unidad_8_colecciones;

public class Estudiante {
    private String nombre;
    private int matricula;
    private int edad;
    private HisotriaAcademica historial;

    public Estudiante(String nombre, int matricula, int edad, HisotriaAcademica historial) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.historial = historial;
    }
    
    //Metodo equal y hashcode
    @Override
    public boolean equals(Object obj) {
        Estudiante e = (Estudiante) obj;
        return this.matricula == e.matricula;
    }

    @Override
    public int hashCode() {
        return this.matricula;
    }
    
}

