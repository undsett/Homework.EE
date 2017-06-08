package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCRequests {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");

    String username = "root";
    String password = "admin";
    String url = "jdbc:mysql://localhost:3306/db_test";

    Connection connection = DriverManager.getConnection(url, username, password);

    createNewUserRecord(connection, "Bob");

    createNewAddressRecord(connection, "Times square");

    selectFromTableUsers(connection);

    selectFromTableAddress(connection);

  }

  private static void createNewAddressRecord(Connection connection, String addressName) throws SQLException {
    PreparedStatement preparedStatement = connection
        .prepareStatement("INSERT INTO address(street) VALUES(?)");
    preparedStatement.setString(1, addressName);
    preparedStatement.executeUpdate();
  }

  private static void createNewUserRecord(Connection connection, String userName) throws SQLException {
    PreparedStatement preparedStatement = connection
        .prepareStatement("INSERT INTO users(name) VALUES(?)");
    preparedStatement.setString(1, userName);
    preparedStatement.executeUpdate();
  }

  private static void selectFromTableUsers(Connection connection) throws SQLException {
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT  * FROM  users");
    while(resultSet.next()) {
      System.out.println("id = " + resultSet.getString(1));
      System.out.println("name = " + resultSet.getString(2));
    }
  }

  private static void selectFromTableAddress(Connection connection) throws SQLException {
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT  * FROM  address");
    while(resultSet.next()) {
      System.out.println("id = " + resultSet.getString(1));
      System.out.println("address = " + resultSet.getString(2));
    }
  }



}
