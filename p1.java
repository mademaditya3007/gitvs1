import java.util.*;
import java.util.function.DoubleToIntFunction;
public class p1 {
    public static void main(String[] args) {
        // int a[]=new int [4];
        // a[1]=23;
        // a[0]=12;
        // a[3]=45;

        // for(int i=0;i<4;i++){
        //     System.out.println(a[i]);
        // }
            int a[]={1,2,3,44,5};
            // for(int i=0;i<a.length;i++){
            //     System.out.println(a[i]);

            // }
                for(int b:a){
                    System.out.println(b);
                }
                System.out.println();
                int c[][]={{1 ,2},{3 ,4}};
                for(int i=0;i<2;i++){
                    for(int j=0;j<2;j++){
                        System.out.print(c[i][j]+" ");
                    }
                    System.out.println();
                }
                for(int kl[]:c){
                    for(int kj:kl){
                        System.out.print(kj+" ");
                    }
                    System.out.println();
                }
    }  
}
