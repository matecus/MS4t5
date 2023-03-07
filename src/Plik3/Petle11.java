import java.util.Scanner;

public class Petle11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Podaj liczbę:");
            int liczba = klawiatura.nextInt();
            suma += liczba;
        }

        System.out.println("Suma wynosi: " + suma);
    }
}
