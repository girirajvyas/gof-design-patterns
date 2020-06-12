package io.girirajvyas.gof.designpatterns.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum DbSingletonEnum {

  INSTANCE;

  private Connection conn;

  private DbSingletonEnum() {
    try {
      // DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
      String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
      conn = DriverManager.getConnection(dbUrl);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public Connection getConnection() {
    return conn;
  }



}
