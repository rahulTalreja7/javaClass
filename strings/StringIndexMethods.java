public class StringIndexMethods{
	public static void main(String[] args){
		String letters = "abcdefghijklmabcdefghijklm";
		//testing indexOf method
		System.out.printf("a is located at %d%n",letters.indexOf('a'));
		System.out.printf("a (after index 1) is located at %d%n",letters.indexOf('a',1));
		System.out.printf("$ is located at %d%n",letters.indexOf('$'));
		
		//testing last indexOf method
		System.out.printf("last index of c is %d%n",letters.lastIndexOf('c'));
		System.out.printf("last index of a is %d%n",letters.lastIndexOf('a',25));
		
		//testing lastIndexOf with substring
		System.out.printf("last index of def is %d%n",letters.lastIndexOf("def"));
		System.out.printf("last index of a is %d%n",letters.lastIndexOf("a",25));
		
		//testing indexOf with substring 
		System.out.printf("def is located at %d%n",letters.indexOf("def"));
		System.out.printf("def is located at %d%n",letters.indexOf("def",7));
		
	}
}