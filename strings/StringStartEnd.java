public class StringStartEnd{
	public static void main (String[] args){
		String[] strings= {"started","starting","ended","ending"};
		
		//testing startsWith method
		for(String s: strings){
			if(s.startsWith("st"))
				System.out.printf("%s starts with \"st\"  %n",s);
		}
		
		System.out.println();
		//testing startsWith with starting from positoin 2 of string
		for(String s: strings){
			if(s.startsWith("art",2))
				System.out.printf("%s starts with \"art\" from positoin 2%n",s);
		}
		
		System.out.println();
		//testing endsWith method
		for(String s: strings){
			if(s.endsWith("ed"))
				System.out.printf("%s ends with \"ed\"  %n",s);
		}
	}
}