import java.util.Scanner;

public class Telefon2 {
   public static void main(String[] args) {
      Scanner klawiatura = new Scanner(System.in);
      char pakiet;
      int minuty;

      System.out.print("Wybierz pakiet (A, B lub C): ");
      pakiet = klawiatura.next().charAt(0);
      System.out.print("Podaj liczbę minut rozmów: ");
      minuty = klawiatura.nextInt();

      double oplataA = 0;
      double oplataB = 0;
      double oplataC = 0;
      double oszczednosciAB = 0;
      double oszczednosciBC = 0;

      switch (pakiet) {
         case 'A':
            oplataA = 39.99;
            oplataB = 59.99;
            oplataC = 69.99;
            if (minuty > 450) {
               oplataA += (minuty - 450) * 0.45;
            }
            if (minuty > 900) {
               oplataB += (minuty - 900) * 0.4;
            }
            break;
         case 'B':
            oplataA = 59.99;
            oplataC = 69.99;
            if (minuty > 900) {
               oplataA += (minuty - 900) * 0.4;
            }
            break;
         case 'C':
            oplataA = 69.99;
            break;
         default:
            System.out.println("Nieprawidłowy wybór pakietu.");
            return;
      }

      if (pakiet == 'A') {
         if (minuty > 900) {
            oszczednosciAB = (minuty - 900) * 0.05;
         }
         if (oszczednosciAB > 0) {
            System.out.println("Oszczędności przy zmianie na pakiet B wynoszą: " + oszczednosciAB + " zł");
         }
         oszczednosciBC = (minuty * 0.04) + 20.0;
         if (oszczednosciBC > 0) {
            System.out.println("Oszczędności przy zmianie na pakiet C wynoszą: " + oszczednosciBC + " zł");
         }
      } else if (pakiet == 'B') {
         oszczednosciBC = (minuty * 0.05) + 10.0;
         if (oszczednosciBC > 0) {
            System.out.println("Oszczędności przy zmianie na pakiet C wynoszą: " + oszczednosciBC + " zł");
         }
      }

      System.out.println("Miesięczna opłata wynosi: " + oplataA + " zł");
   }
}
