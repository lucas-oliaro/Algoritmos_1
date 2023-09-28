package Ejercicio_figuritas;


public class Rectangulo extends Figura{
    private float altura;
    private float ancho;

    public Rectangulo(String nombre, float altura, float ancho){
        //No Inicializo el atributo nombre, ya estan
        super(nombre);

        //Atributos
        this.altura = altura;
        this.ancho = ancho;
    }

    //Metodo de area
    @Override
    public flaot calcularArea(){
        return altura*ancho
    }
    
}
