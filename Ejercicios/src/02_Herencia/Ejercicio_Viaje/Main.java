
public class Main {
    public static void main(String[] args){
        Trayecto bariloche = new Trayecto("CABA", "Bariloche Aires", 1500, 5);
        Viaje barilocheDiesel = new Diesel(bariloche, 10, 500);

        System.out.println(barilocheDiesel.tiempoDemora());
    } 
}
