/*
Armstrong Sayi
Kullanıcıdan alınana sayının basamak değerlerinin toplamını bulup yazdırmak

Örnek digitleri bulmak    -->  1458 % 10 = 8 ; 145 % 10 = 5 ; 14 % 10 = 4 ; 1 % 10 = 1 ,
int türünde olduklarından -->  1458 / 10 = 145 ; 145 / 10 = 14 ; 14 / 10 = 4 ; 1 / 10 = 0 ;
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi girin : ");
        int iUserNumber = sc.nextInt();
        int OutputUserNumber = iUserNumber;
        int iSumDigitValue = 0;
        int iDigit = 0;

        while (iUserNumber != 0) {         // iUserNumber 0 olana kadar devam et
             iDigit = iUserNumber % 10;   //  birler basamağını bul
            iSumDigitValue += iDigit;     //  toplam değişkenine birler basamağı değerini ekle
            iUserNumber /= 10;            //  1458 / 10 = 145 ; 145 / 10 = 14 ; 14 / 10 = 4 ; 1 / 10 = 0 ; birler basamağından kurtul
        }
        System.out.println(OutputUserNumber + " sayısının basamaklar toplamı: " + iSumDigitValue);
    }
}