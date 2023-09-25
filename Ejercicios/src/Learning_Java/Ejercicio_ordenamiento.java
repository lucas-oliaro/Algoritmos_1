public class Ejercicio_ordenamiento {
    public static void main(String[] args){
        int [] numeros = {1,3,20,5,6,10,9,8};
        int aux;

        for (int i=0; i<numeros.length; i++){
            for (int j=0; j < numeros.length; j++){
                if (numeros[i]<numeros[j]){
                    aux = numeros[i]; //1
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        
        for (int i=0; i<numeros.length; i++){
            System.out.print(numeros[i]+" ");
        }
    
    }
}
 


