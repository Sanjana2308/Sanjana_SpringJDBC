package com.gl.springJdbc.main;

import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class Main {

			//JdbcTemplate is spring framework jdbc Template class
			//its main work is to stabalish a connection or to understand to perform jdbc with our spring application
			static JdbcTemplate jdbcTemplateObj;
		
			
			//Driver data source is our spring framework jdbc class 
			// and its responsblity is to get the data source via our application
			//to configure the database
			static SimpleDriverDataSource dataSourceObj;
			
			
			// Configure the database 
			static String USERNAME="root";
			static String PASSWORD="vikas12345@";
			static String URL="jdbc:mysql://localhost:3306/Tables_in_springjdbc";
			
			public static SimpleDriverDataSource getDatabaseConnection() {
				dataSourceObj = new SimpleDriverDataSource();
				try {
					dataSourceObj.setDriver(new com.mysql.cj.jdbc.Driver());
					dataSourceObj.setUrl(URL);
					dataSourceObj.setUsername(USERNAME);
					dataSourceObj.setPassword(PASSWORD);
				}
				catch(SQLException sqlExceptio) {
					sqlExceptio.printStackTrace();
				}
				return null;
			}
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		jdbcTemplateObj = new JdbcTemplate(getDatabaseConnection());
		
		System.out.println("The connection :-"+jdbcTemplateObj);
		//1. Creating connection
		 
		//2. Inform the spring code about database 
		//3. Setting Driver class
		//4. SQL insert query 
		//5. SQL update 
		//6. SQL read 
		//7. SQL delete
		//8. SQL disconnect
		
	}

}
