package pl.sda.brudnopisy;

import java.util.Scanner;

import static java.lang.Math.*;

public class KalkulatorZObslugaBledow {
    public static void dodaj(double a, double b) {
        System.out.println("suma = " + (a + b));
    }

    public static void odejmij(double a, double b) {
        System.out.println("roznica = " + (a - b));
    }

    public static void pomnoz(double a, double b) {
        System.out.println("iloczyn = " + (a * b));
    }

    public static void podziel(double a, double b)throws Exception {
        if (b==0){
            throw new Exception("Nie można dzielić przez 0!!!");
        }
        else System.out.println("iloraz = " + (a / b));
    }

    public static void potega(double a, double b) {
        System.out.println("potega = " + pow(a, b));
    }

    public static void pierwiastek(double a, double b) {
        System.out.println("pierwiastek = " + pow(a, (1 / b)));
    }

    public static void reszta(double a, double b) {
        System.out.println("reszta = " + (a % b));
    }

    public static void main(String[] args) {
        System.out.println("Witaj w kalkulatorze!\n");
        System.out.println("Proszę podaj pierwszą liczbę");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Proszę podaj kolejną liczbę");
        double b = scanner.nextDouble();

        System.out.println("Pierwsza liczba to = " + a + ",\t a druga liczba to = " + b + "\n");
        System.out.println("podaj rodzaj działania \ndodawanie \t odejmowanie \t mnozenie \t dzielenie \t potega \t pierwiastek");
        String c = scanner.next();
        switch (c) {
            case "dodawanie":
                dodaj(a, b);
                break;
            case "odejmowanie":
                odejmij(a, b);
                break;
            case "mnozenie":
                pomnoz(a, b);
                break;
            case "dzielenie":
                try {
                    podziel(a, b);
                } catch (Exception e) {
                    System.out.println("Nie można dzielić przez zero.");
                }
                break;
            case "potega":
                potega(a, b);
                break;
            case "pierwiastek":
                pierwiastek(a, b);
                break;
            case "reszta":
                reszta(a, b);
                break;
            default:
                System.out.println("Wybrano niewlasciwe dzialanie");
                break;

        }
    }
}