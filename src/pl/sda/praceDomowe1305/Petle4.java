package pl.sda.praceDomowe1305;

public class Petle4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            int n = 1;
            while (i >= n) {
                System.out.print("*");
                n++;
            }
            System.out.println();
            n = 1;
        }
    }
}