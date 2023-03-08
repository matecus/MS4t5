package Plik4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Zadanie13 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Wyświetlanie prośby o podanie nazwy pliku
            System.out.print("Podaj nazwę pliku: ");
            String fileName = System.console().readLine();
            
            // Tworzenie obiektu BufferedReader i wczytywanie pierwszych pięciu wierszy pliku
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null && lineNumber < 5) {
                System.out.println(line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Błąd odczytu pliku: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Błąd zamknięcia pliku: " + e.getMessage());
            }
        }
    }
}
