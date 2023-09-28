package Polimorfismo_3.Ejercicio_1;

public class App {
    
    public static void main(String[] args){
        Medio[] medios = new Medio[3];
        medios[0] = new Musica("The Beatles", "Rock", 1960, "MP3");
        medios[1] = new Pelicula("Stanley Kubrick", "Ciencia ficción", "2001: A Space Odyssey", "DVD");
        medios[2] = new Libro("J. R. R. Tolkien", "Fantasía", 732, "Tapa dura");
    
    for (Medio medio : medios) {
        System.out.println(medio.reproducir());
    }
    }
}
