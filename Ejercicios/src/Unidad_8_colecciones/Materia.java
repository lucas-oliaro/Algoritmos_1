package Unidad_8_colecciones;

public class Materia {
   
    private String nombre;
    private String codigo;
    private boolean estado;

    public Materia(String nombre, String codigo, boolean estado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estado = estado;
    }

    //Implemntar metodo equals
    @Override
    public boolean equals(Object obj) {
        Materia m = (Materia) obj;
        return this.codigo.equals(m.codigo);
    }
    
}
