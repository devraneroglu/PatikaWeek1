/*
ATM uygulaması
seçimlerin switch case ile yapılması ;
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String UserName, Password, DefUserName, DefPassword, NewPassword;
        byte SetPassword = 0;                                                                         // Geçersiz seçimi kontrolünde kullandık
        DefUserName = "patika";                                                                    // Default Kullanıcı adı ve şifre
        DefPassword = "dev123";
        int AccBalance = 1000;
        int iSelect;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanıcı adını girin : ");
        UserName = sc.nextLine();
        System.out.print("Şifreyi girin : ");
        Password = sc.nextLine();
        if (UserName.equals(DefUserName) && Password.equals(DefPassword))                        // Kullanıcı adı ve şifre doğruysa

            do {

                System.out.println("Kullanıcı adı ve şifre doğru girildi \t Hoşgeldiniz ");
                System.out.println("Yapmak istediğiniz işlemi seçin :  ");
                System.out.println("1 - Para Yatırma \n" +
                        "2 - Para Çekme\n" +
                        "3 - Bakiye Sorgula\n" +
                        "4 - Çıkış");
                iSelect = sc.nextInt();
                sc.nextLine();
                switch (iSelect) {
                    case 1:
                        System.out.println("Yatırmak istene para : ");
                        int iAmountDeposit = sc.nextInt();
                        AccBalance += iAmountDeposit;
                        break;
                    case 2:
                        System.out.println("Mevcut Bakiye : " + AccBalance + " Çekmek istenen para : ");
                        int iAmountWithdraw = sc.nextInt();
                        AccBalance -= iAmountWithdraw;
                    case 3:
                        System.out.println("Mevcut bakiye: " + AccBalance);
                        break;
                    case 4:
                        System.out.println("Hoşçakal");
                        break;
                    default:
                        System.out.println(" İşlem adımında 1 ,2 ,3, 4 harici seçim yaptınız !\n " +
                                "Ana ekrana yönleceksin");
                }


            } while (iSelect != 4);
        else if (
                ((!(UserName.equals(DefUserName))) && (!(Password.equals(DefPassword)))) ||         // Kullanıcı adı ve şifre farklıysa
                        ((!(UserName.equals(DefUserName))) && (Password.equals(DefPassword)))               // Kullanıcı adı farklı, ancak şifre doğruysa
        ) {
            System.out.println("Kullanıcı veya şifre yanlış girildi. Bilgileri kontrol edin");
        } else if ((UserName.equals(DefUserName)) && (!(Password.equals(DefPassword))))          // Kullanıcı adı doğru, ancak şifre yanlışsa
        {

            System.out.println("Şifre yanlış girildi. Şifrenizi sıfırlamak yeni bir şifre oluşturmak ister misiniz ? ");
            System.out.println("1-EVET \n2-HAYIR");
            SetPassword = sc.nextByte();
            sc.nextLine();
            switch (SetPassword) {
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
                    } while (DefPassword != NewPassword);                                     // Mevcut şifreden farklı bir şifre girene kadar devam et
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