package admin;

import java.sql.*;

public class select_id{

	public static String results = null;
	
	public void oksign(String a) {
		this.results = a;
	}
	
	public String result_check() {
		return this.results;
	}
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		dbconfig db = new dbconfig();
		Connection con = db.dbcon();
		
		String sql = "select * from add_master where aid='"+args[0]+"'";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		String backdata = null;
		if (rs.next() == true) {
			backdata = "no";
		}
		else {		
			backdata = "ok";
		}
		select_id si = new select_id();
		si.oksign(backdata);
	}
}
