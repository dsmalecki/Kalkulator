package pl.sda.praceDomowe1305;

public class Petle3if {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int r = i % 15;
            int r3 = i % 3;
            int r5 = i % 5;
            switch (r) {
                case 0:
                    System.out.println("fizzbuzz");
                    break;
                default: {
                    switch (r3) {
                        case 0:
                            System.out.println("fizz");
                        default: {
                            switch (r5) {
                                case 0:
                                System.out.println("buzz");
                                break;
                                default:
                                    System.out.println(i);
                            }
                        }
                        break;
                    }
                }
            }
        }
    }
}
