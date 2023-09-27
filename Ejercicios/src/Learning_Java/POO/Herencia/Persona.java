package Learning_Java.POO.Herencia;

public class Persona {
        //Atributos
        //Estan privados solo son accedidos por los metodos de la clase propia
        private String nombre;
        private String apellido;
        private int edad;
        //El modificador protected pueden ser accedidos por las clases hijas
        
        public Persona(String nombre, String apellido, int edad){
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        //Getters
        public String getNombre(){
            return nombre;
        }
        public String getApellido(){
            return apellido;
        }
        public int getEdad(){
            return edad;
        }

}
