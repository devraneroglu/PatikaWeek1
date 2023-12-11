/*
Vücut kitle endeksi hesaplamak
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Boyunu metre cinsinde  girin: ");
        double boy = sc.nextDouble();
          System.out.print("Kilonuzu girin : ");
        double kilo = sc.nextDouble();
        double  VKitleEndeks = kilo / Math.pow(boy,2);
          System.out.print("Vücut kitle endeksiniz : " + VKitleEndeks);
    }
}