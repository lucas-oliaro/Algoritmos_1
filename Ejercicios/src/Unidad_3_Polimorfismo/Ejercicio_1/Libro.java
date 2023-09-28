package Polimorfismo_3.Ejercicio_1;

public class Libro extends Medio {
    private String autor;
    private String titulo;
    private int paginas;

    //constructor
    public Libro(String autor, String titulo, int paginas, String modelo) {
        super(modelo);
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    @Override
    public String reproducir() {
        return "Reproduciendo libro: " + autor + " - " + titulo + " - " + paginas + " páginas";
    }
}
