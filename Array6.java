/**
 * Created by USER on 04.01.2017.
 */
public class Array6 {
    public static void main(String[] args) {
        int[] a = new int[101];
        for (int i = 2; i < 51; i = i + 2) {
            a[i] = i;

            System.out.println(a[i]);
        }
        int[] p = new int[101];
        for (int n = 51; n < 100; n = n + 2) {
            p[n] = n;
            System.out.println(p[n]);


        }
    }
}