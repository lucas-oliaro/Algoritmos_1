package Guia_3.Parte_5.Ejercicio_SemiIntegrador.Logica;

public class Pikachu extends Pokemon implements IElectrico {
    public Pikachu(){
        
    }

    @Override
    protected void atarcarPlacaje() {
        // Print de ataque
        System.out.println("Pikachu ataca con placaje");
    }

    @Override
    protected void atarcarAraniazo() {
        System.out.println("Pikachu ataca con araniazo");
    }

    @Override
    protected void atarcarMordisco() {
        System.out.println("Pikachu ataca con mordisco");
    }

    @Override
    public void atacarImpactarYrueno() {
        System.out.println("Pikachu ataca con impactar y rueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu ataca con punio trueno");
    }
    
}
