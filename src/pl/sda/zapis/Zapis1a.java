package pl.sda.zapis;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Zapis1a {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("podaj imie");
        Scanner skaner = new Scanner(System.in);
        String a = skaner.nextLine();
        PrintWriter zapisz = new PrintWriter("imie.txt");
        zapisz.println(a);
        zapisz.close();
    }
}
