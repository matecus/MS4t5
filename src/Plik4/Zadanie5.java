package Plik4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj łańcuch znaków:");
        String lancuch = klawiatura.nextLine();
        System.out.println("Podaj znak:");
        char znak = klawiatura.nextLine().charAt(0);

        int licznik = 0;
        for (int i = 0; i < lancuch.length(); i++) {
            if (lancuch.charAt(i) == znak) {
                licznik++;
            }
        }

        System.out.println("Liczba wystąpień znaku " + znak + " w łańcuchu \"" + lancuch + "\" wynosi: " + licznik);
    }
}
