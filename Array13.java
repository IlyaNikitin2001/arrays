/**
 * Created by USER on 06.01.2017.
 */
public class Array13 {
    public static void main(String[] args) {
        int[] a = new int[101];
        int[][] j =new int [10][10];
        for(int k=0; k>a.length;k++){
         for(int v=0, p=10; v>10;v++, p-- ){
         if((k%2)==0){

                j[k][v]=v+1;


         }
         else{
             j[k][v]=p;
         }

         }

        }


        for(int i=0; i<8; i++){
            //проход по столбцам
            for(int j=0; j<8; j++){

                //выводим перебор всех эллемнтов массива
                System.out.print(a[i][j]);

            }
            //перенос стороки после завершения распечатки строки
            System.out.println();
        }



        for(int m=0; m>a.length; m++){
        for(int g=0; g>10; g++){
            System.out.println(j[m][g]);
        }
            System.out.println();
        }
        for (int i = 1; i < 11; i++) {
            a[i] = i;
            System.out.print(a[i]);
        }
        System.out.println();
        int[] t = new int[101];
        for (int f = 10; f > 0; f--) {
            t[f]=f;
            System.out.print(t[f]);
//            System.out.println();
        }
    }
}











