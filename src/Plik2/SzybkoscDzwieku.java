package Plik2;

import java.util.Scanner;
public class SzybkoscDzwieku {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadź powietrze [p], woda [w] lub stal [s]: ");
        String substancja = klawiatura.nextLine();
        System.out.println("Wprowadź odległość: ");
        double odleglosc = klawiatura.nextDouble();
        double czas = 0.0;

        if(substancja.charAt(0)=='p'){
            czas=odleglosc/343;
        }
        if(substancja.charAt(0)=='w'){
            czas=odleglosc/1490;
        }
        if(substancja.charAt(0)=='s'){
            czas=odleglosc/5100;
        }
        System.out.println("Czas wynosi:" + czas + " [ms].");

    }
}