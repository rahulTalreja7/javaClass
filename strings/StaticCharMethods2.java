//character class static conversion methods
import java.util.Scanner;
public class StaticCharMethods2{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		
		//getting base or radix 
		System.out.println("Enter the base");
		int base = input.nextInt();
		
		System.out.printf("%nEnter 1 to Convert digit to character%nEnter 2 to Convert character to digit%n");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:  	//convert digit to character
				System.out.println("Enter a digit");
				int digit=input.nextInt();
				System.out.printf("convert digit to character : %s%n",Character.forDigit(digit,base));
				break;
			case 2:
				System.out.println("Enter a character");
				char c=input.next().charAt(0);
				System.out.printf("Convert character to digit : %s%n",Character.digit(c,base));
				break;
		}
	}
}