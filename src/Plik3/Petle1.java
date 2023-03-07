import java.util.Scanner;

public class Petle1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int liczba = 0;

        while (liczba < 10 || liczba > 24) {
            System.out.print("Proszę wpisać liczbę z przedziału od 10 do 24: ");
            liczba = klawiatura.nextInt();

            if (liczba < 10 || liczba > 24) {
                System.out.println("Liczba spoza przedziału, proszę spróbować ponownie.");}
        }

        System.out.println("Wpisana liczba jest poprawna.");
    }
}
