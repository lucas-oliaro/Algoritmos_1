class Animal {
    void comer() {
        System.out.println("El animal come alimentos.");
    }
}

class Perro extends Animal {
    void ladrar() {
        System.out.println("El perro ladra.");
    }
}

public class HerenciaSimple {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.comer();    // Heredado de Animal
        miPerro.ladrar();   // Propio de Perro
    }
}