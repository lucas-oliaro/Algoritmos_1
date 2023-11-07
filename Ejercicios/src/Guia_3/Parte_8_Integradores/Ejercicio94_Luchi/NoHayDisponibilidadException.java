package Guia_3.Parte_8_Integradores.Ejercicio94_Luchi;


public class NoHayDisponibilidadException extends RuntimeException{
    public NoHayDisponibilidadException(){
        super();
    }
     public NoHayDisponibilidadException(String error_message){
        super(error_message);
    }
}
