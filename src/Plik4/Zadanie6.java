package Plik4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj nazwę pliku: ");
        String nazwaPliku = input.nextLine();

        System.out.print("Podaj znak, którego wystąpienia chcesz zliczyć: ");
        char znak = input.nextLine().charAt(0);

        File plik = new File(nazwaPliku);

        if (!plik.exists()) {
            System.out.println("Plik nie istnieje.");
            return;
        }

        int licznik = 0;

        try {
            Scanner czytnik = new Scanner(plik);

            while (czytnik.hasNextLine()) {
                String linia = czytnik.nextLine();
                for (int i = 0; i < linia.length(); i++) {
                    if (linia.charAt(i) == znak) {
                        licznik++;
                    }
                }
            }

            czytnik.close();
        } catch (FileNotFoundException e) {
            System.out.println("Błąd odczytu pliku.");
            return;
        }

        System.out.println("Liczba wystąpień znaku '" + znak + "': " + licznik);
    }
}
