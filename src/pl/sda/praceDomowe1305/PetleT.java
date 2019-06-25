package pl.sda.praceDomowe1305;

import java.util.Scanner;

public class PetleT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wierszy");
        int a = scanner.nextInt();
        System.out.println("Podaj liczbe kolumn");
        int b = scanner.nextInt();
        System.out.println("Podaj grubosc");
        int c = scanner.nextInt();
        while ((a > 0) || (b > 0) || (c > 0)) {
            for (int ia = a; ia > 0; ia--) {
                System.out.print("**");
            }
            System.out.println();
            a = 0;
            for (int ib = b - c; ib > 0; ib--) {
                for (int spacje = (a - 2) / 2; spacje >= 0; spacje--) {
                    System.out.print("  ");
                }
                System.out.println("**");
            }
            b = 0;
            c = 0;
        }
    }
}
