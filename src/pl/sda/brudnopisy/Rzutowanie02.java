package pl.sda.brudnopisy;

public class Rzutowanie02 {
    public static void main(String[] args) {
        char znak;
        znak = (char)80.4f; //jawna konwersja z szerszego typu na węższy
        System.out.println(znak);

        boolean isAlive;
        isAlive = false;
        boolean isHealthy;

        if (!isAlive){
            System.out.println("klient jest martwy");
        }
    }
}
