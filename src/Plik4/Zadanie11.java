package Plik4;
public class Zadanie11 {
    public static void main(String[] args) {
        System.out.println("Tabela temperatur:");

        for (int celsjusz = 0; celsjusz <= 20; celsjusz++) {
            double fahrenheit = 9.0 / 5.0 * celsjusz + 32;
            System.out.printf("%d stopni Celsjusza to %.1f stopni Fahrenheita%n", celsjusz, fahrenheit);
        }
    }
}
