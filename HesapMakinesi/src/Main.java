/*
Hesap makinesini uygulamasının switch-case ile yapılması
Kullanıcıdan iki tane sayı alınarak; bu sayılarla hangi aritmetik işlemin yapılacağına göre
ekrana sonucun yazdırılması
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      double sayi1 , sayi2 , sonuc ;
      int islem;
        Scanner sc = new Scanner(System.in);
        System.out.print("İlk sayiyi girin : ");
        sayi1 = sc.nextDouble();
        System.out.print("İkinci sayiyi girin : ");
        sayi2 = sc.nextDouble();
        System.out.println("Girilen iki sayı için hangi işlem yapılsın\n 1-Topla \n 2-Çıkar \n 3-Çarp \n 4-Böl");
        islem = sc.nextInt();
        switch (islem){
          case 1:
            sonuc = sayi1 + sayi2;
            System.out.print("İşlem sonucu : " +sonuc);
            break;
          case 2:
            sonuc = sayi1 - sayi2;
            System.out.print("İşlem sonucu : " +sonuc);
            break;
          case 3:
            sonuc = sayi1 * sayi2;
            System.out.print("İşlem sonucu : " +sonuc);
            break;
          case 4:
            if (sayi2 != 0 ) {
              sonuc = sayi1 / sayi2;
              System.out.print("İşlem sonucu : " + sonuc);
            }
            else {
              System.out.println("Bir sayıyının 0'a bölümü tanımsızdır ! ");
            }
            break;
          default:
            System.out.println("Geçersiz işlem seçimi yaptınız ! ");
        }

    }
}