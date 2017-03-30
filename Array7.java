/**
 * Created by USER on 05.01.2017.
 */
public class Array7 {
    public static void main(String[] args) {
        int[] a = new int[11];
        for (int j = 0; j < 5; j++) {
            for (int i = 0, k = 11; i < a.length; i++, k++) {
                a[i] = k;
                System.out.print(a[i]);


            }
            System.out.println();
            for (int k = 10; k >= 0; k--) {
//            a[k]=k;
                System.out.print(a[k]);


            }
            System.out.println();
        }
    }
}
