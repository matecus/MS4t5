package Plik4;
import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int number;

        do {
            System.out.print("Podaj liczbę całkowitą (lub -99, aby zakończyć): ");
            number = input.nextInt();

            if (number != -99) {
                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            }
        } while (number != -99);

        System.out.printf("Największa wprowadzona wartość: %d%n", max);
        System.out.printf("Najmniejsza wprowadzona wartość: %d%n", min);
    }
}
