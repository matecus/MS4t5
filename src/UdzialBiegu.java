import java.util.Scanner;

public class UdzialBiegu {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

       
        System.out.print("Podaj nazwisko i czas ukończenia biegu (w minutach) dla biegacza #1: ");
        String nazwisko1 = scanner.next();
        int czas1 = klawiatura.nextInt();

        System.out.print("Podaj nazwisko i czas ukończenia biegu (w minutach) dla biegacza #2: ");
        String nazwisko2 = scanner.next();
        int czas2 = klawiatura.nextInt();

        System.out.print("Podaj nazwisko i czas ukończenia biegu (w minutach) dla biegacza #3: ");
        String nazwisko3 = scanner.next();
        int czas3 = klawiatura.nextInt();

       
        System.out.println("Kolejność na mecie:");

        if (czas1 <= czas2 && czas1 <= czas3) {
            System.out.println("1. " + nazwisko1);
            if (czas2 <= czas3) {
                System.out.println("2. " + nazwisko2);
                System.out.println("3. " + nazwisko3);
            } else {
                System.out.println("2. " + nazwisko3);
                System.out.println("3. " + nazwisko2);
            }
        } else if (czas2 <= czas1 && czas2 <= czas3) {
            System.out.println("1. " + nazwisko2);
            if (czas1 <= czas3) {
                System.out.println("2. " + nazwisko1);
                System.out.println("3. " + nazwisko3);
            } else {
                System.out.println("2. " + nazwisko3);
                System.out.println("3. " + nazwisko1);
            }
        } else {
            System.out.println("1. " + nazwisko3);
            if (czas1 <= czas2) {
                System.out.println("2. " + nazwisko1);
                System.out.println("3. " + nazwisko2);
            } else {
                System.out.println("2. " + nazwisko2);
                System.out.println("3. " + nazwisko1);
            }
        }
    }
}
