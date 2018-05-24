package com.cg.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.cg.jdbc.util.DBUtill;

public class StatementDemo {

	public static void main(String[] args) {
		
		
			try( Connection con=DBUtill.getConnection())
			{
				
				Statement stm = con.createStatement();
				
				ResultSet res = stm.executeQuery("select * from emp");
				
				while(res.next())
				{
					int id=res.getInt(1);
					String name=res.getString(2);
					Date hiredate=res.getDate(5);
					double sal=res.getDouble(6);
					
					System.out.println(id+" " + name +" "+hiredate+" " );
				}

			
			}
		
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
