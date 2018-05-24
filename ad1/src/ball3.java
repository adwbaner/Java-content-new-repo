//applet example

import java.awt.*;

import java.applet.Applet;
import java.net.URL;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class ball3 extends Applet implements Runnable,ActionListener
   {
	  Thread t;
	  int a=1040,b=100,c=50,d=50;//oval initialization
	  int w=100,x=500,y=120,z=500;//line initialization 
	  int score;
	  int flag=100,flag1=1,flag2,flag3,count,flag4,flag5;
	  Button fire,start;
	   
	 public void init()
          {
          //setSize(1000,700);
         start=new Button("START");
		 start.addActionListener(this);
		 fire=new Button("FIRE");
		  fire.addActionListener(this);
		
		   add(start);
		       t=new Thread(this); 
              // t.start();
              }
          public void run()
           {
        	  
        	
        	  fire.setBounds(50,500,50,50);
               add(fire);
        	  // if(flag1==flag2) 
        	
        		for(;;)
        	
             {  if(flag5==0){  JOptionPane.showMessageDialog(null,new String("GAME IS OVER IF 5 BALLS ARE MISS")); }
       	         //flag5++;
            	if(b<=100)
            	{
            		flag=0;
            		//flag3=0;
            		 flag4=0;
            		if(flag5!=0)
            		{
            			if(flag3!=1)
            			{count=count+1;}}
            		      flag5++;
            		 
            		 //JOptionPane.showMessageDialog(null,new String("BALL IS NOT SHOT GAME IS OVER IF"+" "+(6-count)+" "+"BALLS MISS"));
            	}
            	 if(flag==0)
            	 {  
                	
            		 b=b+20;
               	 if(flag1==flag2){
               		 
               		 w=w+100;
                     y=y+100;
            	 }
            	 }
            	 if(flag==1)
            	 {
              	   
            		 
            		 b=b-20;
            		if(flag1==flag2){
            			
            			w=w+100;
                  	  y=y+100;
            	   }
            	  }
            	 if((y>=a) && (z>=b && z<=b+50))
            	   {
            		   score=score+1; 
            		   flag3=1;
            		   JOptionPane.showMessageDialog(null,new String("NICE SHOT"));
            		   //count--;
            		   /*w=100;
            		   y=120;*/
            	   }
              	
            	 if(b>=600)
            	{
            		flag=1;
            		flag4=0;
            		 if(flag3!=1){count=count+1;}
            		 flag3=0;
            		 //JOptionPane.showMessageDialog(null,new String("BALL IS NOT SHOT GAME IS OVER IF"+" "+(5-count)+" "+"BALLS MISS"));
            	}
            
            
          	      
            	if(y>=1090)
            	   {
            		   flag1++;
            		 
            		   //flag3=0;
            		   w=100;
            		   y=120;
            		 
            	   }
            	 if(count>5) 	
        	       {
        	    	    JOptionPane.showMessageDialog(null,new String("GAME OVER")); 
        	    	    t.stop();
        	       }
            	  
            	 try{           
                      t.sleep(300);
                      repaint();
                      }
             
             catch(InterruptedException e)
             {
               System.out.println(e);
              }
             }
        	
        	}
          public void actionPerformed(ActionEvent ae)
          { 
       	     if(ae.getSource()==start)
       	     {
       	     
       	    	t.start();
       	     }
              if(ae.getSource()==fire)
              {
       	        flag2=flag2+1;
    	    	flag1=flag2;
    	    	flag4=1;
              }
          }
          
          
             public void paint(Graphics g)
             {
            	 g.setColor(Color.BLUE);
            	 g.drawOval(a,b,c,d);
            	 g.drawLine(w, x, y, z);
            	 g.fillOval(a,b,c,d);
            	 showStatus("score="+score);
            	
            	
             }
             
         }
     