package pl.sda.praceDomowe1905;

import java.util.Scanner;

public class Main5 {
    public static int getSum(int[] liczby) {
        int suma = 0;
        for (int j = 0; j < liczby.length; j++) {
            suma += liczby[j];
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb");
        int iloscLiczb = scanner.nextInt();

        int[] liczby = new int[iloscLiczb];
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = scanner.nextInt();
        }
        System.out.println(getSum(liczby));
    }
}
