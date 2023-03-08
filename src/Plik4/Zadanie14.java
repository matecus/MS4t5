package Plik4;
import java.io.*;

public class Zadanie14 {

    public static void main(String[] args) {
        
        BufferedReader reader = null;
        
        try {
            // pobieranie nazwy pliku
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Podaj nazwę pliku: ");
            String fileName = consoleReader.readLine();
            
            // otwieranie pliku
            File file = new File(fileName);
            reader = new BufferedReader(new FileReader(file));
            
            // wyświetlanie zawartości pliku z numeracją wierszy
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Błąd zamykania pliku: " + e.getMessage());
            }
        }
    }
}
