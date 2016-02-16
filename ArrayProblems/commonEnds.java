/********OBJECTIVE
	Given 2 arrays of ints, a and b, return true if they have the
	same first element or they have the same last element. 
	Both arrays will be length 1 or more. 
*/

public class commonEnds{
	public static void main(String args[]){
	int[] array1={2,3,7,8};
	int[] array2={1,4,9,8};
	
	int[] array3={2,3,4,5};
	int[] array4={6,7,8,9};
	
	System.out.println(commonEnd(array1,array2));
	System.out.println(commonEnd(array3,array4));
	}
	public static boolean commonEnd(int[] a, int[] b) {
		// (checks if fist elements are equal OR last elements are equal)  AND length of both array are greater than or equal 1   
  return (a[0]==b[0] || a[a.length-1]==b[b.length-1])  && (a.length>=1 && b.length>=1);  
}
}