/*
Kombinasyon hesaplayan programın while döngüsü ile yazılması
C(n,r) = n! / (r! * (n-r)!)
C(n,n) = C(n,0) = 1
r <= n
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCluster;
        int rSequence;

        do
        {                                                                // do- while blogunda r <= n kontrolü sağlanır
            System.out.print("Kombinasyon için n değeri girin : ");
            nCluster = sc.nextInt();
            System.out.print("Kombinasyon için r değeri girin : ");
            rSequence = sc.nextInt();
            if (rSequence > nCluster) {
                System.out.println(nCluster + " elemanlı bir kümenin " + rSequence + " elemanlı alt kümeleri yazılmaz ! \t Lütfen doğru giriş yapın ");
            }
        } while (nCluster < rSequence);

        int n = nCluster;                      // nCluster ve rSequence while içinde sıfırlanmadan önce n ve r ye atanıp sonuc cümlesinde kullanıldı.
        int r = rSequence;
        int iDiffFact = nCluster - rSequence;

                                               // 3 defa aynı işlemi yaptık. İleryen süreçte  fonksiyon yazarak amelelikten kurtulabiliriz
        int DiffFact = 1;                      // (n-r)!
        while (iDiffFact >= 1) {
            DiffFact *= iDiffFact;
            iDiffFact--;
        }

        int nClusterFact = 1;                 // n!
        while (nCluster >= 1) {
            nClusterFact *= nCluster;
            nCluster--;
        }

        int rSequenceFact = 1;                // r!
        while (rSequence >= 1) {
            rSequenceFact *= rSequence;
            rSequence--;
        }

        int fOutPut = nClusterFact / (rSequenceFact * DiffFact);      // n!/ r! * (n-r)!
        System.out.print("C(" + n + "," + r + ") = " + fOutPut);


    }
}