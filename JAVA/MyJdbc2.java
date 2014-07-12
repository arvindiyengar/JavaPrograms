import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class MyJdbc2 
{
  	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
     		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
      	
    		Statement st = conn.createStatement();
    		ResultSet rs = st.executeQuery("SELECT * FROM stud");

		ResultSetMetaData rsMetaData = rs.getMetaData();
		int numberOfColumns = rsMetaData.getColumnCount();
    		System.out.println("resultSet MetaData column Count=" + numberOfColumns);

    		while(rs.next()==true)
    		{
			System.out.print(rs.getString(1));
			System.out.print("\t"+rs.getString(2));
			System.out.println("\t"+rs.getString(3));
    		}

	    	st.close();
    		conn.close();
  	}
}