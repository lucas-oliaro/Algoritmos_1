package Rectangulo;

public class Rectangulo {
    //Atributos
    private double Largo;
    private double Ancho;

    //Constructor

    private Rectangulo(double Largo, double Ancho){
        this.Largo = Largo;
        this.Ancho = Ancho;
    }

    //Metodos
    public double calcularArea(){
        return Largo * Ancho;
    }

    public double calcularPerimetro(){
        return 2 * (Largo + Ancho);
    }


    //Main
    public static void main(String[] args) {
      Rectangulo rectangulo1 = new Rectangulo(10, 20);
      Rectangulo rectangulo2 = new Rectangulo(20, 30);
     
      System.out.println("El area del rectangulo 1 es: " + rectangulo1.calcularArea());
      System.out.println("El perimetro del rectangulo 1 es: " + rectangulo1.calcularPerimetro());

      System.out.println("El area del rectangulo 2 es: " + rectangulo2.calcularArea());
      System.out.println("El perimetro del rectangulo 2 es:" + rectangulo2.calcularPerimetro());
    }

}
