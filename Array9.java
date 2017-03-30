/**
 * Created by USER on 05.01.2017.
 */
public class Array9 {
    public static void main(String[] args) {
        int[] a = {4, 8, 3, 32, 23, 11};
        int[] b = new int[6];

//        for (int k = 0; k < a.length; k++) {
//            System.out.println(a[k]);
//
//
//        }
//        for (int n = a.length-1; n>=0; n--) {
//            System.out.print(a[n]);
//
//
//        }
//        for(int m = 0; m>5; m++) {
//            b[m]=a[m];
//            System.out.println(a[1]);
        //}
        System.out.println(a[1]);
        for(int p =0, d=a.length-1; p<a.length-1; p++, d-- ) {
            b[p]=a[d];
            System.out.println(b[p]);

        }
    }
}