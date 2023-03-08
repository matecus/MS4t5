package 4;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int predkosc, czas;
        do {
            System.out.print("Podaj prędkość pojazdu (w km/h): ");
            predkosc = scanner.nextInt();
        } while (predkosc < 0);

        do {
            System.out.print("Podaj czas podróży (w godzinach): ");
            czas = scanner.nextInt();
        } while (czas < 1);

        int odleglosc = 0;
        FileWriter writer = null;
        try {
            writer = new FileWriter("odleglosc.txt");
            writer.write("Godzina\tPrzebyta odległość\n");
            writer.write("-----------------------------\n");
            for (int i = 1; i <= czas; i++) {
                odleglosc += predkosc;
                writer.write(i + "\t" + odleglosc + "\n");
            }
            System.out.println("Dane zapisane do pliku odleglosc.txt.");
        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku.");
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Błąd zamykania pliku.");
            }
        }
    }
}
