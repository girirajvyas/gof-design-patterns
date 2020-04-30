package io.girirajvyas.gof.designpatterns.structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import io.girirajvyas.gof.designpatterns.creational.singleton.DbSingleton;

public class JdbcBeforeFacadeDemo {

	public static void main(String[] args) {
		DbSingleton instance = DbSingleton.getInstance();

		try {
			Connection conn = instance.getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate("CREATE TABLE Address (ID Integer, StreetName VARCHAR(20), City VARCHAR(20))");
			System.out.println("Table Created");
			statement.close();

			statement = conn.createStatement();
			int count = statement.executeUpdate(
					"INSERT INTO Address (ID, StreetName, City) values (1, '1234 Some Street', 'Nagpur')");
			System.out.println(count + " Record(s) Created");
			statement.close();

			statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");

			while (resultSet.next()) {
				System.out.println(resultSet.getString("ID") + " " + resultSet.getString("StreetName") + " "
						+ resultSet.getString("City"));
			}
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
