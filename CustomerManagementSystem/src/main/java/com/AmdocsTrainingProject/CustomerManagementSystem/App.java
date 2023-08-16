//package com.AmdocsTrainingProject.CustomerManagementSystem;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args ){
//    	
//    	String jdbcurl="oracle.jdbc.driver.OracleDriver";
//		String connstring="jdbc:oracle:thin:@localhost:1521:XE";
//		String username="sys as sysdba";
//		String password="admin";
//		
//		try {
////			Class.forName(jdbcurl);
//			Connection con= DriverManager.getConnection(connstring, username, password);
//			System.out.println("Connection Successful");
//			Statement st=con.createStatement();
////			String sql="Create table temp(id int,name varchar(20))";
////			st.executeUpdate(sql);
////			System.out.println("Table created...");
//		} 
////		catch (ClassNotFoundException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} 
//		catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	
//    }
//}
