/*
Asal sayı bulan program
Asal sayılar, 1 ve kendisi dışında başka hiçbir pozitif sayıya tam bölünemezler.
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdır

Senaryo ;
Örneğin 5,10 sayıları için ;
iAsalControl = true başta asal kabul ettim.
Kontrol edilen değer kendinden önceki değerlerden herhangi birine tam bölünürse  iAsalControl = false set et ve asal olmadığını belirt
değilse zaten asaldır.

 */

public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {   // Ne kadar döneceğimizi bildiğimiz için for kullandık ve en küçük asal sayıdan başladık.
            boolean iAsalControl = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    iAsalControl = false;
                    break;
                }
            }
            if (iAsalControl) {
                System.out.println(i);
            }
        }
    }
}