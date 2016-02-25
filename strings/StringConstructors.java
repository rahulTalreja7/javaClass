public class StringConstructors{
	public static void main(String[] args){
		char[] charArray={'f','u','c','k', ' ' , 'y', 'o', 'u'};
		String s = new String("hello");
		
		//using String Constructors
		String s1= new String();
		String s2=new String(s);
		String s3=new String (charArray);
		String s4=new String (charArray,5,3);
		
		System.out.printf("%s \n  %s \n %s \n %s \n",s1,s2,s3,s4);
	}
}