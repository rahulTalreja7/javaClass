class NestTry{
	public static  void main(String[] args){
	
	try{
		int a=args.length;
		int b=19/a;
		
		System.out.println("a ="+a);
		try{	//nested try block
			if(a==1)
				a=a/(a-a);		//divide by zero
			if(a==2){
				int c[]={1};
				c[66]=23;		//will generate out of bounds exception
			}
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Index out of bounds :"+e);
		}
	
	}
	
	catch(ArithmeticException e){
		System.out.println("divide by zero :"+e);
	}
}
}