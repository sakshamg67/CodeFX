/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author saksham
 */
public class JDBC_connect {
    public static Connection connect_it() throws Exception{
    //public static void main(String[] args) throws Exception {
            Class.forName("com.mysql.jdbc.Driver");
            Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/algorithm_analysis", "root","");
//             Statement st = mycon.createStatement();
//           st.execute("create table hello(roll int)");
            return mycon;
    }
    
}
