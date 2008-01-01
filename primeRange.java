public class primeRange {
   public static void main (String [] args)
    {
       boolean isPrime;
      
      int num=Integer.parseInt(args[0]);
       System.out.println("you have entered "+ num);
       for (int i=2;i<num;i++){
            isPrime=true;
           if(num%i==0){
               isPrime=false;
               
           }
           if(isPrime){
               
               System.out.println(i);
           }
           

       
       
           
       
       
           
       
     }
     }
         
     }
