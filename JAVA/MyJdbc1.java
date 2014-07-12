import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MyJdbc1 {
  public static void main(String[] args) throws Exception {

    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection conn = DriverManager.getConnection("jdbc:odbc:Arvind", "", "");



    Statement st = conn.createStatement();

   // ResultSet rs = st.executeQuery("SELECT empname,salary FROM EmployeeDemo where rollno=2");
//st.executeQuery("INSERT INTO EmployeeDemo VALUES (4,`'Kota',5000s)");
     ResultSet rs = st.executeQuery("SELECT * FROM Arvind");

    ResultSetMetaData rsMetaData = rs.getMetaData();
    int numberOfColumns = rsMetaData.getColumnCount();
    System.out.println("resultSet MetaData column Count=" + numberOfColumns);

    
    while(rs.next()==true)
    {
	//System.out.print(rs.getString("rollno"));
	System.out.print("\t"+rs.getString("sname"));
	System.out.print("\t"+rs.getString("sroll"));
	//System.out.println("\t"+rs.getString("dob")+"\n");
    }

    st.close();
    conn.close();
  }

 
}