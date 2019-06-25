package pl.sda.zapis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class srednia {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("liczby1.txt");
        Scanner scanner = new Scanner(file);
        int[] liczby = new int[7];
        double suma = 0;
        for (int i = 0; i < 7; i++) {
            liczby[i] = scanner.nextInt();
            suma += liczby[i];
        }
        double wynik = suma / liczby.length;
        System.out.println("wynik = " + wynik);
    }
}

