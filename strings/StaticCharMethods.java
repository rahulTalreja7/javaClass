import java.util.Scanner;
public class StaticCharMethods{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a character and press enter:");
		String input= in.next();
		char c=input.charAt(0);
		
		//information of the character
		System.out.printf("%nIsDefined = %b%n ",Character.isDefined(c));
		System.out.printf("IsDigit = %b%n",Character.isDigit(c));
		System.out.printf("isJavaIdentifierStart = %b%n",Character.isJavaIdentifierStart(c));
		System.out.printf("isJavaIdentifierPart = %b%n",Character.isJavaIdentifierPart(c));
		System.out.printf("isLetter = %b%n",Character.isLetter(c));
		System.out.printf("isLetterOrDigit = %b%n",Character.isLetterOrDigit(c));
		System.out.printf("isLowerCase = %b%n",Character.isLowerCase(c));
		System.out.printf("isUpperCase = %b%n",Character.isUpperCase(c));
		System.out.printf("toLower case = %s%n",Character.toLowerCase(c));
		System.out.printf("toUpperCase = %s%n",Character.toUpperCase(c));
	}
}
