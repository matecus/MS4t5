package Plik4;
import java.util.Scanner;

    public class Zadanie9 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   
   
       // pobieranie początkowej liczby organizmów
        int liczbaOrganizmow;
        do {
            System.out.print("Podaj początkową liczbę organizmów (minimum 2): ");
            liczbaOrganizmow = input.nextInt();
        } while (liczbaOrganizmow < 2);
    
        // pobieranie średniego dziennego przyrostu populacji
        double sredniDziennyPrzyrost;
        do {
            System.out.print("Podaj średni dzienny przyrost populacji (w procentach, większy lub równy 0): ");
            sredniDziennyPrzyrost = input.nextDouble();
        } while (sredniDziennyPrzyrost < 0);
    
        // pobieranie liczby dni rozmnażania
        int liczbaDniRozmazania;
        do {
            System.out.print("Podaj liczbę dni rozmnażania (minimum 1): ");
            liczbaDniRozmazania = input.nextInt();
        } while (liczbaDniRozmazania < 1);
    
        // obliczanie wielkości populacji każdego dnia
        double populacja = liczbaOrganizmow;
        for (int dzien = 1; dzien <= liczbaDniRozmazania; dzien++) {
            System.out.printf("Dzień %d: %.0f%n", dzien, populacja);
            populacja += populacja * sredniDziennyPrzyrost / 100;
        }
    }
}
