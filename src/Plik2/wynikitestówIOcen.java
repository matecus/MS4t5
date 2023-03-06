package Plik2;

import java.util.Scanner;
public class wynikitestówIOcen {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadź pierwszy wynik testu [procenty]: ");
        double ocena1 = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Wprowadź drugi wynik testu [procenty]: ");
        double ocena2 = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Wprowadź trzeci wynik testu [procenty]: ");
        double ocena3 = klawiatura.nextDouble();
        klawiatura.nextLine();
       double  iloscTestow = 3;
       double srednia = (ocena1 + ocena2 + ocena3)/iloscTestow;

       if (srednia >= 90 && srednia <= 100) {
           System.out.println("Twoja ocena to 5!");}
        else if  (srednia >= 80 && srednia < 90) {
            System.out.println("Twoja ocena to 4!");}
        else if (srednia >= 70 && srednia < 80) {
            System.out.println("Twoja ocena to 3!");}
        else if (srednia >= 60 && srednia < 70) {
            System.out.println("Twoja ocena to 2!");}
        else if (srednia < 60 ) {
            System.out.println("Twoja ocena to 1!");}
        else {
           System.out.println("ERROR!");}



    }
}
