import java.util.Scanner;
public class magiczneDaty {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Wprowadź dzień: ");
        int dzien = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.print("Podaj miesiąc: ");
        int miesiac = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.print("Podaj dwie ostatnie cyfry roku: ");
        int rok = klawiatura.nextInt();
        klawiatura.nextLine();

        if (dzien * miesiac == rok) {

            System.out.println("Twoja data jest magiczna!");}
        else {

                System.out.println("NOPE!");}





    }
}
