package Plik4;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    
        System.out.print("Podaj liczbę pięter w hotelu: ");
        int liczbaPieter = input.nextInt();

        while (liczbaPieter < 1) {
            System.out.print("Liczba pięter musi być większa niż 0. Podaj poprawną wartość: ");
            liczbaPieter = input.nextInt();
        }

        int liczbaPokoi = 0;
        int liczbaZajetych = 0;

        for (int i = 1; i <= liczbaPieter; i++) {
            System.out.println("Piętro " + i);
            System.out.print("Podaj liczbę wszystkich pokojów na tym piętrze (min. 10): ");
            int wszystkiePokoje = input.nextInt();

            while (wszystkiePokoje < 10) {
                System.out.print("Liczba pokojów musi być większa lub równa 10. Podaj poprawną wartość: ");
                wszystkiePokoje = input.nextInt();
         }

            liczbaPokoi += wszystkiePokoje;

            System.out.print("Podaj liczbę zajętych pokojów na tym piętrze: ");
            int zajetePokoje = input.nextInt();

            while (zajetePokoje < 0 || zajetePokoje > wszystkiePokoje) {
                System.out.print("Liczba zajętych pokojów musi być między 0 a liczbą wszystkich pokojów. Podaj poprawną wartość: ");
                zajetePokoje = input.nextInt();
         }

            liczbaZajetych += zajetePokoje;
        }

        int liczbaWolnych = liczbaPokoi - liczbaZajetych;
        double poziomObl = (double) liczbaZajetych / liczbaPokoi;

        System.out.println("Liczba wszystkich pokojów: " + liczbaPokoi);
        System.out.println("Liczba zajętych pokojów: " + liczbaZajetych);
        System.out.println("Liczba wolnych pokojów: " + liczbaWolnych);
        System.out.printf("Poziom obłożenia: %.2f%n", poziomObl);
    }
}
