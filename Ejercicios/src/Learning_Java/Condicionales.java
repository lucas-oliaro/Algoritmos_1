package Learning_Java;

import javax.swing.JOptionPane;

public class Condicionales {
    public static void main(String[] args){
        /*
         * la sentencia if
         * if (condicion) {
         *  isntruccion;
         * }
         * else{
         *  instruccion2
         * }
         */
        int numero, numero2 = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        if (numero == numero2) {
            JOptionPane.showMessageDialog(null, "El numero es "+ numero2);
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es diferente a ");
        }

    }
    
}
