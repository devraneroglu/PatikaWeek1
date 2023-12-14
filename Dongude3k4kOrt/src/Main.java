/*
 0 dan kullanıcıdan alınan sayı aralığında 3 ve 4 e tam bölünen sayıların ortalamasını bulmak
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iUserNumber;                        //kullanıcıdan alınan değer atanır
        int iSumDivisionNumber = 0;             //3 ve 4 e tam bolunen sayıların toplamı atanır
        int iCountNumber = 0;                   //3 ve 4 bölünen kaç sayı oldugu bilgisis tutulur
        int j = 1;
        do {                                                      // do-while dönügüsü ile pozitif sayı girmesi sağlanır
            System.out.print("Bir sayı giriniz : ");
            iUserNumber = sc.nextInt();
            sc.nextLine();

            if (iUserNumber <= 0) {
                System.out.println("Pozitif bir sayı girmelisin ! \t İlk giriş ekranına yönlendirileceksin ");
            }
        } while (iUserNumber <= 0);


        while (j <= iUserNumber) {                 // 1 den başla kullanıcının sayıya kadar olan sayılarıdan ;
            if ((j % 3 == 0) && (j % 4 == 0)) {
                iSumDivisionNumber += j;           // 3 ve 4 tam bölünen sayı toplamını ve kaç tane sayı olduğunu bul
                iCountNumber++;
            }
            j++;
        }


        if (iCountNumber > 0) {
            float fAverage = (float) iSumDivisionNumber / iCountNumber;    // tam sayı durumu için kullanıldı
            System.out.println("0-" + iUserNumber + " aralığında 3 ve 4 e tam bölünen sayıların ortalaması : " + fAverage);
        } else {
            System.out.println("0-" + iUserNumber + " aralığında 3 ve 4 e tam bölünen sayı bulunmamaktadır");
        }
    }
}