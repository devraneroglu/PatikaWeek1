/*
Login İşlemlerinin Temelleri
Kullancı login işlemi esnasında şifreyi yanlış girdiği takdirde ; şifresinin sıfırlamak, yeni bir şifre oluşturulması
Bu yeni şifrenin eski şifre ile aynı olması durumunun kontrolü yapılarak yeni şifresinin ekranda görüntülenmesi
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     String UserName , Password, DefUserName , DefPassword , NewPassword ;
     byte SetPassword = 0 ;                                                                         // Geçersiz seçimi kontrolünde kullandık
        DefUserName = "DEVran";                                                                    // Default Kullanıcı adı ve şifre
        DefPassword = "DEVran9";
        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanıcı adını girin : ");
        UserName = sc.nextLine();
        System.out.print("Şifreyi girin : ");
        Password = sc.nextLine();
        if (UserName.equals(DefUserName) && Password.equals(DefPassword))                        // Kullanıcı adı ve şifre doğruysa
            {
            System.out.print("Kullanıcı adı ve şifre doğru girildi \n Hoşgeldiniz ");
            }
        else if (
            ((!(UserName.equals(DefUserName))) && (!(Password.equals(DefPassword)))) ||         // Kullanıcı adı ve şifre farklıysa
            ((!(UserName.equals(DefUserName))) && (Password.equals(DefPassword)))               // Kullanıcı adı farklı, ancak şifre doğruysa
                ) {
            System.out.println("Kullanıcı veya şifre yanlış girildi. Bilgileri kontrol edin");
                }
        else if  ((UserName.equals(DefUserName)) && (!(Password.equals(DefPassword))))          // Kullanıcı adı doğru, ancak şifre yanlışsa
        {

            System.out.println("Şifre yanlış girildi. Şifrenizi sıfırlamak yeni bir şifre oluşturmak ister misiniz ? ");
            System.out.println("1-EVET \n2-HAYIR");
            SetPassword = sc.nextByte();
            sc.nextLine();
            switch (SetPassword){
                case 1:
                    do {
                        System.out.println("Yeni şifre giriniz : ");
                        NewPassword = sc.nextLine();

                        if (NewPassword.equals(DefPassword)) {
                            System.out.println("Girilen şifre mevcut şifre ile aynıdır");
                        } else {
                            DefPassword = NewPassword;                                        // Yeni şifreyi ata
                            System.out.println("Şifreniz " + DefPassword + " olarak güncellenmiştir.");
                        }
                    }while(DefPassword != NewPassword);                                     // Mevcut şifreden farklı bir şifre girene kadar devam et
                    break;
                case 2:
                    System.out.println("Şifre güncelleme işlemi yapılmayacak ");
                    break;
                default:
                    System.out.println("Geçersiz işlem seçimi yaptınız ! ");                 // 1-EVET 2-HAYIR haricinde giriş yapılması halinde

            }
        }
    }
}