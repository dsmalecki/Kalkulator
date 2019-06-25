package calc;

import java.util.Scanner;

import static java.lang.Math.*;

public class KalkulatorSkaner1 {
    public static void dodaj(double a, double b) {
        System.out.println("suma = " + (a + b));
    }

    public static void odejmij(double a, double b) {
        System.out.println("roznica = " + (a - b));
    }

    public static void pomnoz(double a, double b) {
        System.out.println("iloczyn = " + (a * b));
    }

    public static void podziel(double a, double b) {
        System.out.println("iloraz = " + (a / b));
    }

    public static void potega(double a, double b) {
        System.out.println("potega = " + pow(a, b));
    }

    public static void pierwiastek(double a, double b) {
        System.out.println("pierwiastek = " + pow(a, (1 / b)));
    }

    public static void main(String[] args) {
        System.out.println("Witaj w kalkulatorze!\n");
        System.out.println("Proszę podaj pierwszą liczbę");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Proszę podaj kolejną liczbę");
        double b = scanner.nextDouble();

        System.out.println("Pierwsza liczba to = " + a + ",\t a druga liczba to = " + b + "\n");
        System.out.println("podaj rodzaj działania \n 1 - dodawanie \n2 - odejmowanie \n3 - mnozenie \n4 - dzielenie \n5 - potega \n6 - pierwiastek");
        int c = scanner.nextInt();
        switch (c) {
            case 1:
                dodaj(a, b); break;
            case 2:
                odejmij(a, b); break;
            case 3:
                pomnoz(a, b); break;
            case 4:
                podziel(a, b); break;
            case 5:
                potega(a, b); break;
            case 6:
                pierwiastek(a, b); break;
            default:
                System.out.println("Wybrano niewlasciwe dzialanie"); break;
        }
    }
}