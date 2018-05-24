import java.io.*;
import java.awt.*;
import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.*;

import javax.swing.*;

public class gk extends Applet implements ActionListener//,ItemListener 
   {
	  Font f1=new Font("ms serif",Font.BOLD,50);
	  Image im;
	  String[] s={"Dr.J.C_Basu.jpg","F.F_Bhagat_Singh.jpg","Gandhi.jpg","Lata_Mangeshkar.jpg","Malala_Yousafzai.jpg","Modi.jpg","Mother_Teresa.jpg","Rani_Laxmi_Bai.jpg","Sachin_Tendulkar.jpg","Swami_Vivekananda.jpg","thank.jpg"};
      Checkbox c1,c2,c3,c4;
   
 
      CheckboxGroup cb,cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9;
      Button proceed,submit;
      int cnt=0,choice=1,score=0,flag,flag1,count,temp;
      String s1;
      File f=new File("D:/aa/src/gkimages");
     String[] fs=f.list();

     public void init()
          {
         setSize(1000,650);
         setFont(new Font("ms serif",Font.BOLD,20));
		  proceed=new Button("start quiz");
		  
		  submit=new Button("submit");
		    proceed.addActionListener(this);
		    submit.addActionListener(this);
		  
		    submit.setBounds(600,550,100,50);
		    proceed.setBounds(850,550,100,100); 
		  		 
		    add(proceed);
          }
          public void actionPerformed(ActionEvent ae)
           { 
        	  if(ae.getSource()==proceed)
        	   {
        		 if(flag==flag1)
        		 { URL u=getCodeBase();
        	   
               try {
            	   
            	   
            	   im=getImage(new URL(u+"/gkimages/"+s[cnt]));
				cnt++;
				flag++;
				
	            		    
		         switch(choice)
		          {	   
			 
			 case 1:   proceed.setLabel("next image");
		       cb= new CheckboxGroup();
	           c1=new Checkbox("Dr.Baba Amtey",cb,false);
		       c2=new Checkbox("Dr.H.J Bhaba",cb,false);
	           c3=new Checkbox("Dr.A.P.J Abdul Kalam",cb,false);
	           c4=new Checkbox("Dr.J.C_Basu",cb,false);
	       
	           c1.setBounds(200,500,200,50);
  	       c2.setBounds(200,550,200,50);
  	       c3.setBounds(400,500,200,50);
  	       c4.setBounds(400,550,200,50);
  	       add(c1);
			   add(c2);
			   add(c3);
			   add(c4);
			   add(submit);
					  
			           choice++;  
			           repaint();
	                     break;
                      
			 
			 case 2:   remove(c1);
	           remove(c2);
	           remove(c3);
	           remove(c4);
		      cb1= new CheckboxGroup();
	          c1=new Checkbox("Tantya Topey",cb1,false);
		      c2=new Checkbox("F.F_Bhagat_Singh",cb1,false);
	          c3=new Checkbox("Gandhi",cb1,false);
	          c4=new Checkbox("Sardar Patel",cb1,false);
	          c1.setBounds(200,500,200,50);
  	       c2.setBounds(200,550,200,50);
  	       c3.setBounds(400,500,200,50);
  	       c4.setBounds(400,550,200,50);
  	        add(c1);
				   add(c2);
				   add(c3);
				   add(c4);
				   add(submit);
			
				   /*c1.addItemListener(this);
				   c2.addItemListener(this);
				   c3.addItemListener(this);
				   c4.addItemListener(this); */
				   choice++;  
	         repaint(); break;
			        
			/* else{
				  JOptionPane.showMessageDialog(null,new String("submit your choice"));
				  break;
			 }*/
                      
			 case 3:  remove(c1);
             remove(c2);
             remove(c3);
             remove(c4);
      cb2= new CheckboxGroup();
	 c1=new Checkbox("Gandhi",cb2,false);
		     c2=new Checkbox("Shivaji",cb2,false);
	         c3=new Checkbox("Chacha Nehru",cb2,false);
	         c4=new Checkbox("None of Above",cb2,false);
	         c1.setBounds(200,500,200,50);
   	       c2.setBounds(200,550,200,50);
   	       c3.setBounds(400,500,200,50);
   	       c4.setBounds(400,550,200,50);
   	        add(c1);
				   add(c2);
				   add(c3);
				   add(c4);
				   add(submit);
				
				   /*c1.addItemListener(this);
				   c2.addItemListener(this);
				   c3.addItemListener(this);
				   c4.addItemListener(this);*/
				   choice++;  
	         repaint(); break;
	          
	 case 4:  remove(c1);
             remove(c2);
             remove(c3);
             remove(c4);
      cb3= new CheckboxGroup();
	 c1=new Checkbox("Sushma Swaraj",cb3,false);
		     c2=new Checkbox("Asha Bhonsle",cb3,false);
	         c3=new Checkbox("Lata_Mangeshkar",cb3,false);
	         c4=new Checkbox("Kalpana Chawla",cb3,false);
	         c1.setBounds(200,500,200,50);
   	       c2.setBounds(200,550,200,50);
   	       c3.setBounds(400,500,200,50);
   	       c4.setBounds(400,550,200,50);
   	        add(c1);
				   add(c2);
				   add(c3);
				   add(c4);
				   add(submit);
				
				   /*c1.addItemListener(this);
				   c2.addItemListener(this);
				   c3.addItemListener(this);
				   c4.addItemListener(this);*/
				   choice++;  
	         repaint(); break;
	          
	 case 5: remove(c1);
            remove(c2);
            remove(c3);
            remove(c4);
      cb4= new CheckboxGroup();
	 c1=new Checkbox("Malala_Yousafzai",cb4,false);
		     c2=new Checkbox("Michelle Obama",cb4,false);
	         c3=new Checkbox("Priyanka Chopra",cb4,false);
	         c4=new Checkbox("Chanda Kochar",cb4,false);
	         c1.setBounds(200,500,200,50);
   	       c2.setBounds(200,550,200,50);
   	       c3.setBounds(400,500,200,50);
   	       c4.setBounds(400,550,200,50);
   	        add(c1);
				   add(c2);
				   add(c3);
				   add(c4);
				   add(submit);
				
				  /* c1.addItemListener(this);
				   c2.addItemListener(this);
				   c3.addItemListener(this);
				   c4.addItemListener(this);*/
				   choice++;  
	         repaint();break;
	          
	 case 6:  remove(c1);
             remove(c2);
             remove(c3);
             remove(c4);
      cb5= new CheckboxGroup();
	 c1=new Checkbox("Modi",cb5,false);
		     c2=new Checkbox("Finance Minister",cb5,false);
	         c3=new Checkbox("President",cb5,false);
	         c4=new Checkbox("Army Chief",cb5,false);
	         c1.setBounds(200,500,200,50);
   	       c2.setBounds(200,550,200,50);
   	       c3.setBounds(400,500,200,50);
   	       c4.setBounds(400,550,200,50);
   	        add(c1);
				   add(c2);
				   add(c3);
				   add(c4);
				   add(submit);
				  
				  /* c1.addItemListener(this);
				   c2.addItemListener(this);
				   c3.addItemListener(this);
				   c4.addItemListener(this);*/
				   choice++;  
	         repaint();break;
	          
	 case 7: remove(c1);
            remove(c2);
            remove(c3);
            remove(c4);
      cb6= new CheckboxGroup();
	 c1=new Checkbox("Freedom Fighter",cb6,false);
		     c2=new Checkbox("M.S Subbalaxmi",cb6,false);
	         c3=new Checkbox("Mother_Teresa",cb6,false);
	         c4=new Checkbox("Late P.M",cb6,false);
	         c1.setBounds(200,500,200,50);
   	       c2.setBounds(200,550,200,50);
   	       c3.setBounds(400,500,200,50);
   	       c4.setBounds(400,550,200,50);
   	        add(c1);
				   add(c2);
				   add(c3);
				   add(c4);
				   add(submit);
				 
				   /*c1.addItemListener(this);
				   c2.addItemListener(this);
				   c3.addItemListener(this);
				   c4.addItemListener(this);*/
				   choice++;  
	         repaint();break;
	          
	 case 8: remove(c1);
            remove(c2);
            remove(c3);
            remove(c4);
      cb7= new CheckboxGroup();
	 c1=new Checkbox("Rani_Laxmi_Bai",cb7,false);
		     c2=new Checkbox("Pandita Rama Bai",cb7,false);
	         c3=new Checkbox("Sarojini Naidu",cb7,false);
	         c4=new Checkbox("Vijay Laxmi Pandit",cb7,false);
	         c1.setBounds(200,500,200,50);
   	       c2.setBounds(200,550,200,50);
   	       c3.setBounds(400,500,200,50);
   	       c4.setBounds(400,550,200,50);
   	        add(c1);
				   add(c2);
				   add(c3);
				   add(c4);
				   add(submit);
				   
			
				 /*  c1.addItemListener(this);
				   c2.addItemListener(this);
				   c3.addItemListener(this);
				   c4.addItemListener(this);*/
				   choice++;  
	         repaint();break;
	          
	 case 9:  remove(c1);
             remove(c2);
             remove(c3);
             remove(c4);
      cb8= new CheckboxGroup();
	 c1=new Checkbox("Major Dhyanchand",cb8,false);
		     c2=new Checkbox("Anil Kumbley",cb8,false);
	         c3=new Checkbox("Sunil Gavaskar",cb8,false);
	         c4=new Checkbox("Sachin_Tendulkar",cb8,false);
	         c1.setBounds(200,500,200,50);
   	       c2.setBounds(200,550,200,50);
   	       c3.setBounds(400,500,200,50);
   	       c4.setBounds(400,550,200,50);
   	        add(c1);
			     add(c2);
			     add(c3);
			     add(c4);
			     add(submit);
			    
			    /* c1.addItemListener(this);
				   c2.addItemListener(this);
				   c3.addItemListener(this);
				   c4.addItemListener(this);*/
				   choice++;  
	         repaint();break;
	          
	 case 10: remove(c1);
             remove(c2);
             remove(c3);
             remove(c4);
      cb9= new CheckboxGroup();
	         c1=new Checkbox("Ramanunam",cb9,false);
		     c2=new Checkbox("Aaryabhatta",cb9,false);
	         c3=new Checkbox("Swami_Vivekananda",cb9,false);
	         c4=new Checkbox("Dhanvantri",cb9,false);
	         c1.setBounds(200,500,200,50);
   	       c2.setBounds(200,550,200,50);
   	       c3.setBounds(400,500,200,50);
   	       c4.setBounds(400,550,200,50);
   	     add(c1);
		     add(c2);
		     add(c3);
		     add(c4);
		     add(submit);
		     
	
		     /*c1.addItemListener(this);
			   c2.addItemListener(this);
			   c3.addItemListener(this);
			   c4.addItemListener(this);*/
			   choice++;  
	         repaint();
	         break;

			 case 11:remove(c1);
                     remove(c2);
                     remove(c3);
                     remove(c4);
				     remove(proceed);
				     remove(submit);
				      repaint();
				      JOptionPane.showMessageDialog(null,new String("QUIZ OVER"));
				      break;
			         
		          }

               } 
               
               catch(MalformedURLException e1) 
               {
					e1.printStackTrace();
			   }
         } 
        		 else{JOptionPane.showMessageDialog(null,new String("submit the correct option"));}
       }
               
        if(ae.getSource()==submit)
             	 
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
              if(c1.getState() || c2.getState() || c3.getState() || c4.getState())
              {
            	
         	 	 
               	 if(fs[cnt-1].startsWith(s1))
               	 {
               	  flag1=flag1+1;
          	     flag=flag1;
               	  JOptionPane.showMessageDialog(null,new String("CONGRATULATIONS"));
               	 
               	}
               	 else
               	 {
               		 JOptionPane.showMessageDialog(null,new String("YOU ARE WRONG")); 	 
               	 }
              }
              else
              {
            	  JOptionPane.showMessageDialog(null,new String("SELECT YOUR CHOICE")); 
              }
               
          
              } 
           }
           /* public void ItemStateChange(ItemEvent ie)   
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
             	
             	  JOptionPane.showMessageDialog(null,new String("CONGRATULATIONS")); 
             	}
             	 else
             	 {
             		 JOptionPane.showMessageDialog(null,new String("YOU ARE WRONG")); 	 
             	 }
                
             } */      
        	  public void paint(Graphics g)
              {
        	        
        		   g.drawImage(im, 50, 50,500,400,this);
        		   if(choice>1)
        		   { g.drawRect(50,50,500,400);
        		     //g.drawRect(175,475,300,150);
        		   } 
                     //showStatus("Score="+score);  
              
              }
   }   
          	 
         	
        
        