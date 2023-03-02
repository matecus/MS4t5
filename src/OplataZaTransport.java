import java.util.Scanner;

public class OplataZaTransport {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Wprowadź wagę w [kg] : ");
        int waga = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.print("Podaj odległośc w [km]: ");
        int odleglosc = klawiatura.nextInt();
        klawiatura.nextLine();
        if (odleglosc > 500){
            odleglosc = 2;}
        else {
            odleglosc = 1;}
        if (waga<=1){
            double koszt = odleglosc * 1.1;
            System.out.println("Koszt wynosi: " + koszt + ".");}
        else if (waga>1 && waga <=3){
            double koszt = odleglosc * 2.20;
            System.out.println("Koszt wynosi: " + koszt + ".");}
        else if (waga>3 && waga <=5){
            double koszt = odleglosc * 3.70;
            System.out.println("Koszt wynosi: " + koszt + ".");}
        else if (waga>5){
            double koszt = odleglosc * 3.80;
            System.out.println("Koszt wynosi: " + koszt + ".");}

        }

    }

