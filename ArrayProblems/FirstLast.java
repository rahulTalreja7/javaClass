/********OBJECTIVE
	Given an array of ints, return true if the array is length 1 or more, 
	and the first element and the last element are equal. 
*/

public class FirstLast{
	public static void main(String args[]){
	int[] array1={2,3,4,5,6,2};
	int[] array2={2,3,4,1};
	
	System.out.println(sameFirstLast(array1));
	System.out.println(sameFirstLast(array2));
	}
	public static boolean sameFirstLast(int[] nums){
	return nums.length>=1  && nums[0]==nums[nums.length-1];			//return true if length is 1 or greater AND first element and last element of array is same
	}
}