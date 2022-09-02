package reservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class check_select {
	public boolean select(ArrayList<String> al) {
		tools t = new tools();
		Connection con = t.dbcon();
		String sql = "select * from reser_user where rnumber = ? and ruser=? and rtel=? and remail=?";
		boolean b = false;
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			for(int i =0; i<al.size();i++) {
				ps.setString(i+1, al.get(i));
			}
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				b = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
}
