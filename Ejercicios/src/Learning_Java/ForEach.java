package Learning_Java;

public class ForEach {

    public static void main(String[] args){
        String[] nombres = {"Juan", "Pedro", "Pablo", "Luis", "Carlos"};

        /*
         * La mejora es que no se necesita declarar una variable de control
         * ni tampoco se necesita saber el tamaño del arreglo.
         * 
         * La sintaxis es:
         */
        for (String nombre : nombres){
            System.out.println(nombre);
        }

    }
    
}
