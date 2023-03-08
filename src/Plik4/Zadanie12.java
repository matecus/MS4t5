package Plik4;
import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        int[] sales = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        // Pobieranie wartości sprzedaży dla każdego ze sklepów
        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj dzisiejszą wartość sprzedaży dla sklepu nr " + (i + 1) + ": ");
            sales[i] = scanner.nextInt();
        }
        
        // Wyświetlanie wykresu słupkowego
        System.out.println("WYKRES SŁUPKOWY Z POZIOMEM SPRZEDAŻY");
        for (int i = 0; i < 5; i++) {
            System.out.print("Sklep nr " + (i + 1) + ": ");
            int stars = sales[i] / 100;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
