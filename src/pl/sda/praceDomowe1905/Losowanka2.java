package pl.sda.praceDomowe1905;
import java.util.Random;

public class Losowanka2 {
    public static void main(String[] args) {
        Random losuj = new Random();
        int liczba;
        do {
            liczba = losuj.nextInt(104);
        }while ((liczba%4)==0);
        System.out.println(liczba-30);
    }
}
