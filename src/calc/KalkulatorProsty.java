package calc;

import static java.lang.Math.*;

public class KalkulatorProsty {
    public static void dodaj(double x, double y) {
        System.out.println("suma = " + (x + y));
    }

    public static void odejmij(double x, double y) {
        System.out.println("roznica = " + (x - y));
    }

    public static void pomnoz(double x, double y) {
        System.out.println("iloczyn = " + (x * y));
    }

    public static void podziel(double x, double y) {
        System.out.println("iloraz = " + (x / y));
    }

    public static void potega(double x, double y) {
        System.out.println("potega = " + pow(x, y));
    }

    public static void pierwiastek(double x, double y) {
        System.out.println("pierwiastek = " + pow(x, (1 / y)));
    }

    public static void prw2(double x) {
        System.out.println("pierwiastek 2. stopnia = " + sqrt(x));
    }

    public static void main(String[] args) {
        double x = 125.0d;
        double y = 3.0d;
        System.out.print(x);
        System.out.print("\t");
        System.out.print(y);
        System.out.println();
//        public static void pierwiastek(double x, double y){
//            System.out.println("pierwiastek = " + pow(x,(1/y)));
//        }
        dodaj(x, y);
        odejmij(x, y);
        pomnoz(x, y);
        podziel(x, y);
        potega(x, y);
        pierwiastek(x, y);
        prw2(x);
        System.out.println("wartosc bezwgledna = " + (abs(125)));
    }
}
