package pl.sda.praceDomowe1905;
import java.util.Random;
public class Losowanka3 {
    public static void main(String[] args) {
        Random losuj = new Random();
        double liczba;
        for (int i=0;i<100;i++) {
            do {
                liczba = losuj.nextDouble();
            } while ((liczba < 0.25) ||(liczba > 0.75));
            System.out.println(liczba);
        }
    }
}
