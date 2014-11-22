package com.joelcoulson.jdbc;

import java.sql.*;

public class BasicDatabaseExample {

    private final String URL = "jdbc:mysql://10.1.1.200:3306/";
    private final String DATABASE = "test";
    private final String USER = "root";
    private final String PASSWORD = "";

    public Connection makeConnection() {
        try {
            // make a connection to the database
            Connection connection = DriverManager.getConnection(URL+DATABASE, USER, PASSWORD);
            return connection;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void showTable() {
        // make a connection
        Connection connection = makeConnection();

        try {
            // prepare a new statement
            Statement statement = connection.createStatement();

            // execute the statement against the database
            statement.executeQuery("SELECT * FROM Person");

            // fetch the resultset
            ResultSet resultSet = statement.getResultSet();

            // iterate through the resultset. not that we get the column name
            while(resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Age: " + resultSet.getInt("age"));
            }

        } catch(SQLException sqe) {
            sqe.printStackTrace();
        }
    }

    public void insertRow(String name, int age) {
        // make a connection
        Connection connection = makeConnection();

        try {
            // prepare a new statement
            Statement statement = connection.createStatement();

            // execute the statement against the database
            statement.executeUpdate("INSERT INTO Person VALUES(\"" + name + "\",\"" + age + "\")");

        } catch(SQLException sqe) {
            sqe.printStackTrace();
        }
    }

    public void updateTable(String oldName, String newName) {
        // make a connection
        Connection connection = makeConnection();

        try {
            // prepare a new statement. ensure that the resultset is updatable!
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            // execute the statement against the database. find the rows we're looking to update
            // you need to specify the primary key in the select in order to be able to update the resultset
            statement.executeQuery("SELECT name, age FROM Person WHERE name = \"" + oldName + "\"");

            // fetch the resultset
            ResultSet resultSet = statement.getResultSet();

            // move the pointer to the first row
            resultSet.absolute(1);

            // update the rows with the new name
            resultSet.updateString("name", newName);

            // force the update
            resultSet.updateRow();

        } catch(SQLException sqe) {
            sqe.printStackTrace();
        }
    }

    public void removeRow(String name) {
        // make a connection
        Connection connection = makeConnection();

        try {
            // prepare a new statement. ensure that the resultset is updatable!
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            // execute the statement against the database. find the rows we're looking to update
            // you need to specify the primary key in the select in order to be able to update the resultset
            statement.executeQuery("SELECT name, age FROM Person WHERE name = \"" + name + "\"");

            // fetch the resultset
            ResultSet resultSet = statement.getResultSet();

            // delete the matching rows
            while(resultSet.next()) {
                resultSet.deleteRow();
            }

        } catch(SQLException sqe) {
            sqe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BasicDatabaseExample basicDatabaseTest = new BasicDatabaseExample();

        // insert a couple of rows
        basicDatabaseTest.insertRow("John", 37);
        //basicDatabaseTest.insertRow("Dan", 22);

        // show the table
        basicDatabaseTest.showTable();

        // update rows with new name
        basicDatabaseTest.updateTable("John", "Frank");

        // show the table
        basicDatabaseTest.showTable();

        // remove the new frank entry
        basicDatabaseTest.removeRow("Frank");
    }
}
