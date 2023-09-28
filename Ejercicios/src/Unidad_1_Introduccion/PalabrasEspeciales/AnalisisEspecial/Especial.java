package AnalisisEspecial;

public class Especial {
    private String frase;
    private String separador;

    public Especial(String frase, String separador){
        this.frase = frase;
        this.separador = separador;
    }
    
    public void mostrar(){
        String[] palabras = frase.split(separador);
        System.out.println(palabras.length);
    }


}
