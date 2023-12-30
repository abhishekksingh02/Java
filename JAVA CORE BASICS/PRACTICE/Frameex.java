package core_Java;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frameex {
	
	JFrame frame;
	JButton btn;
	
	public Frameex()
	{
		 frame = new JFrame();
		 
		 btn = new JButton("Submit");
		 btn.setBounds(200, 50, 100, 50);
		 
		 frame.add(btn);
		 
		 frame.setSize(500, 500);
		 frame.setLayout(null);
		 frame.setVisible(true);
		
	}
	
       public static void main(String[] args)
       {
		  new Frameex();
	   }
}
