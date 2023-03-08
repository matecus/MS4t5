package Plik4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // pobieranie liczby lat
        System.out.print("Podaj liczbę lat: ");
        int liczbaLat = input.nextInt();

        // sprawdzanie poprawności danych wejściowych
        while (liczbaLat < 1) {
            System.out.print("Liczba lat musi być większa niż 0. Podaj poprawną wartość: ");
            liczbaLat = input.nextInt();
        }

        int lacznaLiczbaOpadow = 0; // zmienna przechowująca łączną liczbę opadów
        int liczbaMiesiecy = liczbaLat * 12; // liczba miesięcy w okresie

        // pętla zewnętrzna iterująca po latach
        for (int rok = 1; rok <= liczbaLat; rok++) {
            System.out.printf("Rok %d%n", rok);

            // pętla wewnętrzna iterująca po miesiącach
            for (int miesiac = 1; miesiac <= 12; miesiac++) {
                System.out.printf("Podaj liczbę centymetrów opadów w miesiącu %d: ", miesiac);
                int opady = input.nextInt();

                // sprawdzanie poprawności danych wejściowych
                while (opady < 0) {
                    System.out.print("Liczba opadów nie może być ujemna. Podaj poprawną wartość: ");
                    opady = input.nextInt();
                }

                lacznaLiczbaOpadow += opady; // dodanie opadów do łącznej liczby opadów
            }
        }

        double sredniPoziomOpadow = (double) lacznaLiczbaOpadow / liczbaMiesiecy;

        // wyświetlenie wyników
        System.out.println("Liczba miesięcy: " + liczbaMiesiecy);
        System.out.println("Łączna liczba opadów: " + lacznaLiczbaOpadow);
        System.out.println("Średni poziom opadów: " + String.format("%.2f", sredniPoziomOpadow) + " cm/miesiąc");
    }
}
