import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;
import java.applet.Applet;
public class image2 extends Applet implements ActionListener{
	Label l2,l3,l4;
    TextField t2,t3;
    Button b1,b2;
    String path,id;
    
    
   public void init()
	       {
	    	   setLayout(null);
                   //addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
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

	    	   
	    	   /*l4=new Label("");
	    	   l4.setFont(f);
	    	   l4.setBounds(50, 550, 200, 50);*/
                

  	    	   
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
	  
	    	   b1=new Button("Upload Image");
	    	   b1.setFont(f);
	    	   b1.setBounds(550, 560, 150, 40);
	    	  
	    	   b2=new Button("Submit");
	    	   b2.setFont(f);
	    	   b2.setBounds(750,560, 150, 40);
                    //add(l1);
	    	   add(l2);
	    	   add(l3);
	    	   //add(l4);
	    	  // add(t1);
	    	   add(t2);
	    	   add(t3);
	    	  // add(t4);
	       	   add(b1);
	    	   add(b2);
	           b1.addActionListener(this);
	           b2.addActionListener(this);
	           setVisible(true);
	    	       	   
	       }
	    public void actionPerformed(ActionEvent e) 
	    
	    {
	    	
	    	if(e.getSource()==b1)// browsing
	    	{
	    		FileDialog f=new FileDialog(new Frame());
	    		f.setVisible(true);
	    		String d=f.getDirectory();
	    		String g=f.getFile();
	    	    path=d+g;
	    	   // path=path.replace('\\', '/');
	    	     //t2.setText(path);
	    	     id=t2.getText();
	    	     //t2.setText(id);
	    	}
	       try{ if(e.getSource()==b2)
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
	String jdbcurl =  "jdbc:mysql://localhost/ad";  //ad is database name in mysql(cmd)
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
		String name=rs.getString("sname");
		if(name.equals(sname))
                {
               
                 flag=1; 
                 break;
                }
              //  else{flag=0;}
	}
if(flag==1)
{
  JOptionPane.showMessageDialog(null,new String("user with same name already exists")); 
}
else{

	sqlStatement = "insert into data3 values('"+sname+"','"+pass+"',"+score+",'"+date+"')";   //emp is table name
	int flag1=stmt.executeUpdate(sqlStatement);
	if(flag1==1)                                // If executed,then,
	{
	    	FileInputStream fi=new FileInputStream(path);
	            FileOutputStream fo=new FileOutputStream("D:/ad1//img"+(id+".jpg"));          
                              int ch=0;
	            while((ch=fi.read())!=-1)
	            {
	            	fo.write(ch);
	            }	 
            JOptionPane.showMessageDialog(null,new String("you are registered")); 
	}	
}
  }
    } 
                 
catch (ClassNotFoundException sql) {
	System.out.println("Error creating statement: " + sql);
         }        
               
catch (SQLException sqe) {
	System.out.println("Error creating statement: " + sqe);
         }

	   catch(IOException ie)
	       {
	    	   System.out.println(ie);
	       }
	    }
               	    
    
   
	}

	

    

