package pl.sda.praceDomowe1305;
import java.util.Scanner;
public class Petle9 {
    public static void main(String[] args) {
        System.out.println("Podaj tekst");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int length1 = a.length();
        while (length1 >0) {
            char b = a.charAt(length1-1);
            System.out.print(b);
            length1--;
        }
    }
}
