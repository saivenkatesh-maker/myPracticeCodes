package com.sai.JdbcSample;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main 
{
    public static void main( String[] args )
    {
       try {
    	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HighDB","root","root");
    	   Statement stm = con.createStatement();      
    	   }catch(SQL){
    		   
    	   }
       
}
