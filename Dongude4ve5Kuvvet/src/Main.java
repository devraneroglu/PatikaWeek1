/*
while döngüsü ile kullanıcının girdiği pozitif bir sayıya kadar olan 4 ve 5'in kuvvetlerini bul ve ekrana yazdır
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iUserNumber;                                     // pozitif giriş kontrolü
        do {
            System.out.print("Pozitif bir sayi gir : ");
            iUserNumber = sc.nextInt();
        } while (iUserNumber <= 0);

        int i = 1;
        int j = 4;
        int k = 5;
        System.out.println(iUserNumber + " e kadar 4 ve 5 in kuvveti olan değerler aşağıdaki gibidir ; ");

        /* her turda Math.pow fonkiyonunu ile 4^i , 5^i değerlerini hesapla j ve k değişkenlerine ata ,
           aynı zamanda j ve k nın iUserNumber dan küçük olması durumunu kontrol et
         */
        while (((j = (int) Math.pow(4, i)) <= iUserNumber) && ((k = (int) Math.pow(5, i)) <= iUserNumber)) {
            System.out.println("4^" + i + " = " + j);
            System.out.println("5^" + i + " = " + k);
            i++;
        }
    }
}