/* Pratik - Hava Sıcaklığına Göre Etkinlik Önerme

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.


 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hava sıcaklığı girin : ");
        int sicaklik = sc.nextInt();
        String OneriEtkinlik = sicaklik < 5 ? "Kayak Yapabilirsin" :
                (sicaklik >= 5 && sicaklik <15 ) ? "Sinemaya gidebilirsin" :
                        (sicaklik >= 15 && sicaklik < 25) ? "Pikniğe gidebilirsin" :
                                (sicaklik >= 25) ? "Yüzmeye gidebilirsin" : "" ;
        System.out.println(OneriEtkinlik);
    }
}