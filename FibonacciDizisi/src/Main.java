
/*
Fibonacci serisi ;
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci serisi kaç elamnalı olacak ? ");
        int iUserValue = sc.nextInt();
        int iFibonnaci1 = 0;
        int iFibonnaci2 = 1;
        int iFibonnaci3;


        for (int i = 1; i < iUserValue; i++) {         //  Seri :  0 1 1 2 3 5 8 13 21 34 55
            iFibonnaci3 = iFibonnaci1 + iFibonnaci2;   // 3.üncü fibonacci sayısı birinci ve ikinici sayıların toplamı
            iFibonnaci1 = iFibonnaci2;                 // ilk fibonacci sayısını ikinciye güncelle
            iFibonnaci2 = iFibonnaci3;                 // ikinci fibonacci sayısını üçüncüye güncelle
            System.out.println(iFibonnaci3);
        }
    }
}