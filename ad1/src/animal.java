//started 22 June,16

import java.awt.*;
import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.*;

public class animal extends Applet implements ActionListener 
   {
	  
	  Image im;
	  String[] s={"dog.jpg","elephant.jpg","fox.jpg","giraffe.jpg","hippopotamus.jpg","horse.png","lion.jpg","rhinoceros.jpg","tiger.jpg","zebra.jpg"};
      Checkbox c1,c2;
      CheckboxGroup cb;
      Button next;
      int cnt=0;
      
	 public void init()
          {
		    next=new Button("Next Image");
		    next.addActionListener(this);
		    cb= new CheckboxGroup();
		    c1=new Checkbox("Lion",cb,false);
		    c2=new Checkbox("Tiger",cb,false);
		    add(c1);
		    add(c2);
		    add(next);
		   //      addActionListener(this); 
          }
          public void actionPerformed(ActionEvent ae)
           { 
        	 
        	   URL u=getCodeBase();
               try {
				im=getImage(new URL(u+"/animals/"+s[cnt]));
				cnt++;
				repaint();
			  } catch(MalformedURLException e1) {
					e1.printStackTrace();
			}
               
          }
           
         
        	  public void paint(Graphics g)
              {
        	      g.drawImage(im, 50, 50,500,400,this);
              }
   }   
          	 
         	
        
        