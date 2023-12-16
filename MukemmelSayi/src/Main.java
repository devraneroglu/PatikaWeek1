/*
Kullanıcıdan alınan sayının mukemmel sayı olup olmadığını kontrol etmek
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        int iUserNumber = sc.nextInt();
        int iSumParseValues = 0;
        for (int i = 1; i < iUserNumber; i++) {      //sayının kendi hariç pozitif çarpanlarını bul toplam değişkenine ata;

            if (iUserNumber % i == 0) {
                iSumParseValues += i;
            }
        }

        String sOutput = (iUserNumber == iSumParseValues) ? "Mükemmel sayi (+)" : "Mükemmel sayi değil (-)";
        System.out.print(sOutput);
    }
}