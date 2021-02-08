package minor_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Minor_Project {
    static void data(int time[],int[] size, int n,String s1) throws SQLException, Exception
    {
            Connection mycon = JDBC_connect.connect_it();
            Statement st = mycon.createStatement();
           for(int i=0;i<n;i++)
           {
               String s="insert into "+s1+" values("+size[i]+","+time[i]+")";
              // String s="insert into nlogn values(0,0)";
          st.executeUpdate(s);
           }
    }
    public static void main(String[] args) {
        }
    }
