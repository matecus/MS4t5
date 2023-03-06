package Plik2;

import java.util.Scanner;
public class Restauracja {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Czy któraś z osób jest na diecie wegetariańskiej? ");
        String DietaWegetarianska = klawiatura.nextLine();
        System.out.print("Czy któraś z osób jest na diecie wegańskiej? ");
        String DietaWeganska = klawiatura.nextLine();
        System.out.print("Czy któraś z osób jest na diecie bezglutenowej? ");
        String DietaBezglutenowa = klawiatura.nextLine();

        System.out.println("Możecie wybrać się do następujących restauracji: ");

        if (DietaWegetarianska.charAt(0)=='t' || DietaWegetarianska.charAt(0)=='T') {
         if (DietaBezglutenowa.charAt(0)=='t' || DietaBezglutenowa.charAt(0)=='T'){
            if (DietaWeganska.charAt(0)=='t' || DietaWeganska.charAt(0)=='T'){
                System.out.println("Możecie wybrać się do restauracji Kuchnia u Szefa lub restauracji Kawiarnia na Rogu!");}}}


        if (DietaWegetarianska.charAt(0)=='n' || DietaWegetarianska.charAt(0)=='N') {
            if (DietaBezglutenowa.charAt(0)=='n' || DietaBezglutenowa.charAt(0)=='N'){
                if (DietaWeganska.charAt(0)=='n' || DietaWeganska.charAt(0)=='N'){
                    System.out.println("Możecie wybrać się do restauracji Luksusowe Burgery u Jarka!");}}}


        if (DietaWegetarianska.charAt(0)=='t' || DietaWegetarianska.charAt(0)=='T') {
            if (DietaBezglutenowa.charAt(0)=='t' || DietaBezglutenowa.charAt(0)=='T'){
                if (DietaWeganska.charAt(0)=='n' || DietaWeganska.charAt(0)=='N'){
                    System.out.println("Możecie wybrać się do restauracji Pizzeria przy Dworcowej, Kawiarnia na Rogu oraz Kuchnia u Szefa!");
                }}}

        if (DietaWegetarianska.charAt(0)=='t' || DietaWegetarianska.charAt(0)=='T') {
            if (DietaBezglutenowa.charAt(0)=='n' || DietaBezglutenowa.charAt(0)=='N'){
                if (DietaWeganska.charAt(0)=='n' || DietaWeganska.charAt(0)=='N'){
                    System.out.println("Możecie wybrać się do restauracji Włoskie Specjały, Kuchnia u Szefa, Kawiarnia na Rogu, Pizzeria przy Dworcowej!");
                }}}









    }

}
