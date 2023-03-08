package Plik4;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbę dni: ");
        int liczbaDni = input.nextInt();

        while (liczbaDni < 1) {
            System.out.print("Liczba dni musi być większa niż 0. Podaj poprawną wartość: ");
            liczbaDni = input.nextInt();
        }

        System.out.println("Dzień\tZarobek");
        System.out.println("--------------------");

        double zarobek = 0.01;
        double sumaZarobku = 0;

        for (int dzien = 1; dzien <= liczbaDni; dzien++) {
            System.out.println("%d\t%.2f zł%n", dzien, zarobek);
            sumaZarobku += zarobek;
            zarobek *= 2;
        }

        System.out.printf("Suma zarobku: %.2f zł%n", sumaZarobku);
    }
}
