import java.sql.*;
import java.io.*;
class lib
{
    public static void main(String args[])
    {
        Connection con;//interface
        Statement stmt;//interface
        ResultSet rs;//class
        try{

       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       con=DriverManager.getConnection("jdbc:odbc:mani");
       stmt=con.createStatement();
                   System.out.println("Connection Established");
                   String ret="Select * from book";
                   rs=stmt.executeQuery(ret);
                   while(rs.next())
                   {
                       String a;
                       int b;
                       a=rs.getString(1);
                       b=rs.getInt(2);
                       System.out.println("Name" + a  +  "Number"  + b);
                   }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }

}