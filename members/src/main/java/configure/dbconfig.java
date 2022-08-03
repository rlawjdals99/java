package configure;

import java.sql.*;

public class dbconfig {	//SQL 환경설정

	protected Connection dbcon() throws ClassNotFoundException, SQLException{		
		String dbdrive = "com.mysql.jdbc.Driver";
//		String dburl = "jdbc:mysql://localhost:3306/webmail";
//		String dbuser = "andreas0805";
//		String dbpw = "a123456";

		String dburl = "jdbc:mysql://umj7-009.cafe24.com/andreas0805";
		String dbuser = "andreas0805";
		String dbpw = "a123456";
//		umj7-009.cafe24.com/WebMysql
		
		
		
		
		Class.forName(dbdrive);//JDBC 클래스 로드명
		Connection con = DriverManager.getConnection(dburl,dbuser,dbpw);
		
		return con;
	}
	
	
	
}
