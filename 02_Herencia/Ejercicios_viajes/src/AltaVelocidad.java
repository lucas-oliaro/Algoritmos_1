package Ejercicio_Tipos_viajes;


public class AltaVelocidad extends Viaje {

    public AltaVelocidad(Trayecto tracyecto, int cantVagones, int cantMaxPasajeros) {
        super(tracyecto, cantVagones, cantMaxPasajeros);
    }


    @Override
    public double tiempoDemora() {
          return tracyecto.getDistancia()/10
    }
}
