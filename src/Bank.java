import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        
        System.out.print("Podaj liczbę czeków wystawionych w tym miesiącu: ");
        int liczbaCzekow = klawiatura.nextInt();
        
        double opłataPodstawowa = 10.0;
        double opłataDodatkowa = 0.0;
        
        if (liczbaCzekow < 20) {
            opłataDodatkowa = liczbaCzekow * 0.10;
        } else if (liczbaCzekow >= 20 && liczbaCzekow <= 39) {
            opłataDodatkowa = liczbaCzekow * 0.08;
        } else if (liczbaCzekow >= 40 && liczbaCzekow <= 59) {
            opłataDodatkowa = liczbaCzekow * 0.06;
        } else if (liczbaCzekow >= 60) {
            opłataDodatkowa = liczbaCzekow * 0.04;
        }
        
        double całkowitaOpłata = opłataPodstawowa + opłataDodatkowa;
        System.out.println("Całkowita opłata za obsługę czeków: " + całkowitaOpłata + " zł");
    }
}
