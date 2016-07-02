import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

	private JTextArea textArea;
	private JButton btn;
	public MainFrame(){
		super("hello World");
		setLayout(new BorderLayout());
		textArea= new JTextArea();
		btn=new JButton("Click Me!");
		
		add(textArea,BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		
		setSize(500,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}
