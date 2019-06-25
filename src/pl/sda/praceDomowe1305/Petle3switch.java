package pl.sda.praceDomowe1305;

public class Petle3switch {
    public static void main(String[] args) {
        for (int i=1; i<=100;i++) {
            int r3 = i%3;
            int r5 = i%5;
            if ((r3==0)||(r5==0)){
                if (r3==0&&r5==0){
                    System.out.println("fizzbuzz");
                }else {
                    if (r3==0) System.out.println("fizz");
                    if (r5==0) System.out.println("buzz");
                }
            }else System.out.println(i);
        }
    }
}