/*
Daire diliminin alanının bulunması
 - 𝜋 3.14
 - Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final double fPi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Daire parçasının yarıçapını girin ");
        double yaricap =  sc.nextDouble();
        System.out.print("Daire parçasının iki kenarı arasındaki açısını derece olarak girin ");
        double aciDerece =  sc.nextDouble();
      //  aciRadyan = Math.toRadians(aciDerece);
        double alan = (aciDerece/360)*(fPi)* (Math.pow(yaricap,2));

        System.out.printf("Daire Parçasının Alanı: %.2f " , alan );
    }
}