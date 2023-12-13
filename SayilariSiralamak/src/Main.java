/*
Sayıları Büyükten Küçüğe Sıralama
    İşlem adımları ;
1- Kullanıcıdan 3 tane sayı değeri al
2- Bu sayılar ile dizi oluştur
3- Max ve min değerleri tespit etmek için döngü kullan
4- Üçüncü değeri bul
5- Büyükten küçüğe ekrana yazdırmak

 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("İlk sayıyı girin : ");
        int Val1 =  sc.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        int Val2 = sc.nextInt();
        System.out.print("Üçüncü sayıyı girin : ");
        int Val3 = sc.nextInt();

        int[] UserValues = {Val1, Val2, Val3};                 //Kullacıdan alınan değerleri diziye ata
        int MaxValue = UserValues[0];                          // Max ve min değişkenleri dizinin ilk elemanı ile başlatılır
        int MinValue = UserValues[0];
        int ThirdVal ;
        for (int i = 1; i < UserValues.length; i++) {
            MaxValue = Math.max(MaxValue, UserValues[i]);      // dizideki max ve min değerleri değişkene ata
            MinValue = Math.min(MinValue, UserValues[i]);
        }
        if (Val1 != MaxValue && Val1 != MinValue) {               // en büyük ve en küçük değerler dikkate alınarak son değer bulunur
            ThirdVal = Val1;
        } else if (Val2 != MaxValue && Val2 != MinValue) {
            ThirdVal = Val2;
        } else {
            ThirdVal = Val3;
        }
        System.out.println(MaxValue +" > " + ThirdVal + " > " + MinValue   );
    }
}