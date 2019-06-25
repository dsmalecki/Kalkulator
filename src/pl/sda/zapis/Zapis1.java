package pl.sda.zapis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zapis1 {
    public static void main(String[] args) throws FileNotFoundException {
//        File plik = new File("ala.txt");
        PrintWriter zapisz = new PrintWriter("ala.txt");
//        zapisz.append("DOPISKA");
        zapisz.println("Ala ma kota, a kot ma Alę");
        zapisz.close();

    }
}
