package pl.sda.brudnopisy;

import java.util.Scanner;

public class    Petle5 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę gwiazdek:");
        Scanner scanner = new Scanner(System.in);
        int kolumny = scanner.nextInt();
        int gwiazdki = 1;
        int spacje = (kolumny - gwiazdki);
        for (int i = 0; i <= kolumny; i++) {
            while ((i >= gwiazdki)) {
                while ((spacje >= 0) && (spacje < (kolumny-i))) {
                    System.out.print(" ");
                    spacje--;
                }
                while (gwiazdki <= (kolumny - i)) {
                    System.out.print("*");
                    gwiazdki++;
                }
                System.out.println();
            }
        }
    }
}
