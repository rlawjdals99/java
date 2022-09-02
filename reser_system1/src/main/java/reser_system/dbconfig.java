package reser_system;

import java.sql.*;

public class dbconfig {
	Connection ct = null;	
	public Connection getConnection() throws ClassNotFoundException,SQLException{
		String db = "com.mysql.jdbc.Driver";

		
		Class.forName(db);
		ct = DriverManager.getConnection(url,user,pw);
		return ct;
	}
}
