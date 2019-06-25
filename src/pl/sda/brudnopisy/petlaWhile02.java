package pl.sda.brudnopisy;

import java.util.Scanner;

public class petlaWhile02 {
    public static void main(String[] args) {
        double number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę ujemną: ");
        while (number >= 0) {
            number = scanner.nextDouble();
            if (number>=0){
                System.out.println("Zła liczba. Podaj dowolną liczbę ujemną: ");
            }else{
                System.out.println("Dzięki. Koniec programu!");
            }
        }
    }
}
