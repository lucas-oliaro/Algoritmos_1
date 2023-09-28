


public class Diesel extends Viaje{
    
 
    //Constructores
    public Diesel(Trayecto trayecto, int cantVagones, int cantMaxPasajeros){
        super(trayecto, cantVagones, cantMaxPasajeros);
    }
 
 
 
 
    //Implementar los metodos abstractos que imp,eemto
    @Override //ESta bueno ponerlo
    public double tiempoDemora(){
        return ((Trayecto.getDistancia()*Trayecto.getCantEstaciones())/2 +
         (Trayecto.getCantEstaciones()+cantMaxPasajeros)/10.0;
    }
  


}
