//Crear una superclase llamada Figura con un campo nombre y un método calcularArea(). 
//Luego, crear dos subclases llamadas Rectangulo y Circulo que hereden de Figura y proporcionen 
//implementaciones específicas para calcular el área de un rectángulo y un círculo. 
//Crear objetos de ambas subclases, calcular y mostrar sus áreas.

package Ejercicio_figuritas;


class Figura {
    private String nombre;

    //Constructor de nombre
    public Figura(String nombre){
        this.nombre = nombre;
    }

    //Metodo calcular area
    double calcularArea(){
        return 1*1;
    } 

}
