package Plik1;

public class Zadanie6 {
    public static void main(String[] args) {

        int szerokoscPomieszczenia1 = 3;
        int dlugoscPomieszczenia1 = 4;
        int szerokoscPomieszczenia2 = 3;
        int dlugoscPomieszczenia2 = 4;
        int szerokoscPomieszczenia3 = 2;
        int dlugoscPomieszczenia3 = 3;
        int szerokoscPomieszczenia4 = 2;
        int dlugoscPomieszczenia4 = 2;

        int powierzchnia1 = szerokoscPomieszczenia1 * dlugoscPomieszczenia1;
        int powierzchnia2 = szerokoscPomieszczenia2 * dlugoscPomieszczenia2;
        int powierzchnia3 = szerokoscPomieszczenia3 * dlugoscPomieszczenia3;
        int powierzchnia4 = szerokoscPomieszczenia4 * dlugoscPomieszczenia4;
        int calkowitaPowierzchnia = powierzchnia1 + powierzchnia2 + powierzchnia3 + powierzchnia4;
        int liczbaOsob = 4;
        double powierzchniaNaJednaOsoba = (double) calkowitaPowierzchnia / liczbaOsob;
        System.out.println("Powierzchnia pomieszczenianr.1: " + powierzchnia1);
        System.out.println("Powierzchnia pomieszczenie nr.2: " + powierzchnia2);
        System.out.println("Powierzchnia pomieszczenia nr.3: " + powierzchnia3);
        System.out.println("Powierzchnia pomieszczenia nr.4: " + powierzchnia4);
        System.out.println("Powierzchnia całkowita mieszkania: " + calkowitaPowierzchnia);
        System.out.println("Liczba osób wynosi: " + liczbaOsob);
        System.out.println("Powierzchnia na 1 osobę wynosi: " + powierzchniaNaJednaOsoba);



    }
}
