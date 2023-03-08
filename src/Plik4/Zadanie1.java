package Plik4;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int liczba;
        do {
            System.out.print("Podaj dodatnią niezerową liczbę całkowitą: ");
            liczba = klawiatura.nextInt();
        } while (liczba <= 0);

        int suma = 0;
        int i = 1;
        while (i <= liczba) {
            suma += i;
            i++;
        }
        System.out.println("Suma liczb od 1 do " + n + " wynosi: " + suma);
    }
}
