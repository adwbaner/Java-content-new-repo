//21 june'16
import java.awt.*;
import java.applet.Applet;

public class ballarrow extends Applet implements Runnable {
         Thread t;
         int Score;
         int x=900,y=20,x1=100,x2=240,X=950,Y=20;
         public void init(){
         t= new Thread(this);
         //t1= new Thread(this);
         t.start();
         //t1.start();
        }
        public void run(){
        	for(;;)
        	{
        		try{
        			t.sleep(100);
        			
        			repaint();
        		}
        		catch(InterruptedException ie){
        			System.out.println(ie);
        		}
                if(x2==y-50){
                	Score=Score+1;
                }
        		if(y<20){
        			y=500;
        		}
        	
        		//if(Y>485)
         		  // Y=20;
        		if(x2>900){
        			x1=100;
        		    x2=240;
        		}
        	}
        	
        	
        }
        
        public void paint(Graphics g){
        	
            x1=x1+20;
            x2=x2+20;
            Y=Y+20;
            
            y=y-10;
            //if(y>500)
            	//y=y-10;
          //  Y1=Y1+15;
            //Y2=Y1+25;
            //Y3=Y1+50;
            g.setColor(Color.BLACK);
            g.drawLine(x1,500,x2,500);
            g.setColor(Color.RED);
        	g.fillOval(X,Y,50,50);
        	//g.fillOval(X1,Y1,50,50);
        	//g.fillOval(X2,Y2,50,50);
        	//g.fillOval(X3,Y3,50,50);
        	g.setColor(Color.BLUE);
        	if(y>50)
        	g.fillOval(x,y,50,50);
        	//g.fillOval(x,y+90,50,50);
        	//g.fillOval(x,y+125,50,50);
        	//g.fillOval(x,y+147,50,50);
        	
        	showStatus("Score="+Score);
        	
            }
}

