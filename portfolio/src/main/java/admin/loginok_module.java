package admin;
import java.sql.*;

public class loginok_module {
	protected Connection ct = null;
	String user = null;
	String pass = null;
	String name = null;
	String msg = null;
	
	public void user(String user_id) {
		this.user = user_id;
	}
	public void pass(String user_pw) {
		this.pass = user_pw;
	}
	public void message(String message) {
		this.msg = message;
	}

	public loginok_module getter(String user_id, String user_pw) {
		loginok_module ld = null;
		try {
			dbconfig dc = new dbconfig();
			this.ct = dc.dbcon();
			
			String sql = "select aid from add_master where aid=? and apw=?";
			PreparedStatement ps = this.ct.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setString(2, user_pw);
			ResultSet rs = ps.executeQuery();
			if (rs.next() == false) {
				ld.message("nojoin");
			}
			else {
				ld.message("okjoin");
				this.name = rs.getString("anm");
			}
			ld.user(user_id);	
			ld.pass(user_pw);
		}catch (Exception e) {
			}	
				return ld;
	}
}