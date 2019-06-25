package pl.sda.tablice;

import java.util.Scanner;

public class Tablice2 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę całkowitą");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tablica = new int[n];
        for(int i=0;i<tablica.length;i++){
            tablica[i] = i+1;
        }

        int i=0;
        while(i<tablica.length){
            System.out.println(tablica[i]);
            i++;
        }
    }
}