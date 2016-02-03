public class factorial {
   public static void main (String [] args)
    {
      int limit=Integer.parseInt(args[0]);
       System.out.println("you have entered "+ limit);
       int fact=1;
       for(int i=1;i<=limit;i++){
           fact=fact*i;
       }
       System.out.println(fact);
       }
         
     }
