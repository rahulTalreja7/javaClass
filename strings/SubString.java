public class SubString{
public static void main(String[] args){
	String letters = "abcdefghijklmabcdefghijklm";
	System.out.printf("substring from index 20 to end is \"%s\" %n",letters.substring(20));
	System.out.printf("substring from index 3 to but not including 6 is \"%s\" %n",letters.substring(3,6));

}
}