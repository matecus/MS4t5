package Plik1;

public class Zadanie19 {
    public static void main(String[] args) {

       int  iloscKonsumentow = 12467;
       double  ankietowaniKupcyJedenNapojTygodniowo = 0.14;
       int iloscAnkietowanychKupujacychJedenNapojTygodniowo = (int) (iloscKonsumentow * ankietowaniKupcyJedenNapojTygodniowo);
       double iloscPreferujacychSmakCytrusowy = 0.64;
       int smakCytrusowy = (int) (iloscAnkietowanychKupujacychJedenNapojTygodniowo * iloscPreferujacychSmakCytrusowy);

        System.out.println("Liczba ankietowanych kupujących kupujących jeden napój tygodniowo: " + iloscAnkietowanychKupujacychJedenNapojTygodniowo + ".");
        System.out.println("Liczba ankietowanych preferująca napój o smaku cytrusowym: " + smakCytrusowy + ".");





    }
}
