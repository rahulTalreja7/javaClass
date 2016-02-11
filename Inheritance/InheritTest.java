public class InheritTest{
	
	public static void main(String[] args){
		
		Machine m1= new Machine();
		m1.showinfo();
		m1.whereIam();
		
		Car c1=new Car();
		c1.showinfo();
		c1.whereIam();
		c1.wipeWindShield();
	}
}