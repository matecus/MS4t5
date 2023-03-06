package Plik1;

import java.util.Scanner;
public class Zadanie12 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.print("Wprowadź liczbę przejechanych kilometrów: ");
        double liczbaPrzejechanychKilometrow = klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.print("Wprowadź ilość zużytych litrów paliwa: ");
        double liczbaZuzytychLitrowPaliwa = klawiatura.nextDouble();
        klawiatura.nextLine();
        double kilometryNaLitrze = liczbaPrzejechanychKilometrow/liczbaZuzytychLitrowPaliwa;
        System.out.println("Liczba kilometrów przejechanych na litrze paliwa wynosi: " + kilometryNaLitrze + " [km].");



    }
}
