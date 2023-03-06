package Plik2;

import java.util.Scanner;
public class masaICiezar {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj masę obiektu [kg]: ");
        double masa = klawiatura.nextDouble();
        klawiatura.nextLine();
        double ciezar = masa * 9.8;
        System.out.println("Ciężar obiektu wynosi: " + ciezar + " [N].");


        if (ciezar > 1000){
            System.out.println("Obiekt jest zbyt ciężki!");}
        else if(ciezar<10){
            System.out.println("Obiekt jest zbyt lekki!");}
        else {
                System.out.println("Obiekt posiada odopowiedni ciężar!");}









    }
}
