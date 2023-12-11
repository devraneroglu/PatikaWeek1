/*
Manav Kasa Programı
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        final double PearPrice = 2.14;
        final double ApplePrice = 3.67;
        final double TomatoPrice = 1.11;
        final double BananaPrice = 0.95;
        final double EggPlantPrice = 5.00;

        System.out.print("Kaç kg armut aldınız : ");
        Scanner sc = new Scanner(System.in);
        double PearAmnt =  sc.nextDouble();
        double PearTotal = PearPrice * PearAmnt;

        System.out.print("Kaç kg elma aldınız : ");
        double AppleAmnt  =  sc.nextDouble();
        double AppleTotal = ApplePrice * AppleAmnt;

        System.out.print("Kaç kg domates aldınız : ");
        double TomatoAmnt  =  sc.nextDouble();
        double TomatoTotal = TomatoPrice * TomatoAmnt;

        System.out.print("Kaç kg muz aldınız : ");
        double BananaAmnt  =  sc.nextDouble();
        double BananaTotal = BananaPrice * BananaAmnt;

        System.out.print("Kaç kg patlican aldınız : ");
        double EggPlantAmnt  =  sc.nextDouble();
        double EggPlantTotal = EggPlantPrice * EggPlantAmnt;

        double TotalPrice = (PearTotal+AppleTotal+TomatoTotal+BananaTotal+EggPlantTotal);
        System.out.print("Toplam tutar : " + TotalPrice +  " TL");
    }
}