package Plik3;
public class Petle12 {
    public static void main(String[] args) {
        double suma = 0;
        for(int i = 1; i<=30; i++){
            suma += ((double)i/(31-i));}
        System.out.println("Suma wynosi: " + suma);

    }
}
