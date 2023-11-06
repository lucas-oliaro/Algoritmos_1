package Guia_3.Parte_5.Ejercicio_48.Logica;
import Guia_3.Parte_5.Ejercicio_48.Interfaces.Medible;


public class MedidorDePresion implements Medible {
    private float unidades;
    private int incrementosConsecutivos = 0;
    private boolean ultimoFueDecremento = false;

    public MedidorDePresion() {
        this.unidades = 0;
    }
    @Override
    public float obtenerMedida() {
        return unidades;
    }

    @Override
    public void incremntarMedida(float incremento) {
        if (ultimoFueDecremento) {
            ultimoFueDecremento = false;
        }
        incrementosConsecutivos++;
        unidades += incremento;
    }   

    @Override
    public boolean decrementarMedida(float valor) {
        if (ultimoFueDecremento) {
            throw new IllegalStateException("No pueden existir dos decrementos consecutivos");
        }
        float decrementoRealizado = valor / incrementosConsecutivos;
        unidades -= decrementoRealizado;
        incrementosConsecutivos = 0;
        return ultimoFueDecremento = true;
    }

}