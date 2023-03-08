package4;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int predkosc, czas;
        do {
            System.out.print("Podaj prędkość pojazdu (w km/h): ");
            predkosc = klawiatura.nextInt();
        } while (predkosc < 0);

        do {
            System.out.print("Podaj czas podróży (w godzinach): ");
            czas = klawiatura.nextInt();
        } while (czas < 1);

        int odleglosc = 0;
        System.out.println("Godzina\tPrzebyta odległość");
        System.out.println("-----------------------------");
        for (int i = 1; i <= czas; i++) {
            odleglosc += predkosc;
            System.out.println(i + "\t" + odleglosc);
        }
    }
}
