package Plik1;

import java.util.Scanner;
public class Zadanie20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double iloscWszyskichCiastek = 48;
        double szklankiCukru = 1.5;
        double szklankiMasla = 1;
        double szklankiMaki = 2.75;
        double cukierNaJednoCiastko = szklankiCukru / iloscWszyskichCiastek;
        double masloNaJednoCiastko = szklankiMasla / iloscWszyskichCiastek;
        double makaNaJednoCiastko = szklankiMaki / iloscWszyskichCiastek;
        System.out.print("Wprowadź liczbę ciiastek, które chcesz upiec: ");
        double liczbaCiastek = klawiatura.nextDouble();
        klawiatura.nextLine();
        double cukierOczekiwaneCiastka = liczbaCiastek * cukierNaJednoCiastko;
        double masloOczekiwaneCiastka  = liczbaCiastek * masloNaJednoCiastko;
        double makaOczekiwaneCiastka = liczbaCiastek * makaNaJednoCiastko;

        System.out.println("Liczba ciastek: "  + liczbaCiastek);
        System.out.println("Szklanki cukru: " + cukierOczekiwaneCiastka);
        System.out.println("Szklanki masła: " + masloOczekiwaneCiastka);
        System.out.println("Szklanki maki: " + makaOczekiwaneCiastka);




    }
}
