class MultipleCatches{
	public static void main(String[] args){
		try{
			int a=args.length;
			System.out.println("a ="+a);
			int b=42/a;
			int c[] ={1};
			c[33]=87;
		}
		catch(ArithmeticException e){
			System.out.print("Divide by zero "+ e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bounds : "+e);
		}
		
		System.out.println("After try catch block");
	}
}