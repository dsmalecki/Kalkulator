package pl.sda.praceDomowe1305;

import java.util.Scanner;

public class Petle5 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę gwiazdek:");
        Scanner scanner = new Scanner(System.in);
        int kolumny = scanner.nextInt();
        int gwiazdki = 1;
        int spacje;

        for (int i = 0; i <= kolumny; i++) {
                spacje = (kolumny - gwiazdki);
                while ((spacje > 0) && (spacje <= (kolumny - i))) {
                    System.out.print(" ");
                    spacje--;
                }
                gwiazdki = 1;
                while (i >= gwiazdki) {
                    System.out.print("*");
                    gwiazdki++;
                }
                System.out.println();

        }
    }
}
