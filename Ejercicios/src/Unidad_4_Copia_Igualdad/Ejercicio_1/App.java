package Unidad_4_Copia_Igualdad.Ejercicio_1;

public class App {
    public static void main(String[] args){
        //Creo un objeto de tipo EstudianteGrado
        EstudianteGrado eGrado = new EstudianteGrado("Ingenieria en Sistemas", "Juan", 20, 123456);
        EstudianteGrado eGrado2 = new EstudianteGrado("Ingenieria en Arboles", "Pepe", 21, 123456);

        //Creo un objeto de tipo EstudiantePosgrado
        EstudiantePosgrado ePosgrado = new EstudiantePosgrado("Maestria en Sistemas", "Pedro", 25, 123455);
        EstudiantePosgrado ePosgrado2 = new EstudiantePosgrado("Maestria en Sistemas", "Rodo", 25, 123458);

        //Creo un objeto de tipo Estudiante
        Estudiante est = new Estudiante("Juan", 20, 123);
        Estudiante est2 = new Estudiante("A", 22, 123);

        if (eGrado.equals(eGrado2)){
            System.out.println("Los estudiantes son iguales");
        } else {
            System.out.println("Los estudiantes son diferentes");
        }

        if (ePosgrado.equals(ePosgrado2)){
            System.out.println("Los estudiantes son iguales");
        } else {
            System.out.println("Los estudiantes son diferentes");
        }
        
        if (est.equals(est2)){
            System.out.println("Los estudiantes son iguales");
        } else {
            System.out.println("Los estudiantes son diferentes");
        }

        //no funca con eGrado, pues no tiene el metodo equals
        if (eGrado == eGrado2){
            System.out.println("Los estudiantes son iguales");
        } else {
            System.out.println("Los estudiantes son diferentes");
        }

    }
    
}
