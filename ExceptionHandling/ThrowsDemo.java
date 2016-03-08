class ThrowsDemo{
	static void throwOne() throws IllegalAccessException{
		System.out.println("in throwOne");
		throw new IllegalAccessException("wannabe gangsta");
	}
	
	public static void main(String[] args){
		try{
			throwOne();
		}
		catch(IllegalAccessException e){
			System.out.println("caught "+e);
		}
	}
}