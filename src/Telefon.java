import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner klawiatura = new Scanner(System.in);
      char pakiet;
      int minuty;

      System.out.print("Wybierz pakiet (A, B lub C): ");
      pakiet = klawiatura.next().charAt(0);
      System.out.print("Podaj liczbę minut rozmów: ");
      minuty = klawiatura.nextInt();

      double oplata = 0;
      switch (pakiet) {
         case 'A':
            oplata = 39.99;
            if (minuty > 450) {
               oplata += (minuty - 450) * 0.45;
            }
            break;
         case 'B':
            oplata = 59.99;
            if (minuty > 900) {
               oplata += (minuty - 900) * 0.4;
            }
            break;
         case 'C':
            oplata = 69.99;
            break;
         default:
            System.out.println("Nieprawidłowy wybór pakietu.");
            return;
      }

      System.out.println("Miesięczna opłata wynosi: " + oplata + " zł");
   }
}
