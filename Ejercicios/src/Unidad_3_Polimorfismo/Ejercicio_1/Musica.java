package Polimorfismo_3.Ejercicio_1;

public class Musica extends Medio {
    //Atributos
    private String artista;
    private String genero;
    private int año;


    //Constructor
    public Musica(String artista, String genero, int año, String modelo){
        super(modelo);
        this.artista = artista;
        this.genero = genero;
        this.año = año;
    }
    
    //metodos
    @Override
    public String reproducir(){
        return "Reproduciendo música: " + artista + " - " + genero + " - " + año;
    }
}
