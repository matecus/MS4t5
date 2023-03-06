package Plik1;

import java.util.Scanner;
public class Zadanie14 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);


        double iloscTestow = 3;
        System.out.print("Wprowadź wynik z pierwszego testu: ");
        double wynik1 = klawiatura.nextDouble();
        klawiatura.nextLine();


        System.out.print("Wprowadź wynik z drugiego testu: ");
        double wynik2 = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.print("Wprowadź wynik z trzeciego testu: ");
        double wynik3 = klawiatura.nextDouble();
        klawiatura.nextLine();

        double srednia = (wynik1 + wynik2 + wynik3)/iloscTestow;
        System.out.println("Średnia z trzech testów wynosi: " + srednia + " .");


    }


}
