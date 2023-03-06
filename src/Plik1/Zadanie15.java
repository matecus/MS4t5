package Plik1;

import java.util.Scanner;
public class Zadanie15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double marza = 0.4;

        System.out.print("Wprowadź cenę detaliczną: ");
        double cenaDetaliczna = klawiatura.nextDouble();;
        klawiatura.nextLine();
        double zysk = cenaDetaliczna * marza;
        System.out.println("Zysk wynosi: " + zysk +" zł.");





    }
}
