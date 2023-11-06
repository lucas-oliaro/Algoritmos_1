package Guia_3.Parte_6.Intro.Exceptions;

public class EdadInvalidaException extends Exception {
    public EdadInvalidaException() {
        super("La edad del estudiante debe estar entre 0 y 120 años.");
    }
}
