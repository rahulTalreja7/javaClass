//This program shows the simple DYNAMIC METHOD DISPATCH
//It shows java decides which class's method to execute at run time depending on object reference rather than type of class
class A{
	void callme(){
		System.out.println("in A's callme method");
	}
}

class B extends A {
	void callme(){
		System.out.println("in B's callme method");
	}
}

class C extends B{
	void callme(){
		System.out.println("in C's callme method");
	}
}



// Main Method's Class 

class Dispatch{
	public static void main(String[] args ){
	A a=new A();
	B b=new B();
	C c=new C();
	
	A r;
	
	r=a;
	r.callme();
	
	
	r=b;
	r.callme();
	
	r=c;
	r.callme();
	}
}


