/*
Artik Yıl Kontrolü
 4e tam bölünmeli aynı zamanda 100e tam bölünemeyip  400 e tam bolunmelidir
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Yıl girin : ");
            int iYear = sc.nextInt();
        String sOutput = (iYear % 4 == 0 && (iYear % 100 != 0 || iYear % 400 == 0)) ? "Artık yıldır(+)" : "Artık yıl değildir(-)";
        System.out.print(iYear +"\t"+ sOutput );
        }
    }
