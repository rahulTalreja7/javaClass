import java.util.Scanner;
class classAverage{

    public static void main(String args[]){
        int counter =1;
        int total = 0;
        Scanner input= new Scanner(System.in);
        while(counter<=10){
            int grade=input.nextInt();
            if(grade>100){
                System.out.println("numbers should be out of 100");
                grade = input.nextInt();
            }
            total+=grade;
            counter+=1;
        }
        int avg=total/10;
        System.out.printf("total marks of %d students is %d and the average of class is %d",10,total,avg);
    }

}