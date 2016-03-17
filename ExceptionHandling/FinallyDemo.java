class FinallyDemo{
	static void procA(){
		try{
			System.out.println("In procA's try");
			throw new RuntimeException("runnin");
		}
		finally{
			System.out.println("In procA's finally");
		}
	}
	
	//return from within a try block
	static void procB(){
		try{		
			System.out.println("In procB's try");
			return;
		}
		finally{
			System.out.println("In procC's finally");
		}
	}
	
	static void procC(){
		try{
			System.out.println("In procC's try");
		}
		finally{
			System.out.println("In procC's finally");
		}
	}
	
	
	public static void main(String[] args){
		try{
			procA();
		}
		catch(Exception e){
			System.out.println("exception caught");
		}
		
		procB();
		procC();
	}
	
}