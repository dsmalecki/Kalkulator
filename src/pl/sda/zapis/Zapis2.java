package pl.sda.zapis;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zapis2 {
    public static void main(String[] args) throws FileNotFoundException{
        File plik = new File("ala.txt");
        Scanner skaner = new Scanner(plik);
        String zdanie = skaner.nextLine();
        System.out.println(zdanie);
    }
}
