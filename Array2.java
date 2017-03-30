/**
 * Created by USER on 04.01.2017.
 */
public class Array2  {
    public static void main(String[] args){
        int[] a= new int[10];
        for(int i=0; i<5; i++ ){
        a[i]=i+1;
        }
       // int m=5;

       for(int t=5,  m=5; t<=9; t++, m--){
           a[t]=m;
          // m--;
       }

        for (int k=0; k<a.length; k++){
            System.out.println(a[k]);
        }

    }
}
