import java.util.Scanner;
public class KalkulatorKalorie {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Wprowadź liczbę kalorii: ");
        double kalorie = klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.print("Wprowadź wartość gramów tłuszczu: ");
        double gramytluszczu = klawiatura.nextDouble();
        klawiatura.nextLine();

        double kalorieztl = gramytluszczu * 9;
        double procentkalori = (kalorieztl / kalorie)*100;
        System.out.println("Procent kalorii wynosi " + procentkalori + "%");

        if (procentkalori < 30) {
            System.out.println("Produkt nisko-tłuszczowy.");
            if (kalorieztl > kalorie) {
                System.out.println("Podane dane wejściowe są nieprawidłowe.");
            }
        }



    }


}
