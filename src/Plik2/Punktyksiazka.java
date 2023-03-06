package Plik2;

import java.util.Scanner;
public class Punktyksiazka {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Podaj liczbę zakupionych książek w danym miesiącu: ");
        int LiczbaKsiazek = klawiatura.nextInt();
        if (LiczbaKsiazek == 0){
        System.out.println("Niestety, nie zakupiłeś żadnej książki - otrzymujesz 0 punktów.");}
        else if (LiczbaKsiazek == 1){
            System.out.println("Zakupiłeś 1 książkę! Otrzymujesz 5 punktów!");}
        else if (LiczbaKsiazek == 2){
            System.out.println("Zakupiłeś 2 książkę! Otrzymujesz 15 punktów!");}
        else if (LiczbaKsiazek == 3){
            System.out.println("Zakupiłeś 3 książki! Otrzymujesz 30 punktów!");}
        else if (LiczbaKsiazek >= 4){
            System.out.println("Przy zakupie 4 lub więcej książek otrzymujesz 60 punktów - gratulacje!");}

    }


}
