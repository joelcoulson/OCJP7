package com.joelcoulson.jdbc;

import java.sql.*;

public class BasicDatabaseTransactions {

    private final static String URL = "jdbc:mysql://10.1.1.200:3306/";
    private final static String DATABASE = "test";
    private final static String USER = "root";
    private final static String PASSWORD = "";

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        // note that we're doing this the old way - without a try-with-resources block
        try {
            // make a connection to the database
            connection = DriverManager.getConnection(URL + DATABASE, USER, PASSWORD);

            // ensure that we're using transactions
            connection.setAutoCommit(false);

            // create a statement object. make sure the resultset is updateable
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            // execute the query
            resultSet = statement.executeQuery("SELECT * FROM Person");

            // prepare to insert a row into the resultset. recall that the resultset can also be used for updates
            resultSet.moveToInsertRow();
            resultSet.updateString("name", "Austin");
            resultSet.updateInt("age", 87);

            // insert the row
            resultSet.insertRow();

            // commit the transaction
            connection.commit();

        } catch(SQLException sqle) {

            // rollback the transaction
            try {
                connection.rollback();
            } catch(SQLException sqle2) {
                sqle2.printStackTrace();
                System.out.println("Transaction was rolled back!");
            }

        } finally {

            // close the resources
            try {
                if (connection != null) connection.close();
                if (statement != null) statement.close();
                if (resultSet != null) resultSet.close();
            } catch(SQLException sqle3) {
            }

        }
    }
}
