/*
Ters Ucgen
Kullanıcıdan alınan basamak sayısı ve yıldızlar ile ters ucgen oluşturmak.
                i  j  k
***********     6  11 0
 *********      5  9  1
  *******       4  7  2
   *****        3  5  3
    ***         2  3  4
     *          1  1  5

     2i -1 = j ;
      i + k = n ;
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Basamak sayısı girin : ");
        int iUserValue = sc.nextInt();

        for (int i = iUserValue; i >= 0; i--) {

            for (int k = iUserValue; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}