package pl.sda.brudnopisy;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WyjatkiPetle {

    public static void wyswietlMenu(){
        System.out.println("Co chciałbyś zrobić?");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Zamknij");
    }

    public static int pobierzOperacjeOdUzytkownika(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Podano daną niewłaściwego typu");
        } catch (Exception e) {
            System.out.println("Coś poszło nie tak");
        } finally {
            return 0;
        }
    }

    public static void main(String[] args) {
        int operacja;
        do {
            wyswietlMenu();
            operacja = pobierzOperacjeOdUzytkownika();
            switch (operacja) {
                case 1:
                    System.out.println("#Tu następuje dodawanie");
                    break;
                case 2:
                    System.out.println("#Tu następuje odejmowanie");
                    break;
                case 3:
                    System.out.println("Do widzenia");
                    break;
                default:
                    System.out.println("Podałeś niepoprawny numer operacji");
            }
        } while (operacja != 3);
    }
}