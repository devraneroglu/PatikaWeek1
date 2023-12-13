/* Uçak Bileti Fiyatı Hesaplama
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve
 yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
 İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */
/*
Çıktılar ;
 - Hatalı giriş yaptığında uyarısı sesi vermek
 - While bloğu ile kullanıcıdan istediğimiz girişi yapmasını sağlamak
 */

/*
Adımlar ;
 - Kullancıdan bilgileri doğru bir şekilde al
 - Yaşa göre olan inidirmi uygula
 - Uçus tipine göre olan indirimi uygula

 */


import java.util.Scanner;  //Kullanıcıdan giriş almak için kullanıldı.
import java.awt.Toolkit;   // kullanıcıya sesli geribildirim sağlamak amacıyla kullanıldı.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double UnitPrice = 0.1;
        double RouteDistance;
        boolean ConditionControl = true;


        System.out.println("Yolculuk tipi nedir ? \"1 veya 2 olarak giriş yapmalısınız\"  \n 1-Tek Yön \n 2-Gidiş-Dönüş  ");
        byte FlyType = sc.nextByte();
        System.out.print("Gidelecek mesafe kaç km'dir ? ");
        RouteDistance = sc.nextDouble();
        System.out.print("Yaşınız nedir ? ");
        int UserAge = sc.nextInt();


        if ((FlyType == 1 || FlyType == 2) && (RouteDistance > 0) && (UserAge>0 && UserAge<100) )
        {
            ConditionControl = true;
        } else {
            Toolkit.getDefaultToolkit().beep();                         // uyarı sesi
            System.out.println("Hatalı giriş yaptınız ! ");
            ConditionControl = false;
        }

       if (ConditionControl == true) {
            double FirstStepWage = RouteDistance * UnitPrice;

            double SecondStepWage = (UserAge <= 12) ? FirstStepWage * 0.5 :        // ternary operator ek indirimlerin uygulanması
                    (UserAge > 12 && UserAge < 24) ? FirstStepWage * 0.9 :
                            (UserAge > 65) ? FirstStepWage * 0.7 : FirstStepWage;

            double ThirdStepWage = (FlyType == 2) ? ((SecondStepWage + SecondStepWage) * 0.8) : SecondStepWage;

            System.out.print("Ödenecek Tutar : " + ThirdStepWage +" TL");
            }
        }
    }
