package Guia_3.Parte_5.Ejercicio_SemiIntegrador.Logica;

public class Ejerciciointegrador {
 
    public static void main(String[] args){
        // Creo cada tipo de pokemon
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        squirtle.atarcarAraniazo();
        squirtle.atacarBurbuja();

        charmander.atarcarAraniazo();
        charmander.atacarPunioFuego();

        bulbasaur.atarcarAraniazo();
        bulbasaur.atarcarDrenaja();

        pikachu.atarcarAraniazo();
        pikachu.atacarImpactarYrueno();
    }
}
