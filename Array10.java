/**
 * Created by USER on 05.01.2017.
 */
public class Array10 {
    public static void main(String[] args) {
        int[] a = new int[8];
        for (int l = 0; l < 4; l++) {
            for (int i = 0; i < a.length; i++) {
                if ((i % 2) == 0) {
                    a[i] = 1;


                } else {
                    a[i] = 0;
                }
            }
            for (int k = 0; k < a.length; k++) {
                System.out.print(a[k]);

            }
            int[] b = new int[8];
            for (int m = 0; m < b.length; m++) {
                if ((m % 2) == 0) {
                    b[m] = 0;
                } else {
                    b[m] = 1;

                }


            }
            System.out.println();
            for (int n = 0; n < b.length; n++) {
                System.out.print(b[n]);
            }



        }
    }
}