package pl.sda.brudnopisy;

public class Bomba {
    public static void main(String[] args) {
        for (int i = 10; i >-1; i--) {
            System.out.println("Bomba wybuchnie za\t" + i + " s");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i==0){
                System.out.println("BUM!!!");
            }
        }
    }
}
