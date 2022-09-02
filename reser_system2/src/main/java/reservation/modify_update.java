package reservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class modify_update {
	
	public boolean update(ArrayList<String> al) {
		tools t = new tools();
		boolean b = false;
		Connection con = t.dbcon();
		String sql = "update reser_user set rtel=?, remail=?, rpeople=?, rarrival=? where rnumber=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, al.get(3));
			ps.setString(2, al.get(4));
			ps.setString(3, al.get(5));
			ps.setString(4, al.get(6));
			ps.setString(5, al.get(7));
			int a = ps.executeUpdate();
			if(a>0) {
				b = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
	
}
