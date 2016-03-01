public class StringBuilderInsertDelete
{
	public static void main(String[] args){
		Object objectRef="douchebag";
		String string="fuck";
		char[] charArray= {'f','u','c','k','y','o','u'};
		boolean booleanValue=true;
		char charCharacter='N';
		int integerValue=23;
		long longValue=10000000;
		float floatValue=23.5f;
		double doubleValue=77.7777;
		
		StringBuilder sb = new StringBuilder();
		sb.insert(0,objectRef);
		sb.insert(0," ");
		sb.insert(0,string);
		sb.insert(0," ");
		sb.insert(0,charArray);
		sb.insert(0," ");
		sb.insert(0,booleanValue);
	sb.insert(0," ");	
		sb.insert(0,integerValue);
		sb.insert(0," ");
		sb.insert(0,longValue);
		sb.insert(0," ");
		sb.insert(0,floatValue);
		sb.insert(0," ");
		sb.insert(0,doubleValue);
		sb.insert(0," ");
		
		System.out.printf("sb after inserting :%n %s %n ",sb.toString());
		sb.deleteCharAt(12);
		System.out.printf("after deleting charAt 12th index: :%n %s %n ",sb.toString());
		sb.delete(2,6);
		System.out.printf("sb after deleting substring from 2 to but not including 6 :%n %s %n ",sb.toString());
		
	}
}