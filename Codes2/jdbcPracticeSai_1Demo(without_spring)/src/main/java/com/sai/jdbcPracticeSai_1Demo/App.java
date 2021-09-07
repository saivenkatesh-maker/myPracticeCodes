package com.sai.jdbcPracticeSai_1Demo;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args )
    {
        try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/highdb", "root","Sai777$$");
			Statement stm =  con.createStatement();
			String query="select * from emp1";
			ResultSet rs=stm.executeQuery(query);
			while(rs.next()) {
				System.out.println("Name:"+rs.getString(1)+"Email:"+rs.getString(2)+"Contact:"+rs.getString(3)+"City:"+rs.getString(4));
			}
			System.out.println(rs);
			con.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
