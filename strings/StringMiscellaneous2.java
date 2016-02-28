public class StringMiscellaneous2{
	public static void main(String[] args){
		String s1="hello";
		String s2="GOODBYE";
		String s3=" spaces ";
		
		//replace method
		System.out.printf("Replacing 'l' with 'L' in s1 %s %n",s1.replace('l','L'));
		
		//toLowerCase toUpperCase methods
		System.out.printf("s1.toUpperCase is = %s %n",s1.toUpperCase());
		System.out.printf("s2.toLowerCase is = %s %n",s2.toLowerCase());
		
		//trim method
		System.out.printf("s3 after trim =  %s%n",s3.trim());
		
		//converting string to char array with charArray method
		char[] charArray=s1.toCharArray();
		System.out.println("character array of s1 contains :");
		
		for(char c:charArray){
			System.out.print(c);
		}
		System.out.println();
	}
}