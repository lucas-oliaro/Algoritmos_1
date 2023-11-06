package Guia_3.Parte_6.Intro.Exceptions;

public class PromedioInvalidoException extends Exception {
    public PromedioInvalidoException() {
        super("El promedio del estudiante debe estar entre 0.0 y 10.0.");
    }
}
