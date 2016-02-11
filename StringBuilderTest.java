public class StringBuilderTest{
	
	public static void main(String[] args){
		String sen="";
		
		//inefficient way
		sen +="this is simple ";
		sen +="concatenation";
		System.out.println(sen);
		
		StringBuilder s=new StringBuilder("");
		s.append("this string is glued ")
		.append("through StringBuilder builtin class");
		
		System.out.println(s.toString());
		
		//2 decimal places , left aligned in 8 character field
		System.out.printf("number : %-8.2f \n",1.23455);
	}
}