package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class join_module {
	static String callsign = null;
	
	public void insert(ArrayList<String> datas) {
		try {
			LocalDateTime time = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String today = time.format(dtf);
			
			dbconfig dc = new dbconfig();
			Connection ct = dc.dbcon();
			String sql = "insert into add_master values  ('0',?,?,?,?,?,?,?,'"+today+"','N')";
			PreparedStatement ps = ct.prepareStatement(sql);
			ps.setString(1, datas.get(0));
			ps.setString(2, datas.get(1));
			ps.setString(3, datas.get(2));
			ps.setString(4, datas.get(3));
			ps.setString(5, datas.get(4));
			ps.setString(6, datas.get(5));
			ps.setString(7, datas.get(6));
			ps.setString(8, datas.get(7));
			int n = 0;
			n = ps.executeUpdate();
			if (n > 0) {
				this.callsign = "ok";
			}
			else {
				throw new Exception("error");

			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			this.callsign = "no";
		}
	}
	public String join_msg() {
		return this.callsign;
	}
}