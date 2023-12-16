/*
n tane sayma sayısından max ve min olanı bulmak
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç kere sayı gireceksin : ");
        int iUserSayac = sc.nextInt();
        int iSayac = 0;
        int iMinDefault = 0;
        int iMaxDefault = 0;
        do {                                             // kullanıcı her sayı girdiğinde girilen sayı ile max ve min sayıları karşılaştır ve güncelle
            int iUserValues = sc.nextInt();
            iSayac++;
            if (iUserValues < iMinDefault) {
                iMinDefault = iUserValues;
            }
            if (iUserValues > iMaxDefault) {
                iMaxDefault = iUserValues;
            }
        }
        while (iSayac < iUserSayac);     // kullanıcı iUserSayac adet sayı girecek

        System.out.print("Girdiğin sayılardan  en büyük değer : " + iMaxDefault + "\t en küçük değer : " + iMinDefault);

    }
}