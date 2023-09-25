package Learning_Java.POO.ClasesYObjetos;

public class Coche {
    //Atributos
    public String color;
    public String marca;
    int km;

    //Metodos
    public static void main(String[] args){
        Coche coche1 = new Coche();

        coche1.color = "Rojo";
        coche1.marca = "Ferrari";
        coche1.km = 0;

        System.out.println("El color del coche es: " + coche1.color);
        System.out.println("La marca del coche es: " + coche1.marca);
        System.out.println("El kilometraje del coche es: " + coche1.km);
    
        Coche coche2 = new Coche();

        coche2.color = "Azul";
        coche2.marca = "Audi";
        coche2.km = 100;

        System.out.println("El color del coche es: " + coche2.color);
        System.out.println("La marca del coche es: " + coche2.marca);
        System.out.println("El kilometraje del coche es: " + coche2.km);
            
    }



}
