import java.util.Scanner;
public class Zadanie13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double iloscCiastekWPudelku = 40;
        double kalorieNaPorcje = 300;
        double liczbaPorcji = 10;
        double liczbaCiastekWPorcji = iloscCiastekWPudelku/liczbaPorcji;
        double kalorieNaCiastko = kalorieNaPorcje/liczbaCiastekWPorcji;

        System.out.print("Wprowadź ilość zjedzonych ciastek: ");
        double liloscZjedzonychCiastek = klawiatura.nextDouble();
        klawiatura.nextLine();
        double skonsumowaneKalorie = liloscZjedzonychCiastek * kalorieNaCiastko;
        System.out.print("Liczba skonsumowanych kalorii wynosi: " + skonsumowaneKalorie + " kcal." );



    }


}
