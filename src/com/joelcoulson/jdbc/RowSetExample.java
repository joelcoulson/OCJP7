package com.joelcoulson.jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class RowSetExample {

    public static void main(String[] args) {

        try {

            // create and factory for rowset
            RowSetFactory rowSetFactory = RowSetProvider.newFactory();

            // create a new rowset from the factory
            JdbcRowSet jdbcRowSet = rowSetFactory.createJdbcRowSet();
            jdbcRowSet.setUrl("jdbc:mysql://127.0.0.1:3306/test");
            jdbcRowSet.setUsername("root");
            jdbcRowSet.setPassword("");

            // run a query
            jdbcRowSet.setCommand("SELECT * FROM Person");
            jdbcRowSet.execute();

            // displaying results
            while(jdbcRowSet.next()) {
                System.out.println("Name: " + jdbcRowSet.getString("name"));
                System.out.println("Age: " + jdbcRowSet.getInt("age"));
            }

            // updating results via the resultset. go to the first row in the result set and update the respective
            // columns
            jdbcRowSet.absolute(1);
            jdbcRowSet.updateString(1, "Andy");
            jdbcRowSet.updateInt(2, 50);

            // force the update
            jdbcRowSet.updateRow();

        } catch(SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
