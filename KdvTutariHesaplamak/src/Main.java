/* KDV Tutarı Hesaplayan Program

*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Tutar Giriniz : " );
        double tutar = sc.nextInt();
        int kdv = tutar >= 1000 ?  8 : 18 ;

        double kdv_tutari = tutar * (kdv /100.0) ;
        double kdvli_fiyat  = tutar + kdv_tutari;
        System.out.println("Kdvsiz fiyat : " + tutar);
        System.out.println("Kdvli fiyat : " + kdvli_fiyat);
        System.out.println("Kdv tutarı : " + kdv_tutari);
     //   System.out.print("Kdv " + kdv);
    }
}