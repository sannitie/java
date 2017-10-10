package slit.db;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.ejb.Stateless;

@Stateless
public class DatabaseInformationRetriever implements UserManager {

    public DatabaseInformationRetriever() {

    }

    @Override
    public boolean usernameCompare(String username) {
        boolean condition = true;
        try {
            // 0. Register MySQL driver class
            DriverManager.registerDriver((java.sql.Driver) Class.forName("com.mysql.jdbc.Driver").newInstance());

            // 1. Get a connection to database.
            Connection myConn = DriverManager.getConnection("jdbc:mysql://201db.gnorli.no:3306/sslit?autoReconnect=true&useSSL=false", "Snorre", "Mongoper!");

            // 2. Create a statement.
            Statement myStmt = myConn.createStatement();

            // 3. Execute a SQL query.
            ResultSet myRs = myStmt.executeQuery("select * from user");

            // 4. Process the result set.
            while (myRs.next()) {
                condition = myRs.getString("username").equals(username);
            }

            return condition;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException t) {
            throw new RuntimeException(t);
        }
    }

    @Override
    public boolean passwordCompare(String password) {
        return false;
    }
}
