/*
Burç Bulan Program
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Doğduğunuz ayı girin (1-12) : ");
     int DogumAy = sc.nextInt();
     System.out.print("Doğduğunuz günü girin : ");
     int DogumGun = sc.nextInt();

      String sZodiacName =  ((DogumAy == 3 && DogumGun >= 21 )  ||  (DogumAy == 4 && DogumGun <= 20 )) ? "KOÇ"     :
                            ((DogumAy == 4 && DogumGun >= 21 )  ||  (DogumAy == 5 && DogumGun <= 21 )) ? "BOĞA"    :
                            ((DogumAy == 5 && DogumGun >= 22 )  ||  (DogumAy == 6 && DogumGun <= 22 )) ? "İKİZLER" :
                            ((DogumAy == 6 && DogumGun >= 23 )  ||  (DogumAy == 7 && DogumGun <= 22 )) ? "YENGEÇ"  :
                            ((DogumAy == 7 && DogumGun >= 23 )  ||  (DogumAy == 8 && DogumGun <= 22 )) ? "ASLAN"   :
                            ((DogumAy == 8 && DogumGun >= 23 )  ||  (DogumAy == 9 && DogumGun <= 22 )) ? "BAŞAK"   :
                            ((DogumAy == 9 && DogumGun >= 23 )  ||  (DogumAy == 10 && DogumGun <= 22 )) ? "TERAZİ" :
                            ((DogumAy == 10 && DogumGun >= 23 ) ||  (DogumAy == 11 && DogumGun <= 21 )) ? "AKREP"  :
                            ((DogumAy == 11 && DogumGun >= 22 ) ||  (DogumAy == 12 && DogumGun <= 21 )) ? "YAY"    :
                            ((DogumAy == 12 && DogumGun >= 22 ) ||  (DogumAy == 1 && DogumGun <= 21 )) ? "OĞLAK"   :
                            ((DogumAy == 1 && DogumGun >= 22 )  ||  (DogumAy == 2 && DogumGun <= 19 )) ? "KOVA"    :
                            ((DogumAy == 2 && DogumGun >= 20 )  ||  (DogumAy == 3 && DogumGun <= 20 )) ? "BALIK"   : "";

        System.out.print("Burcun " + sZodiacName );

     }
    }
