package pl.sda.brudnopisy;
import java.util.Scanner;
public class DoWyjasnienia {
    public static void main(String[] args) {
        String tmp = "19,4,28,3,34,";
        System.out.println(tmp);
        Scanner skaner = new Scanner(System.in);
        int nowaLiczba = skaner.nextInt();
        if (tmp.contains(nowaLiczba + ",")){
            System.out.println("tak");
        }else {
            System.out.println("nie");
        }
    }
}

//spytaj się czy jest coś jak tablica.length dla tablic wielowymiarowych