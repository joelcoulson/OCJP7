package com.joelcoulson.jdbc;

import java.sql.*;

public class SuperBasicDatabaseExample {

    public static void main(String[] args) {

        // note the try-with-resources block means that we do not need to
        // explicitly close resources within a finally block
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://10.1.1.200:3306/test", "root", "");
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Person")) {

            // displaying results
            while(resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Age: " + resultSet.getInt("age"));
            }

            // updating results via the resultset. go to the first row in the result set and update the respective
            // columns
            resultSet.absolute(1);
            resultSet.updateString(1, "Andy");
            resultSet.updateInt(2, 50);

            // force the update
            resultSet.updateRow();

        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
