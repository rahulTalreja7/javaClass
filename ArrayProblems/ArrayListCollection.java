import java.util.ArrayList;

public class ArrayListCollection{
	public static void main (String[] args){
		ArrayList<String> items=new ArrayList<String>();
		
		items.add("red");
		items.add(0,"yellow"); // add yellow at index 0 of array list
		
		//header 
		System.out.print("Displaying the content of ArrayList with counter-controlled loop: ");
		
		//displays the content in array list
		for(int i=0;i<items.size();i++){
			System.out.printf("%s",items.get(i));
		}	
			display(items,"\n Display list contents with enhanced for statement: ");
			
		items.add("green");
		items.add("yellow");
		
		items.remove("yellow"); //remove the first yellow
		display(items,"Remove first yellow in the list");
		
		items.remove(1); //remove item at index 1
		display(items,"Remove the second element (which is green): ");
		
	System.out.printf(" \"red\" is %s in the list\n  ",items.contains("red")?"" : "not");
	
	System.out.printf("Size: %s \n ",items.size()); //gives the size of arraylist items
	} //end main
		
	    // displays the ArrayList's content with enhanced for loop
		public static void display(ArrayList<String> items,String header){
			System.out.print(header); //display header
			for (String item :items){
				System.out.printf("  %s",item);
			}
				System.out.println();
			
		}
	}
