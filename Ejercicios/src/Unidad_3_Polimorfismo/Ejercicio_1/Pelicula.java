package Polimorfismo_3.Ejercicio_1;

public class Pelicula extends Medio {
    private String director;
    private String genero;
    private String titulo;

    public Pelicula(String director, String genero, String titulo, String modelo){
        super(modelo);
        this.director = director;
        this.genero = genero;
        this.titulo = titulo;
    }

    @Override
    public String reproducir(){
        return "Reproduciendo película: " + director + " - " + genero + " - " + titulo;
    }
}
