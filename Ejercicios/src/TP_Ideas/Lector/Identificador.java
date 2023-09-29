package TP_Ideas.Lector;

public class Identificador {

    public static String main(String value) {
        // TO DO: change the return value to the right data type 
        /*
         * Evaluar como retornanr como integerar lo que hbalamos hoy
         */

        // Comprobar si es numérico
        if (isNumeric(value)) {
            return "Numeric";
        }
        
        // Comprobar si es booleano
        if (isBoolean(value)) {
            return "Boolean";
        }
        
        // Comprobar si es una fecha (requiere validación más compleja)
        if (isDate(value)) {
            return "Date";
        }
        
        // Si no se cumple ninguna regla, considerar como cadena
        return "String";
    }

    private static boolean containsAlphabeticCharacters(String value) {
        return value.chars().anyMatch(Character::isLetter);
    }

    private static boolean isNumeric(String value) {
        return value.matches("-?\\d+(\\.\\d+)?"); // Acepta números enteros y decimales
    }

    private static boolean isBoolean(String value) {
        return value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false");
    }

    private static boolean isDate(String value) {
        // Implementa la validación de fechas aquí según el formato esperado
        // Por ejemplo, podrías usar SimpleDateFormat para validar fechas en un formato específico
        return false; // Cambia esto según tus necesidades
    }

    public static void main(String[] args) {
        String sampleValue = "2021";
        String dataType = inferDataType(sampleValue);
        System.out.println("Tipo de dato inferido: " + dataType);
    }
}
