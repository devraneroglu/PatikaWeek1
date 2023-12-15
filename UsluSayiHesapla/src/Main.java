/*
Kullanıcıdan alınan değerler ile kuvvet hesaplamak
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban için sayı girin : ");
        int iBase = sc.nextInt();                   //taban
        System.out.print("Üs için sayı girin : ");
        int iPower = sc.nextInt();                   // üs

        int iOutput = 1;
        for (int i = 1; i <= iPower; i++) {
            iOutput *= iBase;
        }

        System.out.print(iBase+"^"+iPower+" = " + iOutput);

    }
}