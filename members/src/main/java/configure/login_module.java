package configure;

import java.sql.*;

public class login_module {

	public static String results = null;
	
	public void oksign(String a) {
		this.results = a;
//		System.out.println(this.results);
	}
	
	public String result_check() {
		return this.results;
	}
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		dbconfig db = new dbconfig();
		Connection con = db.dbcon();
		
		String sql = "select * from person where mid='"+args[0]+"'";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
//		System.out.println(rs);
		String backdata = null;
		if (rs.next() == true) {	//true : 데이터가 있음
			backdata = "no";
		}
		else {		//false : 데이터가 없음
			backdata = "ok";
		}
		login_module lg = new login_module();
		lg.oksign(backdata);
	}
}
