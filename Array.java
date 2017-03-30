/**
 * Created by USER on 03.01.2017.
 */public class Array {
    public static void main(String[] args) {
    int[]a={10,5,100,7};
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
    int [] b = new int[10];
        for(int j=0; j<10; j++){
            b[j]=j;
            System.out.print(b[j]);

        }
        int [] c = new int[10];
        for(int k=9; k>=0; k--){

          c[k]=(k+1)*10;

            System.out.println(c[k]);
        }
    }
}

