package libro;
import java.time.LocalDate;
//hay que meter si o si las cosas dentro del paquete

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
        
    
    
    // Constructor con parámetros
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = LocalDate.now().getYear();
    }

    //Constructor de año etc
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }
    //metodo
    public void mostrar_info(){
        System.out.println("Los datos son: " + titulo + "," + autor + "," +  añoPublicacion);
    }
}