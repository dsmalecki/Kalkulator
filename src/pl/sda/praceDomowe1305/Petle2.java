package pl.sda.praceDomowe1305;

import java.util.Scanner;

public class Petle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ile chcesz liczb");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
