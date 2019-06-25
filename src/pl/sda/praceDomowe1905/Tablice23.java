package pl.sda.praceDomowe1905;

import java.util.Random;
import java.lang.Math;

public class Tablice23 {
    public static void main(String[] args) {
            int[] tablica1 = new int[4];
        int[] tablica2 = new int[4];


        Random losuj = new Random();
        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = losuj.nextInt();
            System.out.println(i+ "= "+tablica1[i]);
        }
        for (int i = 0; i < tablica2.length; i++) {
            tablica2[i] = losuj.nextInt();
            System.out.println(i+ "= "+tablica2[i]);
        }
        //2 getMax
        int max =-2147483648;
        for (int i=0;i<tablica1.length;i++){
            if (max<tablica1[i])max=tablica1[i];
        }
        System.out.println("największy argument to: "+max);

        //3 getSum
        int suma=0;
        for (int i = 0; i < tablica1.length; i++) suma+=tablica1[i];
        System.out.println("suma ="+suma);

        //4 getMaxMinAnsSum
        int[] tablica4 = new int[3];
        //4max
        for (int i=0;i<tablica1.length;i++){
            if (-2147483648<tablica1[i])tablica4[0]=tablica1[i];
        }
        //4min
        for (int i=0;i<tablica1.length;i++){
            if (214748364>tablica1[i])tablica4[1]=tablica1[i];
        }
        //4sum
        tablica4[3]=0;
        for (int i = 0; i < tablica1.length; i++) tablica4[3]+=tablica1[i];
        //wyświetlenie tablicy
        for (int i=0;i<tablica4.length;i++) System.out.println(tablica4[i]);

    }

    public static void getMax(int[] tablica1){

    }

}

