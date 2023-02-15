import java.util.Scanner;
public class Zadanie21 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.print("Wprowadź kwotę początkowo zdeponowaną na koncie: ");
        double kwotaPoczatkowaZdeponowana = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.print("Wprowadź  roczną stopę oprocentowania: ");
        double rocznaStopaOprecentowania = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.print("Wprowadź ilość kapitalizacji w ciągu roku: ");
        double liczbaKapitalizacjiWCiaguRoku = klawiatura.nextDouble();;
        klawiatura.nextLine();

        System.out.print("Wprowadź liczbę lat: ");
        double liczbaLat = klawiatura.nextDouble();
        klawiatura.nextLine();
        double razem = kwotaPoczatkowaZdeponowana * Math.pow ((1 + rocznaStopaOprecentowania /100/liczbaKapitalizacjiWCiaguRoku ), (liczbaKapitalizacjiWCiaguRoku * liczbaLat));

        System.out.println("Kwota na koncie: " + razem   + " zł.");


    }
}
