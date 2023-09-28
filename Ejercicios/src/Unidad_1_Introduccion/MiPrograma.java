import introduccion.HolaMundo;
import libro.Libro;


public class MiPrograma {
    public static void main(String[] args) {
        HolaMundo hola = new HolaMundo();
        hola.DeciHolaMundo();

        Libro libro = new Libro("La vuelta al mundo", "Julio Verne");
        libro.mostrar_info(); //printean
        
        Libro libro2 = new Libro("EEEE", "eeee2", 1922);
        libro2.mostrar_info();
    }
}
