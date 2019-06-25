package pl.sda.zapis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Odczyt {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("liczby1.txt");
        Scanner skaner = new Scanner(file);
        int suma=0;
        int ilosc=0;
        int srednia;
        int liczba = skaner.nextInt();
//        String zdanie = skaner.nextLine();
        do {
//        System.out.println("tekst ="+zdanie);
            System.out.println("liczba = " + liczba);
            suma+=liczba;
            ilosc++;
        }while (1>0);
//                srednia = suma/ilosc;
//        System.out.println(srednia);
    }
}
