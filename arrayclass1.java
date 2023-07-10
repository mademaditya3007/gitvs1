class clac{
    public int add(int a[]){
        int reult=0;
        for(int n:a){
            reult=reult+n;

        }
        return reult;
    }
}
public class arrayclass1 {
    public static void main(String[] args) {
        int b[]={1,2,34};
        clac obj=new clac();
        System.out.println(obj.add(b));
    }
}
