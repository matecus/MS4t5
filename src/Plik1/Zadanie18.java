package Plik1;

public class Zadanie18 {

    public static void main(String[] args) {

        double iloscAkcji = 600;
        double cenaAkcji = 21.77;
        double kwotaBezProwizji= iloscAkcji * cenaAkcji;
        double prowizja = 0.02;
        double cenaZProwizja  = iloscAkcji * kwotaBezProwizji;
        double wysokoscProwizji = kwotaBezProwizji * prowizja;
        double lacznaCena = kwotaBezProwizji +  wysokoscProwizji;
        System.out.println("Kwota zapłacona za same akcje bez prowizji: " + kwotaBezProwizji + " zł.");
        System.out.println("Wysokość prowizji: " + wysokoscProwizji + " zł.");
        System.out.println("Łączna zapłacona kwota: " + lacznaCena + " zł.");
    }
}
