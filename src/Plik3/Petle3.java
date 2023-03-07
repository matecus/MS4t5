package Plik3;
import java.util.Scanner;

public class Petle3 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String tekst = "";

        do {
            System.out.print("Proszę wpisać Tekst 'Tak' lub 'Nie': ");
            tekst = klawiatura.nextLine();

            if (tekst.equalsIgnoreCase("Tak")) {
                System.out.println("Wpisany tekst to Tak.");
            } else if (tekst.equalsIgnoreCase("Nie")) {
                System.out.println("Wpisany tekst to Nie.");
            } else {
                System.out.println("Niepoprawny tekst, proszę spróbować ponownie.");
            }
        } while (!tekst.equalsIgnoreCase("Tak") && !tekst.equalsIgnoreCase("Nie"));

        System.out.println("Wpisany tekst jest poprawny.");
    }
}
