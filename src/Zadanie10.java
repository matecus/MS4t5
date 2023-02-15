import java.util.Scanner;
public class Zadanie10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.print("Podaj pierwsze imię: ");
        String firstName = klawiatura.nextLine();


        System.out.print("Podaj drugie imię: ");
        String middleName = klawiatura.nextLine();


        System.out.print("Podaj trzecie imię: ");
        String lastName = klawiatura.nextLine();


        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println("Twoje pierwsze imię " + firstName);
        System.out.println("Twoje drugieimię " + middleName);
        System.out.println("Twoje trzecie imię " + lastName);
        System.out.println("Twoje inicjały: " + firstInitial + middleInitial + lastInitial);


    }
}
