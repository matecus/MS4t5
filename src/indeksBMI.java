import java.util.Scanner;
public class indeksBMI {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.print("Podaj wagę swojego ciała [kg]: ");
        double waga = klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.print("Podaj swój wzrost [m]: ");
        double wzrost = klawiatura.nextDouble();
        klawiatura.nextLine();

        double bmi = waga/(wzrost*wzrost);
        System.out.println("Twoje BMI wynosi: " + bmi + ".");

        if (bmi < 18.5)  {
            System.out.println("NIEDOWAGA!");}

        else if (bmi > 25) {
            System.out.println("NADWAGA!");}

        else{
            System.out.println("OPTYMALNIE!");}

    }
}
