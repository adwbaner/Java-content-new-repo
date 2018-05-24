package com.cg.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.jdbc.util.DBUtill;

public class PreparedStatementInsert
{

	public static void main(String[] args)
	{
		try(Connection con=DBUtill.getConnection())
		{
			//insert statement
			/**	PreparedStatement pstm1=con.prepareStatement("insert into department_master values(?,?)");
			pstm1.setInt(1, 70);
			pstm1.setString(2, "Accounts");
			int i=pstm1.executeUpdate();
			System.out.println(i);**/
			
			
		/**	PreparedStatement pstm2=con.prepareStatement("insert into department_master values(?,?)");
			pstm2.setInt(1, 80);
			pstm2.setString(2, "biology");
			pstm2.execute();**/
			
			// update table 
			/**PreparedStatement pstm2=con.prepareStatement("update department_master set dept_name=? where dept_code=?");
			pstm2.setString(1, "maths");
			pstm2.setInt(2, 80);
			pstm2.execute();**/
			
			// To retrive value from table
		/**	PreparedStatement pstm=con.prepareStatement("select * from department_master where dept_code=? ");
			pstm.setInt(1,80);
			ResultSet res=pstm.executeQuery();
			
			while(res.next()){
				System.out.println(res.getInt(1)+" "+res.getString(2));
			}**/
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
