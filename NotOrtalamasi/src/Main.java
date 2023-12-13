/*
Sınıfı Geçme Durumu
Girilen notların 0-100 aralığında olması kontrolü , değilse ort.hesaplamaya dahil edilmemesi.
 */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin : ");
        int MathGrade = sc.nextInt();
        if (!(MathGrade>0 && MathGrade<101)) {
            MathGrade = 0 ;
        }
        System.out.print("Fizik notunuzu girin : ");
        int PhysGrade = sc.nextInt();
        if (!(PhysGrade>0 && PhysGrade<101)) {
            PhysGrade = 0 ;
        }
        System.out.print("Türkçe notunuzu girin : ");
        int TurkishGrade = sc.nextInt();
        TurkishGrade = ((TurkishGrade>0) && (TurkishGrade<101)) ? TurkishGrade : 0;  // if e alternatif kullanım

        System.out.print("Kimya notunuzu girin : ");
        int ChemiGrade = sc.nextInt();
        if (!(ChemiGrade>0 && ChemiGrade<101)) {
            ChemiGrade = 0 ;
        }
        System.out.print("Müzik notunuzu girin : ");
        int MusicGrade= sc.nextInt();
        if (!(MusicGrade>0 && MusicGrade<101)) {
            MusicGrade = 0 ;
        }

        int sonuc = (MathGrade + PhysGrade + TurkishGrade + ChemiGrade + MusicGrade ) / 5;
        System.out.println("Not ortalamanız : " + sonuc);
        System.out.print(sonuc > 55 ? "Geçtiniz" : "Kaldınız");
    }
}