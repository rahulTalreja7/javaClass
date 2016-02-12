public class InfoTest{
	public static void main(String[] args){
		Machine m1=new Machine(69,"fuckingMachine");
		m1.showInfo();
		
		Info mInfo=new Machine(8,"bob the asshole");   // don't need to fucking care about the type of object or its data
		
		mInfo.showInfo();           // you can only call the interface defined method on this object
		
		
		Machine m2=new Machine(7,"dickHead");
		fuckYou(m2);      
	}
	
	private static void fuckYou(Info asshole){
		asshole.showInfo();							//you can only call methods which are defined in Info interface
	}
	
	 
    

}