//String builder length,setLength,capacity and ensureCapacity methods
public class StringBuilderCapLen{
	public static void main(String[] args){
	StringBuilder sb= new StringBuilder("hello there if you are reading this then fuck off! ");
	
	System.out.printf("sb = %s%n length = %s%n capacity = %s%n" ,sb.toString(),sb.length(),sb.capacity());
	sb.ensureCapacity(77);
	System.out.printf("New Capacity = %s %n",sb.capacity());		//double the capacity plus 2
	sb.setLength(12);
	System.out.printf("New Length = %s %n",sb.length());
	System.out.printf("sb (after reudcing length) =%s %n",sb); //here sb call toString method behind the ass!
	
	}
}