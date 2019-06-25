package pl.sda.brudnopisy;

public class Operatory02 {
    public static void main(String[] args) {
        boolean isAlive;
        boolean isHealthy;
        boolean isNew;
        double payment; //BigDecimal is more accurate

        isAlive = false;
        isHealthy = true;
        isNew = false;
        payment = 100;
        boolean isPaymentHigher = payment>=50;

        System.out.print("Skladka wyzsza od 50: ");
        if(isPaymentHigher){
            System.out.print("jest \n");
        };
        if(!isPaymentHigher){
            System.out.print("nie jest \n");
        };
        System.out.print("Klient moze dostac nowe ubezpieczenie: ");
                if(isAlive && isHealthy && isPaymentHigher){
            System.out.print("moze");
        };
                if(!(isAlive && isHealthy && isPaymentHigher)){
            System.out.print("nie moze");
        };
        System.out.println();
        float a = .5f;
        System.out.println(a == 0.5f);
        float b= 6.0f;
        a += b;
        System.out.println(a);
        System.out.println("a = " + a);
        System.out.println("a++ = " + (++a)); //jeśli umieścisz ++ za zmienną to wyświetli po staremu a później doda
//        int a;
//        a = 5;
//        a += 7;
//        System.out.println(a);

        System.out.println(3 == 3 && 3 == 4);
        System.out.println(3 != 5 || 3 == 5);
        System.out.println((2+4) > (1+3));
        System.out.println("cos".equals("cos"));
        System.out.println("cos" == "cos");

    }
}
