import java.util.Scanner;
public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Wprowadź nazwę ulubionego miasta: ");
        String miasto = klawiatura.nextLine();
        int liczbaZnakow = miasto.length();
        System.out.println("Liczba znaków w nazwie: " + liczbaZnakow);
        String maleLitery = miasto.toLowerCase();
        String duzeLitery = miasto.toUpperCase();

        System.out.println("Nazwa miasta małymi literami: " + maleLitery + " .");
        System.out.println("Nazwa miasta dużymi literami: " + duzeLitery + " .");

    }


}

