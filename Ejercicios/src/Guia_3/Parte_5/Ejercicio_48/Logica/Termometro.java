package Guia_3.Parte_5.Ejercicio_48.Logica;

import Guia_3.Parte_5.Ejercicio_48.Interfaces.Medible;

public class Termometro implements Medible {
    private float temperatura;

    public Termometro(float temperatura) {
        if (temperatura < -273.0f) {
            this.temperatura = -272.0f;
        } else {
            this.temperatura = temperatura;
        }
    }

    @Override
    public float obtenerMedida() {
        return temperatura;
    }

    @Override
    public void incremntarMedida(float incremento) {
        temperatura += incremento;
    }

    @Override
    public boolean decrementarMedida(float valor) {
        if (temperatura - valor >= -273.0f) {
            temperatura -=valor;
            return true;
        } else {
            return false;
        }
    }


}
