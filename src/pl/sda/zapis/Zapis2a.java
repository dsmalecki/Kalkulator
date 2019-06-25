package pl.sda.zapis;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Zapis2a {
    public static void main(String[] args) throws FileNotFoundException{
        File plik = new File("imie.txt");
Scanner skaner = new Scanner(plik);
//String zdanie = skaner.nextLine();
        System.out.println(skaner.nextLine());

    }
}
