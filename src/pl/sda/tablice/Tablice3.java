package pl.sda.tablice;

import java.lang.String;

public class Tablice3 {
    public static void main(String[] args) {
        int[] tablica = new int[]{1, 3, 5, 10};
        int n = tablica.length;
        System.out.println("cz3");
        for (int i2 = 0; i2 < n; i2++) {
            System.out.println(tablica[i2]);
        }
        System.out.println("cz4");
        for (int i2 = 0; i2 < n; i2++) {
            if (tablica[i2]%2==0){
            System.out.println(tablica[i2]);
        }
            System.out.println("cz5");
        }
        for (int i = 3; i>=0; i--){
            System.out.println(tablica[i]);
        }
    }
}
