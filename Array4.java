/**
 * Created by USER on 04.01.2017.
 */
public class Array4 {
    public static void main(String[] args) {
        for (int m = 0; m <50 ; m++) {
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);

                }
            }
            System.out.println();
            for (int t = 0; t < 100; t++) {
                if (t % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);

                }
            }
            System.out.println();
        }
    }
}