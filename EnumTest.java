import java.util.EnumSet;
enum Book{
	//constants of enum type 
	
	JHTP("Java How to Program","2015"), 
	CHTP("C How to Program", "2013"), 
	IW3HTP("Internet & World Wide Web How to Program", "2012"),
	CPPHTP("C++ How to Program", "2014"), 
	VBHTP("Visual Basic How to Program", "2014"), 
	CSHARPHTP("Visual C# How to Program", "2014");
		
		//instance fields
		private final String title;
		private final String copyrightYear;

		//enum constructor
		Book (String title,String copyrightYear){
			this.title=title;
			this.copyrightYear=copyrightYear;
		}
		
		public String getTitle(){
			return title;
		}
		public String getCopyrightYear(){
			return copyrightYear;
		}
	
}

public class EnumTest{
	public static void main (String[] args){
		System.out.println("All books:");
		//print all the books in enum Book
		for(Book book: Book.values()){
			System.out.printf("%-5s %-10s %-5s\n",book,book.getTitle(),book.getCopyrightYear());
		}
		// print first four books 
	for(Book book :EnumSet.range(Book.JHTP,Book.CPPHTP)  )
		System.out.printf("%-10s%-45s%s%n", book,book.getTitle() ,book.getCopyrightYear()  );
}
}