package Learning_Java.POO.Abstractos;

public class App {
    public static void main(String[] args) {
        //Servivo es abstracto no podemos crear objetos
        Planta planta = new Planta();   
        planta.alimentarse();
        /*
         * Si trato de crear un objeto de la clase animal 
         * me va a marcar error porque es abstracta
         * no se puede Animal animal = new Animal(); ERROR
         */


        AnimalVege animalVege = new AnimalVege();
        animalVege.alimentarse();
        
        AniamlaCarne aniamlaCarne = new AniamlaCarne();
        aniamlaCarne.alimentarse();
    }   
}
