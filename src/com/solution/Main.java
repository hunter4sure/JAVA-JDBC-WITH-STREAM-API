package com.solution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList = GetStudents();
		
	  	  
		   List<String> names = studentList
				   .stream()
				   .filter(P -> P.getGradeMarks() > 40)
				   .map(Student:: getFirstName)
				   .collect(Collectors.<String>toList());
     
		   names.forEach(System.out::println);
	
        
		   names.forEach(System.out::println);

	}
	
	public static Connection getDBConnection() {
		
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String driver = "oracle.jdbc.OracleDriver";
		String user ="Redeemer";
		String password = "*";
		
		try {
			
			//Opening Database Connection
			
			Class.forName(driver);
			conn  = DriverManager.getConnection(url, user, password);
			
			//Returning Connection Object
			
			return conn;
			
		} catch (Exception e) {


			e.getMessage();
		}
		
		//this will be a null Connection Objects 
		return conn;
		
	}

	public static List<Student> GetStudents() {

		List<Student> col = new ArrayList<>();

		Connection conn = getDBConnection();

		PreparedStatement pS = null;
		ResultSet rs = null;

		Student student = null;
		String sql = "SELECT STUDENT_NO,FIRST_NAME,GRADE FROM STUDENT";

		try {

			if (conn.equals(null)) {

				System.out.println("Connection Not Opened");

			} else {

				pS = conn.prepareStatement(sql);
				rs = pS.executeQuery();

				while (rs.next()) {

					student = new Student(rs.getString(1), rs.getString(2), rs.getInt(3));

					col.add(student);

				}
				
				System.out.println(col.isEmpty());

				return col;

			}

		} catch (Exception e) {
			e.getMessage();
		} finally {

		}

		return col;

	}


}
