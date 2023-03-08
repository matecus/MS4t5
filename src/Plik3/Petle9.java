package Plik3;
import java.util.Scanner;
public class Petle9 {

    public static void main(String[] args) {
        int suma = 0;
        int i = 1;
        do{

            Scanner klawiatura = new Scanner(System.in);
            System.out.println("Wpisz liczbę #1: ");
            int liczba1 = klawiatura.nextInt();
            System.out.println("Wpisz liczbę #2: ");
            int liczba2 = klawiatura.nextInt();
            suma = liczba1 + liczba2;
            System.out.println("Suma podanych liczb wynosi: " + suma);

            System.out.println("Czy chcesz dodawać dalej: [True] lub [False].");
            boolean wybor = klawiatura.nextBoolean();
            if(wybor) {
            }
            else{
                break;}
            }
        while(i>0);

        System.out.println("Zakończyłeś działanie programu. Twoja suma wynosi: " + suma);

    }

}
