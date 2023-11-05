package Guia_3.Parte_5.Ejercicio_SemiIntegrador.Logica;

public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    // Todos mis metodos en la clase abs son abs
    protected abstract void atarcarPlacaje();
    protected abstract void atarcarAraniazo();
    protected abstract void atarcarMordisco();
    /* Aca me intersa que puede hacer un pokemon, no me intersa las caracteristicas ya que esas las tengo en mi clase prinicipal
     * por lo que conviene tener una interfaz ya que es una especificacion de que hace algo. Me intersa el ¿Qué hace algo?
     * Si tuviese el ¿qué es? utilizo clases abstractas
     */
}
