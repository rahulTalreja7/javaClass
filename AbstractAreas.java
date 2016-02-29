//using abstract methods and classes
abstract class Figure{
	double dim1;
	double dim2;
	
	Figure(double a, double b){		//constructor
		dim1=a;
		dim2=b;
	}
	
	abstract double area();
	}

	//Rectangle Class
class Rectangle extends Figure{
	Rectangle (double a, double b){		//constructor
		super(a,b);						//invokes the constructor in parent with child's variables
	}
	
	double area(){
		System.out.println("In class Rectangle. Area of Rectangle");
		return dim1*dim2;
	}
}

class Triangle extends Figure{
	Triangle(double a, double b){
		super(a,b);
	}
	
	double area(){
		System.out.println("In class Triangle. Area of Triangle");
		return dim1* dim2/2;
	}
}


//  		MAIN METHOD'S CLASS
class AbstractAreas{
	public static void main(String[] args){
		//Figure f1=new Figure(10,10);	//this is illegal because you can't create a object of Abstract class
		Rectangle r1=new Rectangle(9,5);
		Triangle t1=new Triangle(10,8);
		Figure figref;		//this is ok because no object is created of abstract
		
		figref =r1;
		System.out.println("Area is "+ figref.area());
		
		figref =t1;
		System.out.println("Area is "+ figref.area());
	}
	
}