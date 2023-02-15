import java.util.Scanner;
public class Zadanie8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj szerokość pomieszczenia nr.1: ");
        int szerokoscPomieszczenia1 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj długość pomieszczenia nr.1: ");
        int dlugoscPomieszczenia1 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj szerokość pomieszczenia nr.2: ");
        int szerokoscPomieszczenia2 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj długość pomieszczenia nr.2: ");
        int dlugoscPomieszczenia2 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj szerokość pomieszczenia nr.3: ");
        int szerokoscPomieszczenia3 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj długość pomieszczenia nr.3: ");
        int dlugoscPomieszczenia3 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj szerokość pomieszczenia nr.4: ");
        int szerokoscPomieszczenia4 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj długość pomieszczenia nr.4: ");
        int dlugoscPomieszczenia4 = klawiatura.nextInt();
        klawiatura.nextLine();



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
