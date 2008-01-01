import javax.swing.JOptionPane;

public class dialog1{

	public static void main(String args[]){
	
     int num=Integer.parseInt(JOptionPane.showInputDialog("enter a number "));
     int num2=Integer.parseInt(JOptionPane.showInputDialog("enter another number "));
	String message=String.format("sum of  %d and %d is %d ",num,num2,num+num2);
    JOptionPane.showMessageDialog(null,message);

	}

}