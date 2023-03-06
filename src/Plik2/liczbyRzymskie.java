package Plik2;

import java.util.Scanner;
public class  liczbyRzymskie{

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadź liczbę z przedziału od 1-10:");
        int liczba = klawiatura.nextInt();
        klawiatura.nextLine();
        if (liczba < 1 || liczba > 10) {
            System.out.println("Error!");}
        else if (liczba == 1) {

                System.out.println("1 = I ");}
        else if (liczba == 2) {

            System.out.println("2 = II ");}
        else if (liczba == 3) {

            System.out.println("3 = III ");}
        else if (liczba == 4) {

            System.out.println("4 = IV ");}
        else if (liczba == 5) {

            System.out.println("5 = V ");}
        else if (liczba == 6) {

            System.out.println("6 = VI ");}
        else if (liczba == 7) {

            System.out.println("7 = VII ");}
        else if (liczba == 8) {

            System.out.println("8 = VIII ");}
        else if (liczba == 9) {

            System.out.println("9 = IX ");}
        else if (liczba == 10) {

            System.out.println("10 = X");}






    }
}
