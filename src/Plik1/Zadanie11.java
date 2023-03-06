package Plik1;

import java.util.Scanner;
public class Zadanie11 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Wprowadź wartość produktu: ");
        double wartoscProduktu = klawiatura.nextDouble();
        klawiatura.nextLine();
        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;
        double opodatkowanieStanowe = wartoscProduktu * podatekStanowy;
        double opodatkowanieLokalne = wartoscProduktu * podatekLokalny;
        double lacznaCenaSprzedazy = opodatkowanieLokalne + opodatkowanieStanowe + wartoscProduktu;

        System.out.println("Wartość produktu: " + wartoscProduktu +" zł.");
        System.out.println("Wartość  opodatkowania stanowego produktu wynosi: " + opodatkowanieStanowe + " zł.");
        System.out.println("Wartość  opodatkowania lokalnego produktu wynosi: " + opodatkowanieLokalne + " zł.");
        System.out.println("Łączna cena sprzedaży wynosi: " + lacznaCenaSprzedazy + " zł.");


    }
}
