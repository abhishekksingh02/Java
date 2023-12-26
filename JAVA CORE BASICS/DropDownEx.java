package core_Java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DropDownEx {
        JFrame frame;
         String city[]= {"Rajkot" , "Ahmedabad" , "Gandhinagar" , "Surat"};
         JLabel label, label2;
         JComboBox cb;
         JButton btn;
         JPanel jp;
         
           public DropDownEx() 
           {
        	      frame = new JFrame();
        	      
        	      cb = new JComboBox<>(city);
        	      cb.setBounds(88, 11, 130, 22);
        	      
        	      btn = new JButton("Submit");
        	      btn.setBounds(250, 11, 100, 22);
        	      
        	      label = new JLabel("");
        	      label.setBounds(88, 50, 200, 22);
        	      
        	      label2 = new JLabel("HELLO");
        	      label2.setBounds(5, 50, 1800, 22);
        	      
        	      jp = new JPanel();
        	      jp.setBounds(10, 117, 500, 133);
        	      jp.setVisible(true);
        	      
        	      btn.addActionListener((ActionListener) new ActionListener() {
        	    	  @Override
        	    	  
        	    	  public void actionPerformed(ActionEvent e) {
        	    		  String name = "Your Selected City is: " + cb.getItemAt(cb.getSelectedIndex());
        	    		  label.setText(name);
        	    		  
        	    		  jp.setVisible(true);
        	    		  
        	    		   if(cb.getSelectedIndex()==0)
        	    		   {
        	    			   StringBuffer buffer = new StringBuffer();
        	    			   buffer.append("\n Race Course \t ");
        	    			   buffer.append("\n Galleriya \t ");
        	    			   buffer.append("\n Green Belly \t ");
        	    			   
        	    			   label2.setText("\n Your near by places are: " + buffer.toString());
        	    			}
        	    		   if(cb.getSelectedIndex()==1) 
        	    		   {
        	    			  StringBuffer buffer = new StringBuffer();
        	    			  buffer.append("\n Law Garden");
        	    			  buffer.append("\n Laal Darwaza");
        	    			  buffer.append("\n Old Ahmedabad");
        	    			  buffer.append("\n River Front");
        	    			  label2.setText("\n Your near by places are: " + buffer.toString());
        	    		   }
        	    		   if(cb.getSelectedIndex()==2)
        	    		   {
        	    			   StringBuffer buffer = new StringBuffer();
        	    			   buffer.append("\n IT Hub");
        	    			   buffer.append("\n Gujarat High Court");
        	    			   buffer.append("\n Sector-15");
        	    			   buffer.append("\n Sector-13");
         	    			  label2.setText("\n Your near by places are: " + buffer.toString());

        	    		   }
        	    		   if(cb.getSelectedIndex()==3)
        	    		   {
        	    			   StringBuffer buffer = new StringBuffer();
        	    			   buffer.append("\n Surati Sandwich near Convent School");
        	    			   buffer.append("\n Old Surat");
        	    			   buffer.append("\n New Surat");
          	    			  label2.setText("\n Your near by places are: " + buffer.toString());

        	    		   }
        	    	  }

//					@Override
//					public void actionPerformed(ActionEvent e) {
//						// TODO Auto-generated method stub
//						
//					}
//        	    	  
        	      });
        	      jp.add(label2);
        	      frame.add(jp);
        	      frame.add(label);
        	      frame.add(cb);
        	      frame.add(btn);
        	      frame.setSize(600,600);
        		  frame.setLayout(null);
        		  frame.setVisible(true);
        	      
        	      
           }
           public static void main(String[] args) 
           {
			
        	   new DropDownEx();
		}
         
}
