

class calc{
    public int add(int n1,int n2,int n3){
        return (n1+n2+n3);
        
       }
       public int add(int n1,int n2){
           return (n1+n2);
           
       }
   }
   public class c1{
       public static void main(String[] args) {
           calc nus=new calc();
       int result =nus.add(3,4);
       System.out.println(result);

   }
}