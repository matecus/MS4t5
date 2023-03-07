import java.util.Scanner;

public class Petle7 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int suma = 0;
        
        for (int i = 1; i <= 7; i++) {
            System.out.print("Wprowadź liczbę #" + i + ": ");
            int liczba = klawiatura.nextInt();
            suma += liczba;}
        
        System.out.println("Suma wprowadzonych liczb wynosi: " + suma);
    }
}
