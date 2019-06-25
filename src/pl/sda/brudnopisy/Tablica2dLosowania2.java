package pl.sda.brudnopisy;
import java.util.Random;
public class Tablica2dLosowania2 {
    public static void main(String[] args) {
        Random random = new Random();
//        int a1,a2,a3,a4,a5,a6;
//        a1 = random.nextInt(49) + 1;
//        a2 = random.nextInt(49) + 1;
//        a3 = random.nextInt(49) + 1;
//        a4 = random.nextInt(49) + 1;
//        a5 = random.nextInt(49) + 1;
//        a6 = random.nextInt(49) + 1;
//
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(a4);
//        System.out.println(a5);
//        System.out.println(a6);

        int[] numbers = new int[6];
        for(int i=0;i< numbers.length;i++){
            int tmp;
            do {
                tmp = random.nextInt(49) + 1;
            } while(isNumberPresent(tmp, numbers));
            System.out.println(numbers[i]);
        }
    for ( int i=0;i<numbers.length;i++){
        System.out.println(numbers[i]);
    }
    }

    private static boolean isNumberPresent(int number, int[] numbers) {

        return false;
    }
}