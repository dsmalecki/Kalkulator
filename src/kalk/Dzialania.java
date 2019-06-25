package kalk;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Dzialania {
    void dodaj(double a, double b) {
        System.out.println("suma = " + (a + b));
    }

    void odejmij(double a, double b) {
        System.out.println("roznica = " + (a - b));
    }

    void pomnoz(double a, double b) {
        System.out.println("iloczyn = " + (a * b));
    }

    void podziel(double a, double b) {
        System.out.println("iloraz = " + (a / b));
    }

    void potega(double a, double b) {
        System.out.println("potega = " + pow(a, b));
    }

    void pierwiastek(double a, double b) {
        System.out.println("pierwiastek = " + pow(a, (1 / b)));
    }

    void reszta(double a, double b) {
        System.out.println("reszta = " + (a % b));
    }

    void poczatek() {
        System.out.println("Witaj w kalkulatorze!\n");
    }

    void pobierzLiczby(double a, double b) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę");
        a += scanner.nextDouble();
        System.out.println("Proszę podaj kolejną liczbę");
        b += scanner.nextDouble();
    }

    void wyswietl(double a, double b) {
        System.out.println("Pierwsza liczba to = " + a + ",\t a druga liczba to = " + b + "\n");
    }

    void dostepneDzialania() {
        System.out.println("podaj rodzaj działania \ndodawanie \t odejmowanie \t mnozenie \t dzielenie \t potega \t pierwiastek");
    }
}
