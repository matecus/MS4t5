package Plik3;
import java.util.Scanner;

public class Petle8 {
    public static void main(String[] args) {
        int product = 0;
        Scanner klawiatura = new Scanner(System.in);
        int mnoznik = 10;
        do {
            System.out.print("Wprowadź liczbę: ");
            int liczba = klawiatura.nextInt();
            product = liczba * mnoznik;
        } while (product < 100);
        System.out.println("Wartość zmiennej product wyniosła 100 lub więcej.");
    }
}









