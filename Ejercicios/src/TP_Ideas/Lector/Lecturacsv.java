import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

package TP_Ideas.Lector;

public class Lecturacsv {

    public static void main(String[] args) {
        //TO DO: Change to the right expresion in the file, find the right CSV.
        /*
         * String currentDirectory = System.getProperty("user.dir");
         * String csvFilePath = currentDirectory + "/src/utils/archivo.csv";
         */
        String csvFilePath = "ruta/al/archivo.csv"; // Reemplaza con la ruta real de tu archivo CSV

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            List<String[]> data = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                data.add(row);
            }

            // Itera sobre las filas y columnas del archivo CSV
            for (String[] row : data) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println(); // Nueva línea para la siguiente fila
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
