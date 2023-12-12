/*
Aritmetik İşlemler ve İşlem Önceliği
Kullanıcıdan 3 tane sayı (a, b, c) değeri alınıp ;  a+b*c-b işleminin sonucunun bulunması
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   // Örneğe istinaden --> Val1 = a , Val2 = b , Val3 = c olsun
    System.out.print("İlk sayıyı girin : ");
    int Val1 = sc.nextInt();

    System.out.print("İkinci sayıyı girin : ");
    int Val2 = sc.nextInt();

    System.out.print("Üçüncü sayıyı girin : ");
    int Val3 = sc.nextInt();
    // İşlem sırası : a+b*c-b ;

        int sOutPut = Val1 + Val2 * Val3 - Val2 ;
    System.out.print("Yapılan işlem "+Val1+"+"+Val2+"*"+Val3+"-"+Val2+ "\tİşlem sonucu : " +sOutPut);
    }
}