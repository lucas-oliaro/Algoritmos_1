


abstract public class Viaje{ //Convertimos toda la clase abstractca
    //Atributos
    protected Trayecto trayecto;
    protected int cantVagones;
    protected int cantMaxPasajeros;
    
    //Constructores
    public Viaje(Trayecto trayecto, int cantVagones, int cantMaxPasajeros){
        
        this.trayecto = trayecto;
        this.cantVagones = cantVagones;
        this.cantMaxPasajeros = cantMaxPasajeros;
    }

    //Metodos
    abstract public double tiempoDemora(); //Clase abstractca no tiene definicion
        //Lo define cada subclase
        //Todas las subclases tienen este metodo




}