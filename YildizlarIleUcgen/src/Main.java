/*
              n = 9 ;  i  j  k
     *                 1  4  1
    ***                2  3  3
   *****               3  2  5
  *******              4  1  7
 *********             5  0  9
  *******              6  1  7
   *****               7  2  5
    ***                8  3  3
     *                 9  4  1

 */


public class Main {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {

            if (1 <= i && i <= 5) {                        // elmasın üst kısmı
                for (int j = 1; j <= 5 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i) - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            if (5 <= i && i <= 9) {                       // elmasın alt kısmı

                for (int j = 0; j <= i - 5; j++) {
                    System.out.print(" ");
                }
                for (int k = 2; k <= 2 * (n - i); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}