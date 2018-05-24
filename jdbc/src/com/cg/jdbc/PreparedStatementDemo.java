package com.cg.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.jdbc.util.DBUtill;

public class PreparedStatementDemo
{

	public static void main(String[] args) 
	{
		try( Connection con=DBUtill.getConnection())
		{
			PreparedStatement pstm=con.prepareStatement("select * from department_master where dept_code=? ");
			pstm.setInt(1, 70);
			ResultSet res=pstm.executeQuery();
			
			while(res.next()){
				System.out.println(res.getInt(1)+" "+res.getString(2));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
