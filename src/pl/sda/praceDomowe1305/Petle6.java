package pl.sda.praceDomowe1305;

public class Petle6 {
    public static void main(String[] args) {
        int kolumny = 5;
        for (int i = 0; i <= kolumny; i++) {
            int spacje = 5;
            while (spacje >= i) {
                System.out.print(" ");
                spacje--;
            }
            int gwiazdki = 1;
            while (gwiazdki <= i) {
                System.out.print("* ");
                gwiazdki++;
            }
            System.out.println();
        }
        System.out.println();
    }
}
