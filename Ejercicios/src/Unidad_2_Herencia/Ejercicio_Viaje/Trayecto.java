
public class Trayecto {
    public class Trayecto {

        private String origen;
        private String destino;
        private double distancia;
        private int cantEstaciones;

        //Constructores
        public Trayecto(String origen, String destino, double distancia, int cantEstaciones){
            this.origen = origen;
            this.destino = destino;
            this.distancia = distancia;
            this.cantEstaciones = cantEstaciones;
        }

        //Getter's
        public String getOrigen(){
            return this.origen;
        }

        public String getDestino(){
            return this.destino;
        }

        public int getCantEstaciones(){
            return this.cantEstaciones;
        }

        public double getDistancia(){
            return this.distancia;
        }
    }
}      