public class Zadanie22 {
    public static void main(String[] args) {

        double  liczbaZakupionychAkcji = 1000;
        double cenaAkcji = 32.87;
        double prowizja = 0.02;
        double cenaZaAkcje = liczbaZakupionychAkcji * cenaAkcji;
        double wartoscProwizji = prowizja * cenaZaAkcje;
        double cenaZaAkcjePoZapłaceniuProwizji  = cenaZaAkcje - wartoscProwizji;
        double iloscSprzedanychAkcji = 1000;
        double cenaAkcjiSprzedanej = 33.92;
        double  cenasprzedanychAkcji = iloscSprzedanychAkcji * cenaAkcjiSprzedanej;
        double prowizjaPoSprzedazy =  prowizja * cenasprzedanychAkcji;
        double zysk = cenasprzedanychAkcji - cenaZaAkcje - wartoscProwizji - prowizjaPoSprzedazy;
        System.out.println("Jacek zapłacił za akcję: " + cenaZaAkcje+ " zł.");
        System.out.println("Kwota zapłacona brokerowi przy zakupie: " + wartoscProwizji + "zł.");
        System.out.println("Kwota otrzymana przez Jacka ze sprzedaży akcji: " +  cenasprzedanychAkcji + "zł.");
        System.out.println("Kwota zapłącona brokerowi po sprzedaży: " + prowizjaPoSprzedazy + "zł.");
        System.out.println("Zysk Jacka wynosi: " + zysk + "zł.");
    }
}
