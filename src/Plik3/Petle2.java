import java.util.Scanner;

public class Petle2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        char litera = '\0'; //pusty znak

        do {
            System.out.print("Proszę wpisać literę T/t lub N/n: ");
            litera = klawiatura.nextLine().charAt(0);

            switch (litera) {
                case 'T':
                case 't':
                    System.out.println("Wpisana litera to T/t.");
                    break;
                case 'N':
                case 'n':
                    System.out.println("Wpisana litera to N/n.");
                    break;
                default:
                    System.out.println("Niepoprawna litera, proszę spróbować ponownie.");
                    break;
            }
        } 
        while (litera != 'T' && litera != 't' && litera != 'N' && litera != 'n');
        // pętla trwa do momentu niespełnienia podanego warunku;
        System.out.println("Wpisana litera jest poprawna.");
    }
}
