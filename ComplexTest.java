class Complex{
	int real,imaginary;
	 public void display(){
		 System.out.println(real+"+"+imaginary+"i");
	 }
}

public class ComplexTest{
	public static void main(String[] args){
	Complex c1=new Complex();
	c1.real=5;
	c1.imaginary=2;
	c1.display();
	}
}