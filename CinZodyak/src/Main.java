/*
Çin Zodyağı
Dogum yılının 12 ile bölümünde kalana göre bir burç hesaplaması
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Doğum yılınızı girin : ");
      int DogumYil = sc.nextInt();

      String sZodyakName =  (DogumYil % 12== 0)  ? "MAYMUN"  :
                            (DogumYil % 12== 1)  ? "HOROZ"   :
                            (DogumYil % 12== 2)  ? "KÖPEK"   :
                            (DogumYil % 12== 3)  ? "DOMUZ"   :
                            (DogumYil % 12== 4)  ? "FARE"    :
                            (DogumYil % 12== 5)  ? "ÖKÜZ"    :
                            (DogumYil % 12== 6)  ? "KAPLAN"  :
                            (DogumYil % 12== 7)  ? "TAVŞAN"  :
                            (DogumYil % 12== 8)  ? "EJDERHA" :
                            (DogumYil % 12== 9)  ? "YILAN"   :
                            (DogumYil % 12== 10) ? "AT"      :
                            (DogumYil % 12== 11) ? "KOYUN"   : "";
      System.out.println("Çin zodyağı burcunuz : " + sZodyakName );

    }
}
