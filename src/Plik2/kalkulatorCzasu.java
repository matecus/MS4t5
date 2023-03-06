package Plik2;

import java.util.Scanner;
public class kalkulatorCzasu
{
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Podaj ilość sekund: ");
        int sekund = klawiatura.nextInt();
        if (sekund>=60) {
            System.out.println("Liczba minut wynosi: "+ sekund/60 + ".");
        }
        if (sekund>=3600) {
            System.out.println("Liczba godzin wynosi: "+ sekund/3600 + ".");
        }
        if (sekund>=86400) {
            System.out.println("Liczba dni wynosi: "+ sekund/86400 + ".");
        }
        if (sekund<60){
            System.out.println("Liczba sekund wynosi: "+ sekund +".");
        }
        }
    }
