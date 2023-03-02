import java.util.Scanner;
public class Sprzedazoprogramowania {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Podaj liczbę zakupionych pakietów: ");
        int pakiety = klawiatura.nextInt();
        klawiatura.nextLine();
        double rabat = 0.0;
        if (pakiety >=10 && pakiety < 20){
            System.out.println("Twój rabat wynosi 20%.");
            rabat = 0.2;}
        else if (pakiety >=20 && pakiety < 50){
        System.out.println("Twój rabat wynosi 30%.");
        rabat = 0.3;}
        else if (pakiety >=50 && pakiety < 100){
        System.out.println("Twój rabat wynosi 40%.");
        rabat = 0.4;}
        else if (pakiety >= 100){
            System.out.println("Twój rabat wynosi 50%.");
            rabat = 0.5;}
        else {
            System.out.println("Rabat niestety nie został przyznany.");
            rabat = 1;}

        int cenaPakietu = 99;
        double cenaza = cenaPakietu * pakiety;
        double lacznaCena = (cenaza - (cenaza * rabat));
        System.out.println("Łączna cena do zapłaty wynosi: " + lacznaCena + " zł.");
        }
    }

