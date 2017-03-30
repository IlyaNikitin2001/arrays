/**
 * Created by USER on 05.01.2017.
 */
public class Array12 {
    public static void main(String[] args) {
        System.out.println();
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int l = 0; l < 10; l++) {
                if ((i % 2) == 0) {
//                    if ((i % 2) == 0) {
//                     a[i][l]=1;
//                    }else{
//                        a[i][l]=0;
//                    }
                    if((l%2)==0){
                        a[i][l]=1;
                    }
                    else{
                        a[i][l]=0;
                    }
                }
                else{

                    if((l%2)==0){
                        a[i][l]=0;
                    }
                    else{
                        a[i][l]=1;
                    }
                }

            }
        }
            for(int k=0; k<10; k++){
            for(int b=0; b<10; b++){
                System.out.print(a[k][b]);

            }
                System.out.println();
            }

    }
}