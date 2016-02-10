class Length{
	int feet,inches;
	 public void display(){
		 System.out.println(feet + "'"+inches+"'");
	 }
}

public class LengthTest{
	public static void main(String[] args){
	Length l1=new Length();
	l1.feet=6;
	l1.inches=2;
	l1.display();
	}
}