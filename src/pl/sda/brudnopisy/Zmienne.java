package pl.sda.brudnopisy;

public class Zmienne {

    int liczka = 4; //tworzymy obiekt, nie zmienna
    static int liczba = 4;

    public static void main(String[] args){
//        String tekst = "Hello world!";
//        System.out.println("Asia \nKasia \\\ \"Madzia\"");
//        System.out.println("tekst = " + tekst);

        int zmienna1 = 41;
        int zmienna2 = 42;
        int suma = zmienna1 + zmienna2;
//        System.out.println("liczba1 = "+ zmienna1);
//        System.out.println("liczba2 = "+ zmienna2);
//        System.out.println(suma);
//        System.out.println("suma = " + suma);
        System.out.println("suma = " + (zmienna1+zmienna2));
        System.out.println("suma = \t" + (Math.pow(zmienna1,2)));

        //String.format

    final int final1;
    final1=5;
    final String komunikat = "nie można zmienić";
//    komunikat="hahah"; - tego nie uda Ci się zrobić w zmiennej finalnej
        System.out.println("zmienna niezmienna = " + final1);
        System.out.println(komunikat + " - a jednak dodałem tekst");
    }
}
