class Frog {
	private int id;
	private String name;
	
	public Frog(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString(){
		return String.format("%-4d  :  %s",id,name);
	}
}



public class FrogTest{
	public static void main (String[] args){
		Frog f1=new Frog(7,"Francklin");
		System.out.println(f1); 	//it calls the toString method to display
		Frog f2=new Frog(69,"Fuck you");
		System.out.println(f2); 	// it also calls the toString method to display
		
	}
}