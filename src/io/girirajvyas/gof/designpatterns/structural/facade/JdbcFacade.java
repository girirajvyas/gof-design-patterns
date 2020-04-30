package io.girirajvyas.gof.designpatterns.structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import io.girirajvyas.gof.designpatterns.creational.singleton.DbSingleton;

public class JdbcFacade {

	DbSingleton instance = null;

	public JdbcFacade() {
		instance = DbSingleton.getInstance();
	}

	public int createTable() {
		int count = 0;
		try {
			Connection connection = instance.getConnection();
			Statement statement = connection.createStatement();
			count = statement
					.executeUpdate("CREATE TABLE Address (ID Integer, StreetName VARCHAR(20), City VARCHAR(20))");
			System.out.println("Table Created");
			statement.close();
			//connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	public int insertIntoTable() {
		int count = 0;
		try {
			Connection connection = instance.getConnection();
			Statement statement = connection.createStatement();
			count = statement.executeUpdate(
					"INSERT INTO Address (ID, StreetName, City) values (1, '1234 Some Street', 'Nagpur')");
			System.out.println(count + " Record(s) Created");
			statement.close();
			//connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	public List<Address> getAddresses() {
		List<Address> addressList = new ArrayList<>();
		try {
			Connection connection = instance.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");
			while (resultSet.next()) {
				Address addr = new Address();
				addr.setId(resultSet.getString("ID"));
				addr.setStreetName(resultSet.getString("StreetName"));
				addr.setCity(resultSet.getString("City"));
				System.out.println(resultSet.getString("ID") + " " + resultSet.getString("StreetName") + " "
						+ resultSet.getString("City"));
			}
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return addressList;
	}

}
