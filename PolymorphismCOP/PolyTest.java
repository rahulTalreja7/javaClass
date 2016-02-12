public class PolyTest{
	
	public static void main(String[] args){
		Plant p1=new Plant();
		Tree t1=new Tree();
	
		
		//polymorphism
		//Plant type p2 is referring to the tree object
		Plant p2=t1;
		p2.grow();               //this will outputs grow method of tree not plant because plant is referring to tree refrence.
								 //this is only case of overridden methods
		
		//p2.leaves();             //this will throw an error becuase when the method
						           //is not overridden then the type specifies the access of method and
								   //here type is Plant so you can't access individual tree methods
								   				
		doGrow(t1);      // you can use child name where the parent name is expected 
		
	}
	
	private static void doGrow(Plant redwood){
		redwood.grow();
	}
}