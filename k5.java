public class k5 {
    public static void main(String args[]){
        int age =19;
        if(age>=18 && age<=60){
            System.out.println("eligible");
            if(age==19){
                System.out.println("medain age");
            }
        }else if(age>=60){
            System.out.println("old");
        }else{
            System.out.println("kid");
        }
    }
}
