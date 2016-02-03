public class isPrime {
   public static void main (String [] args)
    {
       boolean isPrime=true;
      int num=Integer.parseInt(args[0]);
       System.out.println("you have entered "+ num);
       for (int i=2;i<num/2;i++){
           if(num%i==0){
               isPrime=false;
           }

       }
       if(isPrime)
           System.out.println("number is prime");
       else
           System.out.println("not a prime number");
       
           
       
     }
         
     }
