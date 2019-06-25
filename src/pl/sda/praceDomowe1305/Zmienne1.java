package pl.sda.praceDomowe1305;

import java.util.Scanner;

public class Zmienne1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a:");
        double a = scanner.nextDouble();
        System.out.println("Podaj liczbę b:");
        double b = scanner.nextDouble();
        System.out.println("Liczba a to:\t" + a + "\ta liczba b to:\t" +b);
        a+=b;
        b=a-b;
        a=a-b;
        System.out.println("Liczba a po zamianie to:\t" + a + "\ta liczba b po zamianie to:\t"+b);
    }
}
