/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnector {


    public DatabaseConnector() {


    }

      public ArrayList<String> getTeamNames() {
        try {
            // 0. Register MySQL driver class
            DriverManager.registerDriver((java.sql.Driver) Class.forName("com.mysql.jdbc.Driver").newInstance());

            // 1. Get a connection to database.
            Connection myConn = DriverManager.getConnection("jdbc:mysql://201db.gnorli.no:3306/Testnicolay?autoReconnect=true&useSSL=false", "Snorre", "Mongoper!");

            // 2. Create a statement.
            Statement myStmt = myConn.createStatement();

            // 3. Execute a SQL query.
            ResultSet myRs = myStmt.executeQuery("select * from lag order by `Poeng` desc, `differanse` desc");

            // 4. Process the result set.
            ArrayList<String> teamNames = new ArrayList<>();
            while (myRs.next()) {
                teamNames.add(myRs.getString("lagnavn"));
                // System.out.println(myRs.getString("lagnavn") + ", " + myRs.getString("spilt"));
            }

            return teamNames;
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
}