import java.util.Scanner;
public class Zadanie23 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Wprowadź długość rzędu w metrach: ");
        double dlugoscRzedu = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.print("Wprowadź ilość miejsca zajmowanego przez okratowanie: ");
        double okratowanie = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.print("Wprowadź odległość między sadzonkami: ");
        double odleglosc = klawiatura.nextDouble();
        klawiatura.nextLine();

        int liczbaSadzonek = (int)((dlugoscRzedu - (2 * okratowanie))/odleglosc);

        System.out.println("Liczba sadzonek, które można umieścić w rzędzie wynosi: " + liczbaSadzonek + " .");





    }


}
