public class fabonacii {
   public static void main (String [] args)
    {
      System.out.println("printing the fabonacii numbers from 1 to 100");
       int first=1;
       int second=1;
       System.out.print("1,"+"1,");
       for (int i=1;i<100;i++){
           int sum=first+second;
       System.out.print(sum+",");
         first=second;
           second=sum;
       }
         
     }
}