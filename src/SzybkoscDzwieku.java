import java.util.Scanner;
public class SzybkoscDzwieku {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadz powietrze, woda lub stal");
        String substancja = klawiatura.nextLine();
        System.out.println("Wprowadz odległość: ");
        double odleglosc = klawiatura.nextDouble();
        double czas=0.0;
        if(substancja.charAt(0)=='p'){
            czas=odleglosc/343;
        }
        if(substancja.charAt(0)=='w'){
            czas=odleglosc/1490;
        }
        if(substancja.charAt(0)=='s'){
            czas=odleglosc/5100;
        }
        System.out.println("Czas wynosi:" + czas + " [ms].");

    }
}