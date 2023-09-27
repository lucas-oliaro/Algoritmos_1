package Learning_Java.POO.Polimorfismo;

public class Prinicipal {
    //Arreglo de vehiclos
    public static void main(String[] args){
        //Arrelog de vehiculos aca no hay polimorfismo sino en
        Vehiculo misVehiculos[] = new Vehiculo[4];


        misVehiculos[0] = new Vehiculo("GHJ-123", "Ford", "Fiesta");

        //Instanciamos los objetos, o se aun hijo de Vehiculos
        //el metodo mostrar datos se comporta de manera diferente, o sea de la clase hija correspondiente
        
        misVehiculos[1] = new VehiculoTurismo(4, "HJK-456", "Chevrolet", "Aveo");
        misVehiculos[2] = new VehiculoDeportivo(350, "KJH-789", "Ferrari", "F50");
        misVehiculos[3] = new VehiculoFurgoneta(1000, "JHG-321", "Nissan", "NV350");

        for (Vehiculo vehiculo : misVehiculos) {
            System.out.println(vehiculo.mostrarDatos() + "\n");
        }
    }
}
