class ThrowDemo{
	static void demoproc(){
		try{
			throw new NullPointerException("fuckOff!");
		}
		catch(NullPointerException e){
			System.out.println("caught inside demoproc");
			throw e;	//rethrow the exception
		}
		
	}
	//Main Method
public static void main(String[] args){
	try{
	demoproc();
	}
	catch(NullPointerException e){
			System.out.println("Recaught inside main : "+ e);
	}
}

}