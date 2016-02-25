public class StringMiscellaneous{
	
	public static void main(String[] args){
		String s1="hellow";
		char[] array =new char[5];
		
		System.out.println(s1);
		//length method of strings
		System.out.println("the length of \""+s1+"\" is "+s1.length() );
		
		System.out.print("the reverse of string is :  ");
		
		//looping through the characters of s1 with charAt to display reverse of string
		
		for(int i=s1.length()-1;i>=0;i--){
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		
		//copy the characters from string to array
		s1.getChars(0,5,array,0);
		System.out.println("Character array is :");
		
		for(char c: array){
			System.out.print(c);
		}
	}
}