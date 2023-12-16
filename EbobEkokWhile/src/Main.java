/*
Ebob ekok un while ile bulunması
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci değeri girin : ");
        int i = sc.nextInt();
        System.out.print("İkinci değeri girin : ");
        int j = sc.nextInt();
        int k = j;
        while (k > 0) {
            if (i % k == 0 && j % k == 0) {
                System.out.println("Ebob : " + k);
                break;                              // Ortak bölenlerin en büyüğünü almak için kullanıldı.
            }
            k--;
        }
        int iEkok = (i * j) / k;
        sc.nextLine();
        System.out.print("Ekok : " + iEkok);

    }
}