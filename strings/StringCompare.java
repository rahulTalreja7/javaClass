// this program demonstrates the string comparison methods such as equals equalsIgnoreCase, compareTo and regionMatches
public class StringCompare{
	public static void main(String[] args){
		String s1=new String("hello");
		String s2= "goodbye";
		String s3="Happy Birthday";
		String s4="happy birthday";
		
		System.out.printf("%s\n %s\n %s\n %s\n ", s1,s2,s3,s4);
		
		//test for equality with equals
		if(s1.equals("hello"))
			System.out.println("s1 is equals to \"hello\"");
		
		else 
			System.out.println("s1 is NOT equals to \"hello\"");
		
		//test for equility with "=="
		if(s1=="hello")
			System.out.println("s1 is the same object as \"hello\"");
		else 
			System.out.println("s1 is the same object as \"hello\"");
		
		//compairing with ignore case
		if(s3.equalsIgnoreCase(s4))
			System.out.printf("%s and %s are equal with case ignore",s3,s4);
		else 
			System.out.println("s3 and s4 are not equal");
		
		//compairing with compareTo
		System.out.printf("s1 and s2 : %d\n",s1.compareTo(s2));
		System.out.printf("s2 and s1 : %d\n",s2.compareTo(s1));
		System.out.printf("s3 and s4 : %d\n",s3.compareTo(s4));
		System.out.printf("s4 and s3 : %d\n",s4.compareTo(s3));
		
		//test with regoinMatches 
		if(s3.regionMatches(0,s4,0,5))
			System.out.println("the first five characters of s3 and s4 are same");
		else 
			System.out.println("the first five characters of s3 and s4 are different ");
		
		//testing regionMatches with ignore cases
		if(s3.regionMatches(true,0,s4,0,5))
			System.out.println("the first five characters of s3 and s4 are same with ignore case");
		else 
			System.out.println("the first five characters of s3 and s4 are different ");
		
	}
}