/*
Üçgende Alan - Çevre İlişkisi
Üç kenar uzunluğu kullanıcıdan alınan üçgenin alanının hesaplanması
-Herhangi iki kenarın toplamının diğer kenardan büyük olması (kabul)
-Girilen uzunluğun cm olduğu varsayılmıştır (kabul)

 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Üçgenin ilk kenarının uzunluğu girin : ");
        double Kenar1 = sc.nextDouble();
        System.out.print("Üçgenin ikinci kenarının uzunluğu girin : ");
        double Kenar2 = sc.nextDouble();
        System.out.print("Üçgenin üçüncü kenarının uzunluğu girin : ");
        double Kenar3 = sc.nextDouble();

       double  Cevre = ((Kenar1 + Kenar2 + Kenar3 ) / 2.0 );
       double Alan =  Math.sqrt( Cevre * (Cevre-Kenar1) * (Cevre-Kenar2) * (Cevre-Kenar3) ) ;
        System.out.print(" Üçgenin alanı : "  + Alan + " cm2\'dir"  );

    }
}