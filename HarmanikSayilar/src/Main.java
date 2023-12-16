/*
Harmonik Seri Formülü ;
 1 + (1/2) + (1/3) + ... (1/n)  =  toplam
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iUserNumber;
        float fSumSeries = 0;

        System.out.print("Bir sayı girin : ");
        iUserNumber = sc.nextInt();


        for (double i = 1; i <= iUserNumber; i++) {
            fSumSeries += (1 / i);
        }
        System.out.printf("Harmonik serinin toplamı : %.2f", fSumSeries);
    }
}