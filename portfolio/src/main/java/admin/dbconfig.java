package admin;
import java.sql.*;

public class dbconfig {

	protected Connection dbcon() throws ClassNotFoundException, SQLException{
			String driver = "com.mysql.jdbc.Driver";	
			String url = "jdbc:mysql://umj7-009.cafe24.com/andreas0805";
			String user = "andreas0805";
			String pw = "jeongminn99!";
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pw);
			
			return con;
	}
}