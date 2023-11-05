package Guia_3.Parte_5.Ejercicio_SemiIntegrador.Logica;

public class Bulbasaur extends Pokemon implements IPlanta {
    public Bulbasaur(){
        
    }

    @Override
    protected void atarcarPlacaje() {
        // Print de ataque
        System.out.println("Bulbasaur ataca con placaje");
    }

    @Override
    protected void atarcarAraniazo() {
        System.out.println("Bulbasaur ataca con araniazo");
    }

    @Override
    protected void atarcarMordisco() {
        System.out.println("Bulbasaur ataca con mordisco");
    }

    @Override
    public void atarcarDrenaja() {
        System.out.println("Bulbasaur ataca con drenaja");
    }

    @Override
    public void atacarParalizar() {
       System.out.println("Bulbasaur ataca con paralizar");
    }
    
}
