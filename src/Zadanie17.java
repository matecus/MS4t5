import java.util.Scanner;
public class Zadanie17 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadź cenę posiłku: ");
        double cenaPosilku = klawiatura.nextDouble();
        klawiatura.nextLine();
        double podatek = 0.0675 * cenaPosilku;
        double napiwek = 0.2 * (cenaPosilku + podatek);
        double razem = cenaPosilku + podatek + napiwek;
        System.out.println("Cena posiłku wynosi: " + cenaPosilku + " zł." );
        System.out.println("Wartość podatku wynosi: " + podatek + " zł.");
        System.out.println("Wartość napiwku wynosi: " + napiwek + " zł.");
        System.out.println("Łączna cena do zapłaty wynosi: " + razem + "  zł." );






    }
}
