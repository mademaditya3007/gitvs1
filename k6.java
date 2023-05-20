public class k6 {
    public static void main(String args[]){
        int a=10;
        int b=20;
        int c=30;
        int reult=(a>b)?a:b;
        System.out.println(reult);
        int result=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("the biggest number is "+result);

    }
}
