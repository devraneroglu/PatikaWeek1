/*
Kullanıcıya tek sayı giriş yaptırmak için döngü kullan.
Burada tek sayı girişi yapılması gerekirken  şarta uymayan girişlerinden ; hem çift hem de 4 un katı olan girişlerin toplamını ekrana yazdırmak
Doğrudan tek sayı girdiğinde veya çift ve 4 ün katı olmayan girişleri bir işlem yapılması istenmiyor.
 */

/*
ÖrnekSenaryo-1 ;
 * Tek bir sayı girin : 4
 * Tek bir sayı girin : 4
 * Tek bir sayı girin : 32
 * Tek bir sayı girin : 1
 * Tek sayı girene kadar ki durumda; giriş yaptığınız sayılardan  çift ve 4 ün katı olan sayıların toplamı : 40
 */

/*
ÖrnekSenaryo-2 ;
 * Tek bir sayı girin : 10
 * Tek bir sayı girin : 2
 * Process finished with exit code
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int iUserValue = 0;
        int iSumDivisionNumber = 0;
        boolean ConditionControl = false;             // Şartın kontolü içim atanan değişken
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Tek bir sayı girin : ");
            iUserValue = sc.nextInt();
            if (((iUserValue % 2) == 0) && ((iUserValue % 4) == 0)) {
                iSumDivisionNumber += iUserValue;              // giriş yapılan sayı çift ve 4 ün katıysa --> giriş yapılan bu sayıları topla
                ConditionControl = true;
            }
        } while ((iUserValue % 2) != 1);                    // tek sayı girine kadar devam et

        if (ConditionControl) {
            System.out.println("Tek sayı girene kadar ki durumda; giriş yaptığınız sayılardan  çift ve 4 ün katı olan sayıların toplamı :  " + iSumDivisionNumber);
        }
    }
}