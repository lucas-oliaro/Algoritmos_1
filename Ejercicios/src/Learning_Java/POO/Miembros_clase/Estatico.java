package Learning_Java.POO.Miembros_clase;
//Miembros estaticos

public class Estatico{
    //Atributos 
    private static String frase = "Esto es una frase";

    //Atributos estaticos
    //private static String frase_estatico = "Frase estatica";
    /*ESte atributo no le pertenece a los objetos sino a la case
     * por lo que no puede ser modificada
     * */



     //Metodos estaticos
        /*Le pertenece a la clase, no va salir en las referencias pues no le pertenece a los obejtos
         * El metodo es estatico y le pertenece a la clase
         */
        public static int sumar(int n1, int n2){
            int suma = n1+n2;
            return suma;
        }

    public static void main(String[] args){
        Estatico estatico1 = new Estatico();
        //Sabemos que va a salir primera frase
        System.out.println(estatico1.frase);

        Estatico estatico2 = new Estatico();
        //Sabemos que va a salir primera frase
        System.out.println(estatico2.frase);

        /*Cuando creamos un objeto nuevo saca una copia 
        de todos los atributos y metodos que no sean estaticos 
        Como cada objeto es una copia distinas, podemos modificar cada objeto
        */
        estatico2.frase = "Esto es una frase modificada";
        System.out.println(estatico2.frase);
        //Si modificamos el atributo estatico, se modifica para todos los objetos
        System.out.println(estatico1.frase);
        

        //La clase es dueña del atributo por lo que no es necesario crear objetos
        System.out.println(Estatico.frase);

        //Metodo estatico
        System.out.println(Estatico.sumar(5, 4));

        }

        

}