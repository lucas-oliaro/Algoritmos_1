package Learning_Java.POO.Encasuplamiento.Paquete2;

//importar otras clases
import Learning_Java.POO.Encasuplamiento.Paquete1.Clase1;


public class Clase3 {
    public static void main(String[] args){
        Clase1 objeto1  = new Clase1();
        //objeto1.atributo1 = 15; //Atributo publico para clases del mismo paquete
        objeto1.atributo2 = 10; //Atributo publico para otros al no tener modificador de acceso
    }
}
