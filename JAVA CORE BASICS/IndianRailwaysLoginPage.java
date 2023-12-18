package core_Java;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class IndianRailwaysLoginPage 
{
    JFrame frame;
	JLabel lmain,luname,lpass;
	JTextField tfuname;
	JPasswordField tfpass;
	JButton  btnforgotpassword,btnlogin;
        
	 public IndianRailwaysLoginPage()
	 {
		 frame = new JFrame();
		 
		 lmain = new JLabel("WELCOME TO THE LOGIN PAGE OF INDIAN RAILWAYS");
		 lmain.setFont(new Font("STZhongsong", Font.BOLD, 17));
		 lmain.setBounds(10, 10, 515, 56);
		 
		 luname = new JLabel("Username");
		 luname.setFont(new Font("STZhongsong", Font.BOLD, 18));
		 luname.setBounds(53, 92, 113, 28);
		 
		 lpass =  new JLabel("Password");
		 lpass.setFont(new Font("STZhongsong", Font.BOLD, 18));
		 lpass.setBounds(53, 137, 97, 28);
		 
		 btnforgotpassword =  new JButton ("Forgot Password?");
		 btnforgotpassword.setHorizontalAlignment(SwingConstants.LEFT);
		 btnforgotpassword.setVerticalAlignment(SwingConstants.TOP);
		 btnforgotpassword.setFont(new Font("STZhongsong", Font.BOLD, 16));
		 btnforgotpassword.setBounds(196, 194, 177, 33);
		 
		 btnlogin = new JButton("Login");
		 btnlogin.setFont(new Font("STZhongsong", Font.BOLD, 18));
		 btnlogin.setBounds(135, 235, 107, 28);
		 
		 tfuname = new JTextField();
		 tfuname.setBounds(197, 93, 113, 28);
		 
		 tfpass =  new JPasswordField();
		 tfpass.setBounds(197, 141, 113, 28);
		 
		 frame.add(lmain);
		 frame.add(luname);
		 frame.add(lpass);
		 frame.add(tfuname);
		 frame.add(tfpass);
		 frame.add(btnforgotpassword);
		 frame.add(btnlogin);
		 frame.setSize(500, 500);
		 frame.setLayout(null);
		 frame.setVisible(true);
	 }
	 public static void main(String[] args) {
		new IndianRailwaysLoginPage();
	}
}
