package Learning_Java.POO.Encasuplamiento.paquete;

public class Clase2 {
    public static void main(String[] args){
        Clase1 objeto = new Clase1();
       //objeto.edad = 1000; Atributo privado solo se pueden aceder por metodos de la Clase1
       objeto.setEdad(15); //Utilizo el setter para modificar el atributo edad
       objeto.setNombre("Pepe");

       System.out.println("La edad es " +objeto.getEdad()+ " y su nombre es " + objeto.getNombre()); //Utilizo el getter para obtener el valor del atributo edad
    }
}
