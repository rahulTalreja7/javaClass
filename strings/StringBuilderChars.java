//String Builder methods charAt, setCharAt, getChars and reverse

public class StringBuilderChars{
	public static void main(String[] args){
		StringBuilder sb =new StringBuilder("fuck you");
		
		System.out.printf("sb = %s %n",sb.toString());
		System.out.printf("character at 3 = %s%n character at 5=%s%n",sb.charAt(3),sb.charAt(5));
		
		char[] charArray = new char[sb.length()];
		sb.getChars(0,sb.length(),charArray,0);   //getting elements from sb and putting in charArray
		
		System.out.print("Characters in charArray are :");
		//displaying charArray
		for(char c:charArray){
			System.out.print(c);
		}
		System.out.println();
		
		sb.setCharAt(0,'F');
		sb.setCharAt(5,'Y');
		
		System.out.println("sb = "+sb.toString());
		
		sb.reverse();
		System.out.println("sb = "+sb.toString());
	}
}