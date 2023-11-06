package Guia_3.Parte_6.Intro.Exceptions;

public class NombreInvalidoException extends Exception {
    public NombreInvalidoException() {
        super("El nombre del estudiante no puede ser nulo o vacío.");
    }
}
