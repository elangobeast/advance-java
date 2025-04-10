package com;

import java.sql.DriverManager;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Claas.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","zeus");
			
			
		}

	}

}
