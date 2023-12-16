import java.util.Scanner;

/*
Tip dönüşümleri;
Kullanıcıdan tam sayı ve ondalıklı sayı al
 tam sayı      --> ondalıklı sayı   [Auto Widennig]
 ondalıklı say --> tam sayı         [Explicit Narrowing]
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tam sayı giriniz : ");
        int iExampleInt = sc.nextInt();

        System.out.print("Ondalıklı sayı giriniz : ");
        float fExampleFloat = sc.nextFloat();

        System.out.print("[Explicit Narrowing] " + fExampleFloat + "-->" + (int)fExampleFloat);

        fExampleFloat = iExampleInt;
        System.out.println("[Auto Widenning] " + iExampleInt + "-->" + fExampleFloat);

    }
}