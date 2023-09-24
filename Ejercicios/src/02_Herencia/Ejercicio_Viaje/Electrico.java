

public class Electrico extends Viaje{
    
 
    //Constructores
    public Electrico(Trayecto trayecto, int cantVagones, int cantMaxPasajeros){
        super(trayecto, cantVagones, cantMaxPasajeros);
    }
 
 
 
 
    //Implementar los metodos abstractos que imp,eemto
    @Override //ESta bueno ponerlo
    public double tiempoDemora(){
        return (trayecto.getDistancia()*2 trayecto.cantEstaciones())/2;
    }
  


}
