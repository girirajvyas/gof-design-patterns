package io.girirajvyas.gof.designpatterns.structural.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeEverydayDemo {

	public static void main(String[] args) {
		try {
			// This is optional step after java 6, it automatically registers
			//DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
			// URL syntax: jdbc:derby:[subsubprotocol:][databaseName][;attribute=value]*
			String dbUrl = "jdbc:derby:memory:designpatterns/webdb;create=true";
			//DriverManager.setLogStream(System.out); // to see steps
			Connection connection = DriverManager.getConnection(dbUrl);
			
			Statement statement = connection.createStatement();
			// This is an abstraction and can work with any database that has driver
			statement.executeUpdate("CREATE TABLE EMPLOYEE(Id INT, Name VARCHAR(20))");
			System.out.println("Table created");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
