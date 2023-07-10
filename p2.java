public class p2 {

    // public static void main(String[] args) {
    //     int a[][]={{1,2,3,4},{2,3},{4,5,6}};
    //     for(int i=0;i<a.length;i++){
    //         for(int  j=0;j<a[i].length;j++){
    //             System.out.print(a[i][j]);
    //         }
    //         System.out.println();
    //     }
    // }
    // class clac{
    //     public int add(int a[]){
    //         int reult=0;

    //         for(int n:a){
    //             reult=reult+n;

    //         }
    //         return reult;

    //     }
    // }
    // public static void main(String[] args) {
    //     int a[]={1,2,3,4,5};
        
    //     int reut=clac.add(a);
    //     System.out.println(reut);
    // }
    class clac{
        public int add(int a,int b){
            return a+b;

        }
    }
    public static void main(String args[]){
        clac obg = new clac();
        int c=obg.add(2,3);
        System.out.println(c);
    }
}
