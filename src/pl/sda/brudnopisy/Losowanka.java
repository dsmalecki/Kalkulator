package pl.sda.brudnopisy;

import java.util.Random;

public class Losowanka {
    public static void main(String[] args) {


//1. Wylosuj liczbę od 5 do 10;
//2. Wylosuj liczbę parzystą z przedziału od 0 do 100;
//3. Wylosuj liczbę z przedziału od -100 do 100;
//4. Wylosuj liczbę podzielną przez 15 z przedziału od 0 do 100;
//5.
        Random losuj = new Random();
        int liczba;
        liczba = losuj.nextInt(6) + 5;//losuje od 5 do 10
        System.out.println(liczba);
        do {
            liczba = losuj.nextInt(101); //losuje od 0 do 100
        } while (!(liczba % 2 == 0));
        System.out.println(liczba);
        liczba = losuj.nextInt(201) - 100; // losuje od -100 do 100;
        System.out.println(liczba);
        do {
            liczba = losuj.nextInt(101);
        } while (!(liczba % 15 == 0));
        System.out.println(liczba);
    }
}

