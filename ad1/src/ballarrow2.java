 
//21 june'16
import java.awt.*;
import java.awt.event.ActionEvent;
import java.applet.Applet;
import java.net.URL;
import java.io.*;
import java.awt.*;   
import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.*;

//import javax.swing.*;

public class ballarrow2 extends Applet implements Runnable,ActionListener {
         Thread t;
         int Score;
         int x=900,y=20,x1=100,x2=240,X=950,Y=20,y1=20,X1=1000,Y1=20;
         Button start, shoot,stop;
         public void init()
       {
         
         
         start=new Button("START");
		 start.addActionListener(this);
		 shoot=new Button("SHOOT");
		 shoot.addActionListener(this);
		 stop=new Button("STOP");
		 stop.addActionListener(this);
		 add(start);
		 t= new Thread(this);
		// shoot.setBounds(20, 200, 100, 100);
		 //t1= new Thread(this);
         //t.start();
         //t1.start();
        }
        public void run(){
        	shoot.setBounds(100,330,50,50);
        	add(shoot);
        	stop.setBounds(720,7,50,20);
        	add(stop);
        	
        	for(;;)
        	{
        		try{
        			t.sleep(100);
        			
        			repaint();
        		}
        		catch(InterruptedException ie){
        			System.out.println(ie);
        		}
                if(x2==y||x2==y1){
                	Score=Score+1;
                }if(x2==Y1||x2==Y){
                	Score=Score+10;
                }
                
        		if(y>500)
        		   y=20;
        		if(y1<20)
         		   y1=500;
        		if(Y<20)
         		   Y=550;
        		if(Y1>550)
          		   Y1=30;
        		if(x2>1000){
        			x1=100;
        		    x2=240;
        		}
        	}
        	
        	
        }
        public void actionPerformed(ActionEvent ae)
        { 
     	     if(ae.getSource()==start)
     	     {
     	     
     	     t.start();
     	     }
            if(ae.getSource()==shoot)
            {
            	//t.start();
            }
            if(ae.getSource()==stop){
            	t.stop();
            }
        }
        
        public void paint(Graphics g){
        	
            x1=x1+20;
            x2=x2+20;
            Y=Y-10;
            y1=y1-20;
            Y1=Y1+15;
           
            g.setColor(Color.BLACK);
            y=y+10;
            g.drawLine(x1,350,x2,350);
            g.setColor(Color.RED);
        	g.fillOval(X,Y,50,50);
        	g.setColor(Color.GREEN);
        	g.fillOval(X1,Y1,50,50);
        	g.setColor(Color.BLUE);
        	g.fillOval(900,y+100,50,50);
        	g.setColor(Color.YELLOW);
        	g.fillOval(850,y1,50,50);
        	
        	
        	showStatus("Score="+Score);
        	
            }
}

