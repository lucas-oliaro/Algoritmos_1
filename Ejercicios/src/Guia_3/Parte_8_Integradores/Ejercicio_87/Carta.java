package Guia_3.Parte_8_Integradores.Ejercicio_87;


public class Carta {
    private String palo;
    private String valor;
    private String color;
   
    public Carta(String valor, String palo){
        this.palo = palo;
        this.valor = valor;
        if (palo == "Pica" || palo == "Trébol"){
            this.color = "Negro";
        }else{
            this.color = "Rojo";
        }
    }

    public String getPalo(){
        return palo;
    }

    public String getValor(){
        return valor;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return valor + palo;
    }


    
}
