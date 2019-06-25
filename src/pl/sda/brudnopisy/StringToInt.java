package pl.sda.brudnopisy;

public class StringToInt {
    public static void main(String[] args) {
        String number = "10";
        Integer result = Integer.valueOf(number);
        System.out.println(result);
        int a = result;
        int b = a*4286;
        System.out.println(b);
    }
}
