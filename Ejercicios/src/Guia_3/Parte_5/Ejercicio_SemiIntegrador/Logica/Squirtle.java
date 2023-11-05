package Guia_3.Parte_5.Ejercicio_SemiIntegrador.Logica;

public class Squirtle extends Pokemon implements IAgua{

    // Constructor
    public Squirtle(){
    }
    
    
    @Override
    protected void atarcarPlacaje() {
        // Print de ataque
        System.out.println("Squirtle ataca con placaje");
    }

    @Override
    protected void atarcarAraniazo() {
        System.out.println("Squirtle ataca con araniazo");
    }

    @Override
    protected void atarcarMordisco() {
        System.out.println("Squirtle ataca con mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle ataca con hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ataca con burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle ataca con pistola de agua");
    }
    
}

