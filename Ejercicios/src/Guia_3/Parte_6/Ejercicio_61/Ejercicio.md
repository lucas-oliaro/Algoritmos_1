``` java 
class Excepcion1 extends Exception {}
class Excepcion2 extends Exception1 {}
public class Test {
    public static void main(String[] args) {
        try {
            throw new Exception2();
        }
        catch(Excepcion1 e1) {
            System.out.println(“Se capturó la Excepción1”);
        }
        catch( Excepcion2 e2) {
            System.out.println(“Se capturó la Excepción2”);
        }
    }
} 
```

Solucion por que se escribe asi

