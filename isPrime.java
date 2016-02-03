public class isPrime {
   public static void main (String [] args)
    {
      int num=Integer.parseInt(args[0]);
       System.out.println("you have entered "+ num);
       for (int i=2;i<num;i++){
           if(num%i==0){
               System.out.println(args[0]+" is not a prime number");
               break;
           }
           else{
               System.out.println(args[0]+" is a prime number");
               break;
           }
           
       }
     }
         
     }
