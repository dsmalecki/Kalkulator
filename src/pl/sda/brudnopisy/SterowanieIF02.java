package pl.sda.brudnopisy;

public class SterowanieIF02 {
    public static void main(String[] args) {
        boolean isAlive;
        boolean isHealthy;
        boolean isNew;
        double payment; //BigDecimal is more accurate

        isAlive = true;
        isHealthy = true;
        isNew = false;
        payment = 100;
        boolean isPaymentHigher = payment >= 50;

        System.out.print("Kategoria klienta: ");
        if (((payment >= 200)) || ((isNew == true) && (payment >= 50))) {
            System.out.println("VIP");
        } else {
            if ((payment < 200) && (payment >= 50)) {
                System.out.println("Priorytet");
            } else {
                System.out.println("Regular");
            }
        }
        ;

//        System.out.print("Klient moze dostac nowe ubezpieczenie: ");
//        if(isAlive && isHealthy && isPaymentHigher){
//            System.out.print("moze");
//            };
//        if(!(isAlive && isHealthy && isPaymentHigher)){
//            System.out.print("nie moze");
//            };


//        System.out.print("Skladka wyzsza od 50: ");
//        if(isPaymentHigher){
//            System.out.println("jest");
//        }else{
//            System.out.println("nie jest");
//        };
//        System.out.print("Klient moze dostac nowe ubezpieczenie: ");
//        if(isAlive && isHealthy && isPaymentHigher){
//            System.out.println("moze");
//        }else{System.out.println("nie moze");
//        };

//     String komunikat="skladka klienta wynosi ";
//        switch ((int)payment){
//            case 100:
//                System.out.println(komunikat+100);
//            break;
//            case 1000:
//                System.out.println(komunikat+1000);
//            break;
//            case 10000:
//                System.out.println(komunikat+10000);
//                break;
//            default:
//                System.out.println("skladka nie jest rowna");
//                break;
//        }
//        System.out.println("KONIEC");
    }
}
