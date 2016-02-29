import java.util.Arrays;
 class ArrayManipulatoins{

	public static void main(String[] args){
		double[] doubleArray={2.0,3.2,1.8,5.3,4.7};
		Arrays.sort(doubleArray);
		System.out.printf("\ndouble Array:");
		
		for(double value:doubleArray){
			System.out.printf("%.1f",value);
		}
		
		int[] filledIntArray= new int[10];
		Arrays.fill(filledIntArray,7);
		displayArray(filledIntArray,"filledIntArray: ");
		
		int[] intArray={1,2,3,4,5,6};
		int[] intArrayCopy=new int[intArray.length];
		
		System.arraycopy(intArray,0,intArrayCopy,0,intArray.length);
		displayArray(intArrayCopy,"intArrayCopy");
		
		boolean b=Arrays.equals(intArray,intArrayCopy);
		System.out.printf("\n\n intArray %s intArrayCopy\n",(b ? "==" : "!="));
		
		//search array for the val of 5 
		int location=Arrays.binarySearch(intArray,5);
		
		if(location>=0){
			System.out.printf("find 5 at index %d\n",location);
		}
		else 
			System.out.printf("element not found in intArray");
		
	} //end main
	public static void displayArray(int[] array,String description){
		System.out.printf("\n%s:", description);
		
		for(int value:array){
			System.out.printf("%d",value);
			
		}
	}
}
