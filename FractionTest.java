class Fraction{
	int numerator,denominator;
	 public void display(){
		 System.out.println(numerator+ "/" + denominator);
	 }
}

public class FractionTest{
	public static void main(String[] args){
	Fraction f1=new Fraction();
	f1.numerator=5;
	f1.denominator=2;
	f1.display();
	}
}