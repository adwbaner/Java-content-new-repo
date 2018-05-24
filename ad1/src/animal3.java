
import java.io.*;
import java.awt.*;
import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.*;

import javax.swing.*;

public class animal3 extends JFrame implements ActionListener 
   {
	  Font f1=new Font("ms serif",Font.BOLD,20);
	  JLabel jim;
	  String[] s={"dog.jpg","elephant.jpg","fox.jpg","giraffe.jpg","hippopotamus.jpg","horse.png","lion.jpg","rhinoceros.jpg","tiger.jpg","zebra.jpg"};
      Checkbox c1,c2,c3,c4;
      Container c; 
      CheckboxGroup cb,cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9;
      JButton proceed;
      int cnt=0,choice=0,score;
      String s1;
      File f=new File("C:/Documents and Settings/Administrator/My Documents/Downloads/nagpal/src/animals");
     String[] fs=f.list();
    
	public animal3(int choice)
          {
		  c=getContentPane();
          c.setBackground(Color.white);
          c.setLayout(null);
          setSize(1000,800); 
		  proceed=new JButton("next Image");
		  proceed.addActionListener(this);
		  proceed.setBounds(500,600,100,50);
		  add(proceed);
		  ImageIcon ii = new ImageIcon("C:/Documents and Settings/Administrator/My Documents/Downloads/nagpal/src/animals/"+s[choice]);
		   jim=new JLabel(ii);
		  
		   cnt++;
		
       		    
        switch(choice)
         {	   
	 case 0:   
		   
		       cb= new CheckboxGroup();
	           c1=new Checkbox("Lion",cb,false);
		       c2=new Checkbox("cow",cb,false);
	           c3=new Checkbox("dog",cb,false);
	           c4=new Checkbox("cat",cb,false);
	           c1.setFont(f1);
	           c2.setFont(f1);
	           c3.setFont(f1);
	           c4.setFont(f1);
	       c1.setBounds(100,500,200,50);
   	       c2.setBounds(100,550,200,50);
   	       c3.setBounds(300,500,200,50);
   	       c4.setBounds(300,550,200,50);
   	       jim.setBounds(50,50,600,400);
   	             c.add(jim);
	             c.add(c1);
			     c.add(c2);
			     c.add(c3);
			     c.add(c4); 
			     
             
                break;
             
	 case 1:  
		       cb1= new CheckboxGroup();
	          c1=new Checkbox("elephant",cb1,false);
		      c2=new Checkbox("ox",cb1,false);
	          c3=new Checkbox("cat",cb1,false);
	          c4=new Checkbox("monkey",cb1,false);
	          c1.setBounds(100,500,200,50);
   	      c2.setBounds(100,550,200,50);
   	      c3.setBounds(300,500,200,50);
   	        c4.setBounds(300,550,200,50);
   	     jim.setBounds(50,50,600,400);
   	         c.add(jim);  
	         c.add(c1);
		     c.add(c2);
		     c.add(c3);
		     c.add(c4); 
            break;
             
	 case 2: 
      cb2= new CheckboxGroup();
	 c1=new Checkbox("Lion",cb2,false);
		     c2=new Checkbox("horse",cb2,false);
	         c3=new Checkbox("leopard",cb2,false);
	         c4=new Checkbox("fox",cb2,false);
	         c1.setBounds(100,500,200,50);
   	        c2.setBounds(100,550,200,50);
   	        c3.setBounds(300,500,200,50);
   	        c4.setBounds(300,550,200,50);
   	     jim.setBounds(50,50,600,400);
   	         c.add(jim);  
	         c.add(c1);
		     c.add(c2);
		     c.add(c3);
		     c.add(c4); 
            break;
	          
	 case 3:  
      cb3= new CheckboxGroup();
	 c1=new Checkbox("donkey",cb3,false);
		     c2=new Checkbox("giraffe",cb3,false);
	         c3=new Checkbox("rhino",cb3,false);
	         c4=new Checkbox("hippopotamus",cb3,false);
	         c1.setBounds(100,500,200,50);
   	        c2.setBounds(100,550,200,50);
   	        c3.setBounds(300,500,200,50);
   	        c4.setBounds(300,550,200,50);
   	     jim.setBounds(50,50,600,400);
   	         c.add(jim);  
	         c.add(c1);
		     c.add(c2);
		     c.add(c3);
		     c.add(c4); 
            break;
	          
	 case 4: 

	 cb4= new CheckboxGroup();
	 c1=new Checkbox("Lion",cb4,false);
		     c2=new Checkbox("hippopotamus",cb4,false);
	         c3=new Checkbox("ox",cb4,false);
	         c4=new Checkbox("tiger",cb4,false);
	         c1.setBounds(100,500,200,50);
   	        c2.setBounds(100,550,200,50);
   	        c3.setBounds(300,500,200,50);
   	        c4.setBounds(300,550,200,50);
   	     jim.setBounds(50,50,600,400);
   	         c.add(jim); 
	         c.add(c1);
		     c.add(c2);
		     c.add(c3);
		     c.add(c4); 
            break;
	          
	 case 5:  

      cb5= new CheckboxGroup();
	 c1=new Checkbox("camel",cb5,false);
		     c2=new Checkbox("cow",cb5,false);
	         c3=new Checkbox("horse",cb5,false);
	         c4=new Checkbox("bufallo",cb5,false);
	         c1.setBounds(100,500,200,50);
   	        c2.setBounds(100,550,200,50);
   	        c3.setBounds(300,500,200,50);
   	        c4.setBounds(300,550,200,50);
   	     jim.setBounds(50,50,600,400);
   	         c.add(jim);  
	         c.add(c1);
		     c.add(c2);
		     c.add(c3);
		     c.add(c4); 
            break;
	          
	 case 6:
      cb6= new CheckboxGroup();
	 c1=new Checkbox("Lion",cb6,false);
		     c2=new Checkbox("tiger",cb6,false);
	         c3=new Checkbox("leopard",cb6,false);
	         c4=new Checkbox("panther",cb6,false);
	         c1.setBounds(100,500,200,50);
	   	       c2.setBounds(100,550,200,50);
	   	       c3.setBounds(300,500,200,50);
	   	       c4.setBounds(300,550,200,50);
	   	    jim.setBounds(50,50,600,400);
	   	     c.add(jim);   
	         c.add(c1);
		     c.add(c2);
		     c.add(c3);
		     c.add(c4); 
           break;
	          
	 case 7: 
      cb7= new CheckboxGroup();
	 c1=new Checkbox("camel",cb7,false);
		     c2=new Checkbox("ox",cb7,false);
	         c3=new Checkbox("rhino",cb7,false);
	         c4=new Checkbox("panther",cb7,false);
	         c1.setBounds(100,500,200,50);
	   	       c2.setBounds(100,550,200,50);
	   	       c3.setBounds(300,500,200,50);
	   	       c4.setBounds(300,550,200,50);
	   	    jim.setBounds(50,50,600,400);
	   	       c.add(jim);  
	         c.add(c1);
		     c.add(c2);
		     c.add(c3);
		     c.add(c4); 
           break;
	          
	 case 8: 
      cb8= new CheckboxGroup();
	 c1=new Checkbox("cheetah",cb8,false);
		     c2=new Checkbox("tiger",cb8,false);
	         c3=new Checkbox("jaguar",cb8,false);
	         c4=new Checkbox("cat",cb8,false);
	         c1.setBounds(100,500,200,50);
	   	       c2.setBounds(100,550,200,50);
	   	       c3.setBounds(300,500,200,50);
	   	       c4.setBounds(300,550,200,50);
	   	    jim.setBounds(50,50,600,400);
	   	     c.add(jim); 
	         c.add(c1);
		     c.add(c2);
		     c.add(c3);
		     c.add(c4); 
            break;
	          
	 case 9: 
      cb9= new CheckboxGroup();
	         c1=new Checkbox("zebra",cb9,false);
		     c2=new Checkbox("cow",cb9,false);
	         c3=new Checkbox("cat",cb9,false);
	         c4=new Checkbox("bufallo",cb9,false);
	         c1.setBounds(100,500,200,50);
	   	       c2.setBounds(100,550,200,50);
	   	       c3.setBounds(300,500,200,50);
	   	       c4.setBounds(300,550,200,50);
	   	    jim.setBounds(50,50,600,400);
	   	     c.add(jim);
	         c.add(c1);
		     c.add(c2);
		     c.add(c3);
		     c.add(c4); 
           break;
	         
         }

		  
		    setVisible(true);
		    
		     
          }
          public void actionPerformed(ActionEvent ae)
           { 
        	   if(ae.getSource()==proceed)
        	   {
        		   choice=choice+1;
        		   new animal3(choice);
        	   }
           }
		
            /* public void ItemStateChanged(ItemEvent ie)
             {
               if(ie.getSource()==proceed)
            	 
               { 
            	 if(c1.getState())
                {
                	 s1=c1.getLabel();
                }

                if(c2.getState())
                {
                	 s1=c2.getLabel();
                }
                if(c3.getState())
                {
                	 s1=c3.getLabel();
                }
                if(c4.getState())
                {
                	 s1=c4.getLabel();
                }
            	 
            	 if(fs[cnt-1].startsWith(s1))
            	 {
            		 score++;
            	 }
              
               } 
            	
             }  */       
        	  public static void main(String[] ar)
              {
        
           	      new animal3(0);
        		 
          
              
              }
   }   
          	 
         	
        
        