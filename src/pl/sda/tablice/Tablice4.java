package pl.sda.tablice;

public class Tablice4 {
    public static void main(String[] args) {
        int [][] tablica = new int[5][5];
        for (int i1 = 0; i1<5; i1++){
            for (int i2 = 0; i2<5; i2++){
                if(i1==2){tablica[i1][i2]=1;
            }else tablica[i1][i2]=0;
            }
        }
        for (int i1=0; i1<5; i1++){
            for (int i2=0; i2<5; i2++){
                System.out.print(tablica[i1][i2]);
            }
            System.out.println();
        }
    }
}
