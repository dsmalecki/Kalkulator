package pl.sda.tablice;

import java.lang.String;
import java.util.Scanner;

public class Tablice1 {
    public static void main(String[] args) {
        String[] pasazerowie;
        pasazerowie = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj imie osoby " + (i + 1));
            pasazerowie[i] = scanner.nextLine();
        }
        for (int j = 0; j < 5; j++) {
            System.out.println("Witaj " + pasazerowie[j]);
        }
    }
}
