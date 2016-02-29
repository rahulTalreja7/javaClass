public class StringValueOf{
	public static void main(String[] args){
		char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
		boolean booleanValue=true;
		char characterValue= 'N';
		long longValue = 10000000000L;
		float floatValue=3.9f;
		double doubleValue=33.333;
		Object objectRef="hello";

		System.out.printf("char Array = %s %n ",String.valueOf(charArray));
		System.out.printf("part of charArray = %s %n ",String.valueOf(charArray,3,3));      //starting from 3rd index  and including 3 characters 
		System.out.printf("booleanValue = %s %n",String.valueOf(booleanValue));
		System.out.printf("characterValue %s %n",String.valueOf(characterValue));
		System.out.printf("floatValue = %s %n",String.valueOf(floatValue));
		System.out.printf("doubleValue = %s %n",String.valueOf(doubleValue));
		System.out.printf("objectRef = %s %n ",String.valueOf(objectRef));
	}
}