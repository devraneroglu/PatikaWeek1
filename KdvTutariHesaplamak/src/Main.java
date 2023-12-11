/* KDV Tutarı Hesaplayan Program
Kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran program
Girilen tutar 0-1000 aralığında ise Kdv = %18 , 1000den büyükse Kdv=%8 uygulanır.
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Tutar Giriniz : " );
        double tutar = sc.nextDouble();
        final double kdvOrani = tutar > 1000 ?  8.0 : 18.0 ;

        double kdv_tutari = tutar * (kdvOrani / 100.0) ;
        double kdvli_fiyat  = tutar + kdv_tutari;
        System.out.println("Kdvli fiyat : " + kdvli_fiyat);
        System.out.println("Kdv tutarı : " + kdv_tutari);
       // System.out.print("Kdv " + kdvOrani);
    }
}