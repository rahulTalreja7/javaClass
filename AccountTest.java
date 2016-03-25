
/*Write a java program in which you are required to define a class named Account. The
class must include the following two data members.
// data member for account holder’s name
1: accountHolder
//data member for amount in the account
2: amount
Your Program should define three constructors for the class Account
1: a constructor with no parameter
2: a constructor with two parameters (accountHolder, amount) 
3: a copy constructor
All of these three constructors are meant to initialize their respective objects. Incase
of copy constructor, you are required to assign a separate space for the data
members of the new object while copying the values of previously existed object.
Declare three objects (1 for each type of constructor) in main.
Write a function in class Account to display the initialized data members for each
object.
Also count and display the total count of objects in the start and end of main.
*/

class Account {
    String accountHolder;
	int amount;
	static int count=0;
	Account(){                          //constructor with no parameters
		this.accountHolder=null;
		this.amount=0;
		count++;
	}
	Account(String accountHolder, int amount){              //constructor with two parameters
		this.accountHolder=accountHolder;
		this.amount=amount;
		count++;
	}
	Account(Account a){									//copy constructor
		this.accountHolder=a.accountHolder;
		this.amount=a.amount;
		count++;
	}
	
	public void display(){
		System.out.println("Name:   " +accountHolder +"\nAmount:  "+amount );
		
	}
	static void displayCount(){				//displays the number of objects created
		System.out.println("Number of objects are  "+count );
	}
	}
	
public class AccountTest{
	public static void main(String[] args){
		Account a1=new Account();
		Account a2=new Account("Kurt Cobain",27);
		Account a3=new Account(a2);
		
		
		a1.display();
		a2.display();
		a3.display();
		Account.displayCount();
	}
}