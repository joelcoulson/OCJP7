package com.joelcoulson.jdbc;

import java.sql.*;

public class ComplexDatabaseTransactions {

    private final static String URL = "jdbc:mysql://localhost:3306/";
    private final static String DATABASE = "test";
    private final static String USER = "root";
    private final static String PASSWORD = "";

    public static void addPerson(Connection connection, String name, int age) {

        Statement statement = null;

        try {

            // insert row
            statement = connection.createStatement();
            statement.execute("INSERT INTO Person VALUES(\"" + name + "\",\"" + age + "\")");

        } catch(SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
            } catch(SQLException sqle2) {}
        }
    }

    public static void main(String[] args) {

        Connection connection = null;

        try {
            // make a connection to the database
            connection = DriverManager.getConnection(URL + DATABASE, USER, PASSWORD);

            // ensure that we're using transactions
            connection.setAutoCommit(false);

            // add a few people but then rollback after the last addition
            addPerson(connection, "Bob", 32);
            Savepoint savepoint1 = connection.setSavepoint();
            addPerson(connection, "Andrew", 12);
            Savepoint savepoint2 = connection.setSavepoint();
            addPerson(connection, "Jaime", 102);
            Savepoint savepoint3 = connection.setSavepoint();

            // rollback to the second savepoint
            connection.rollback(savepoint2);

            // commit the transaction
            connection.commit();

        } catch(SQLException sqle) {

            // rollback the transaction
            try {
                connection.rollback();
            } catch(SQLException sqle2) {
                sqle2.printStackTrace();
            }

        } finally {

            // close the resources
            try {
                if (connection != null) connection.close();
            } catch(SQLException sqle3) {
            }

        }
    }
}