/*
Taksimetre Tutarı
 - KM başına ücret 2.20 TL
 - Minimum ödenecek ücret 20 TL
 - Taksimetre açılış ücreti 10 TL
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    final double  AcilisUcret = 10.0 ;
    final double  KmUcret = 2.20;
        Scanner sc = new Scanner(System.in);
        System.out.print("Gidilen mesafe kaç km\'dir ? ");
        double GidilenKm = sc.nextDouble();
        double OdenecekTutar =  AcilisUcret + ( GidilenKm * KmUcret ) ;
        System.out.printf("Ödemeniz Gereken Tutar: %.2f TL", (OdenecekTutar < 20 ? 20.0 : OdenecekTutar));
    }
}

