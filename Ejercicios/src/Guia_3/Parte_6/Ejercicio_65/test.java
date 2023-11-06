package Guia_3.Parte_6.Ejercicio_65;

class FutbolException extends Exception {}

class Falta extends FutbolException {}

class EquipoIncompleto extends FutbolException {}

class ClimaException extends Exception {}

class Lluvia extends ClimaException {}

class Mano extends Falta{}

class Partido {
    Partido() throws FutbolException {}
    void evento() throws FutbolException {}
    void jugada() throws EquipoIncompleto, Falta {}
    void penal() throws Falta {}
}

interface Tormenta {
    void evento() throws Lluvia;
    void diluvio() throws Lluvia;
}

public class Encuentro extends Partido implements Tormenta {
    Encuentro() throws Lluvia {}
    void evento() throws Lluvia {}
    void diluvio() throws Lluvia {}
}
    Encuentro (String fecha) throws Falta, FutbolException {}
    void penal() throws Mano {}
    public void evento() throws Lluvia {}
    public void diluvio() throws Lluvia {}
    void jugada() throws Mano {}
}

class Main {
    public static void main (String[] args) {
        try {
            Encuentro enc = new Encuentro();
            enc.jugada();
        } catch (Mano e) {
        } catch(Lluvia e) {
        } catch(FutbolException e) {
            try {
                Partido par = new Encuentro();
                par.jugada();
            } catch(EquipoIncompleto | Falta | Lluvia | FutbolException e) {
            }
        }
    }
}