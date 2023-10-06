package TP_Ideas;

public class App {
    public static void main(String[] args){
        Integer[][] m1 = {
            {1,2,3,4}
            {5,6,7,8}
        };
        String[] cols = new String[4] = 
        Matriz<Integer> miMatriz = new Matriz<>(m1, cols);
        miMatriz.setCelda(0,0,9);
        Systemen.out.println(miMatriz);
    }
}
