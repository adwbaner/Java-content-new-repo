import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;
import java.applet.Applet;


//import javax.swing.JFrame;
public class image3 extends Applet implements ActionListener{
	Label l2,l3,imageLabel;
    TextField t2,t3;
    Button b1;
    String path,id,img1;
 
    Image im;
    
 public void init()
	       {
	    	   setLayout(null);
                  // addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
                  
                 //  t3.addFocusListener(new FocusAdapter(){public void focusLost(FocusEvent fe){  System.out.println("focus lost"); }});
                
   
                   Font f=new Font("ms serif",Font.BOLD,20);
	    	  
	      	   setSize(1300,700);
	      	   
	    	   /*l1=new Label("ID");
	    	   l1.setFont(f);
	    	   l1.setBounds(50, 100, 200, 50);*/
	    	   
	    	   l2=new Label("Name");
	    	   l2.setFont(f);
	    	   l2.setBounds(50, 250, 200, 50);
	    	   
	    	   
	    	   l3=new Label("Password");
	    	   l3.setFont(f);
	    	   l3.setBounds(50, 400, 200, 50);

	           b1=new Button("LOG IN");
                   b1.setFont(f);
                   b1.setBounds(750,560, 150, 40);
                   

  	    	   
             /*  t1=new TextField();
               t1.setFont(f);
               t1.setBounds(300,100,200,50);*/
 
              t2=new TextField();
               t2.setFont(f);
               t2.setBounds(300,250,200,50);

                 t3=new TextField();
                t3.setFont(f);
                t3.setEchoChar('*'); 
                t3.setBounds(300,400,200,50);

               /* t4=new TextField();
                t4.setFont(f);
                t4.setBounds(300,550,200,50);*/
	  
	
	    
                    //add(l1);
	    	   add(l2);
	    	   add(l3);
	    	   //add(l4);
	    	  // add(t1);
	    	   add(t2);
	    	   add(t3);
	    	  // add(t4);
	       	   add(b1);
	          // id=t2.getText();
	           b1.addActionListener(this);
	      t3.addFocusListener(new FocusAdapter(){public void focusGained(FocusEvent fe){f1();}});
	           //setVisible(true);
	    	       	   
	       }
	   
    public void f1()
    {
           id=t2.getText();
        // System.out.println(id);
        img1="D:/eclipse/ad1/img"+(id+".jpg"); 
       //setBounds(700,400,300,300);
        repaint();
       }
     
               
       
   
 
  public void paint(Graphics g)
	{
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image img=tk.getImage(img1);
		g.drawImage(img,700,100,200,200,this);
	}
        
    public void actionPerformed(ActionEvent e) 
	    
	    {
	    	
	    	
	       try{ if(e.getSource()==b1)
	        {
	          
	          Connection con = null;
   String sname="";
   String pass=""; 
   String date="";
   int score=0;
  //Scanner sc=null;
 
//	sc=new Scanner(System.in);
   // System.out.println("Loading Driver.....");
	Class.forName("com.mysql.jdbc.Driver");
	String jdbcurl =  "jdbc:mysql://localhost/aadi";  //aadi is database name in mysql(cmd)
	String user = "root";
	String password = "";
        Date d=new Date();
        int a=d.getDate();
        String a1=a+"";
        int b=d.getMonth()+1;
            String b1=b+"";
        int c=d.getYear()+1900;
            String c1=c+"";
        date=a1+"/"+b1+"/"+c1;
	con = DriverManager.getConnection(jdbcurl, user,password);
	//System.out.println("connection created....");
               // System.out.println("Enter name->");
 	sname=t2.getText();
        //      System.out.println("Enter age->");
	pass=t3.getText();
        Statement stmt = null;
        String sqlStatement = "";
        stmt = con.createStatement();
	sqlStatement = "select * from data3";
	ResultSet rs=stmt.executeQuery(sqlStatement);
	int flag=0;
        while(rs.next())
	{
		String name=rs.getString(1);
		String pass1=rs.getString(2);
                if(name.equals(sname) && pass1.equals(pass))
                {               
                 flag=1; 
                 break;
                }
              //  else{flag=0;}
	}
if(flag==1)
{
  JOptionPane.showMessageDialog(null,new String("Play Game")); 
  //ba.init();
}
else{
      JOptionPane.showMessageDialog(null,new String("Check your user name or password"));

}
  }
    } 
               catch (NullPointerException n) {
	System.out.println("Error creating statement: " + n);
         }
                 
catch (ClassNotFoundException sql) {
	System.out.println("Error creating statement: " + sql);
         }        
               
catch (SQLException sqe) {
	System.out.println("Error creating statement: " + sqe);
         }

	 
	    }
               	    
   
	}

	

