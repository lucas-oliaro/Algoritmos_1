package Guia_3.Parte_5.Ejercicio_SemiIntegrador.Logica;

public class Charmander extends Pokemon implements IFuego{
    public Charmander(){
        
    }

    // implemento los metodos abstractos
    @Override
    protected void atarcarPlacaje() {
        // Print de ataque
        System.out.println("Charmander ataca con placaje");
    }

    @Override
    protected void atarcarAraniazo() {
        System.out.println("Charmander ataca con araniazo");
    }

    @Override
    protected void atarcarMordisco() {
        System.out.println("Charmander ataca con mordisco");
    }

    @Override
    public void atacarPunioFuego() {
       System.out.println("Charmander ataca con punio de fuego");
    }

    @Override
    public void atarcarLanzallamas() {
        System.out.println("Charmander ataca con lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander ataca con ascuas");
    }
    
}
