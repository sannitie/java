/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author snorr
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // 1. Get a connection to database.
            Connection myConn = DriverManager.getConnection("jdbc:mysql://201db.gnorli.no:3306/Testnicolay?autoReconnect=true&useSSL=false", "Snorre", "Mongoper!");

            // 2. Create a statement.
            Statement myStmt = myConn.createStatement();

            // 3. Execute a SQL query.
            ResultSet myRs = myStmt.executeQuery("select * from lag order by `Poeng` desc, `differanse` desc");

            // 4. Process the result set.
            while (myRs.next()) {
                ArrayList<String> lagList = new ArrayList<>();
                ArrayList<String> spiltList = new ArrayList<>();
                lagList.add(myRs.getString("lagnavn"));
                spiltList.add(myRs.getString("spilt"));
                for (int i = 0; i < lagList.size(); i++) {
                    System.out.println(lagList.get(i));
                }
                for (int i = 0; i < spiltList.size(); i++) {
                    System.out.println(spiltList.get(i));
                }
                // System.out.println(myRs.getString("lagnavn") + ", " + myRs.getString("spilt"));
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

}
