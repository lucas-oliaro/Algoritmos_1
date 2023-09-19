package EjTabla;
public class Main {
        public static void main(String[] args) {
            System.out.print("Ingrese un número: ");
            Integer valorEntrada = Integer.parseInt(System.console().readLine());
            Tabla tablita = new Tabla(valorEntrada);
            tablita.generarTabla();
    }
}
