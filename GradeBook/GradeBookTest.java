 class GradeBook{
	private String courseName;
	private int[] grades;
	
	public GradeBook(String courseName,int[] grades){		//constructor
		this.courseName=courseName;
		this.grades=grades;
	}
	
	//set the course name
	public void setCourseName(String courseName){
		this.courseName=courseName;
	}
	
	//get the course name
	public String getCourseName(){
		return courseName;
	}
	
	//calculates various things for data 
	public void processGrades(){
		//output grade array
		outputGrades();
		
		//returns the class's average
		System.out.printf("%nclass average is : %.2f%n",getAverage());
		
		//call methods getMinimum and getMaximum
		System.out.printf("%nLowest Grade is %d %n Highest Grade is %d %n%n",getMinimum(),getMaximum());
		
		//outputs the bar chart of grade frequency
		outputBarChart();
	}
	
	//get the minimum grade from grades array
	public int getMinimum(){
		int low=grades[0];                  //suppose first grade is the lowest
		
		for(int i:grades){
			if( i<low)						//if any grade is lower than existing low the make it low
				low=i;
		}
		return low;
	}
	
	//get the maximum grade from grades array
	public int getMaximum(){
		int high=grades[0];				//suppose first grade is high
		
		for(int i:grades){
			if( i>high)
				high=i;					//if any grade is greater than existing high then make it high
		}
		return high;
	}
	
	//returns the average of the class
	public double getAverage(){
		int total=0;
		
		for(int i:grades){
			total+=i;
		}
		return ((double)total)/grades.length;
	}
	
	//shows the freqency bar char of the grades
	public void outputBarChart(){
		System.out.printf("Grade Distribution %n%n");
		int[] frequency=new int[11];
		
		for(int i:grades ){
			++frequency[i/10];
		}
		for(int count=0;count<frequency.length;count++){
			if (count==0)
				System.out.printf("%5d%n",100);
			else
				System.out.printf("%02d -  %02d : ",count*10,count*10+9);
			
			 

			for(int stars=0;stars<frequency[count];stars++){
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}
	
	//outputs the grade of every student
	public void outputGrades(){
		System.out.printf("Grades are %n %n");
		for(int student=0;student<grades.length;student++){
			System.out.printf("%n%nstudent[%2d]  grades[%3d]%n",student+1,grades[student]);
		}
	}
	
	
	
	}
	
	
	
	public class GradeBookTest{
		public static void main(String[] args){
			int[] gradesArray={89,90,97,59,60,42,50,56,29,50};
			GradeBook g1=new GradeBook("Object Oriented Programming ",gradesArray);
			System.out.printf("%n Welcome to the Grade Book for  %n %n %s",g1.getCourseName());
			g1.processGrades();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	