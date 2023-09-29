package Unidad_4_Copia_Igualdad.Ejercicio_2;

public class Main {
    public static void main(String[] args){
        Persona personita = new Persona("Nahuek",22,424242);
        Persona personita2 = new Persona(personita);

        personita2.setEdad(23);
        System.out.println(personita);
        System.out.println(personita2);


        Persona personita3 = personita.copiaSuperficial();
        personita.setNroDocumento(1221212);
        System.out.println(personita3+"/n");
        personita2.setNroDocumento(5464687);
        System.out.println(personita);
        System.out.println(personita2);
    }
}

