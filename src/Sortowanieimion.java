import java.util.Scanner;
public class  Sortowanieimion {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Podaj pierwsze imię: ");
        String imie1 = klawiatura.nextLine();
        System.out.print("Podaj drugię imię: ");
        String imie2 = klawiatura.nextLine();
        System.out.print("Podaj trzecie imię: ");
        String imie3 = klawiatura.nextLine();

        if (imie1.compareTo(imie2) <0 && imie1.compareTo(imie3) < 0){
            System.out.println(imie1 + " jest pierwszy alfabetycznie  " );
        }

         if (imie1.compareTo(imie2) == 0 && imie1.compareTo(imie2) == 0 && imie1.compareTo(imie3) == 0) {
            System.out.println(imie1 + " jest równy względem " + imie2 + "oraz" + imie3);
        }

         if (imie2.compareTo(imie3) <0 && imie2.compareTo(imie1) < 0){
            System.out.println(imie2 + " jest pierwszy alfabetycznie  " );
        }
         if (imie3.compareTo(imie1) <0 && imie3.compareTo(imie2) < 0){
            System.out.println(imie3 + " jest pierwszy alfabetycznie  " );
        }
    }
}
