package Learning_Java.POO.ClasesYObjetos;

public class ProgramaPersona {
    
    public static void main(String[] args) {
        //Constructor 1
        Persona p1 = new Persona("Alejandro","Perez", 16);
        p1.mostrarDatos();

        //Constructor 2
        Persona p2 = new Persona("12345678");
        p2.mostrarDatos("14");
    }
}
