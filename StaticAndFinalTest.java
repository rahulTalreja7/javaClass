class StaticAndFinal{
 public final static int LUCKY=7;	//this is costant throughout the program
 public String name;
 public static String description;
 public static int count=0;
 public int id;
 
 
 public StaticAndFinal(){	//constructor
	id=count;
	count++;				//new id is assigned to every object
 }
 
 public void showInfo(){
	 System.out.println(id+"	"+name);
	 // this won't work : System.out.println(description);
 }
 
 

}

public class StaticAndFinalTest{
	public static void main (String[] args){
		
		StaticAndFinal.description="Hello i am static variable i don't fucking need any object to execute";
		System.out.println(StaticAndFinal.description);
		StaticAndFinal obj1= new StaticAndFinal();
		obj1.name="bilal";
		obj1.showInfo();
		
		StaticAndFinal obj2= new StaticAndFinal();
		obj2.name="AliHaider";
		obj2.showInfo();
		
		System.out.println("this is constant throught the program :"+StaticAndFinal.LUCKY);
	}
}