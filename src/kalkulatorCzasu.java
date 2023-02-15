import java.util.Scanner;
public class kalkulatorCzasu {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadź liczbę sekund: ");
        double sekundy = klawiatura.nextDouble();
        klawiatura.nextLine();

        final int min = 60;
        final int hour = 3600;
        final int day = 86400;
        if (sekundy >=min) {
            double min2 = sekundy/min;
            double sek2 = sekundy/min;
            System.out.println(sekundy + "sekund to " + min2+ "minut." );}








    }
}
