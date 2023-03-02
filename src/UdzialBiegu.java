import java.util.Scanner;
public class UdzialBiegu {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Wprowadz imię: ");
        String imie1 = klawiatura.nextLine();
        System.out.print("Wprowadz imię: ");
        String imie2 = klawiatura.nextLine();
        System.out.print("Wprowadz imię: ");
        String imie3 = klawiatura.nextLine();
        System.out.print(imie1 + " wprowadz swój czas zakończenia biegu: ");
        int czas1 = klawiatura.nextInt();
        System.out.print(imie3 + " wprowadz swój czas zakończenia biegu: ");
        int czas2 = klawiatura.nextInt();
        System.out.print(imie2 + " wprowadz swój czas zakończenia biegu: ");
        int czas3 = klawiatura.nextInt();



        if (czas1>czas2 && czas2>czas3) {
            System.out.println("Kolejność: " + " " + imie3 + " " + imie1 + " " + imie2);}

        else if (czas2>czas1 && czas1>czas3) {
            System.out.println("Kolejność: " + " " + imie1 + " " + imie2 + " " + imie3);}

        else if (czas3>czas2 && czas2>czas1) {
            System.out.println("Kolejność: " + " " + imie2 + " " + imie1 + " " + imie3);}

        else if (czas3>czas1 && czas1>czas2) {
            System.out.println("Kolejność: " + " " + imie1 + " " + imie3 + " " + imie2);}

        else if (czas2>czas3 && czas3>czas1) {
            System.out.println("Kolejność: " + " " + imie2 + " " + imie3 + " " + imie1);}

        else if (czas1>czas3 && czas3>czas2) {
            System.out.println("Kolejność: " + " " + imie3 + " " + imie2 + " " + imie1);}

    }
}
