package configure;
import java.sql.*;

//MVC : Module 파트
public class loginok_module {
	protected Connection ct = null;
	String u = null;
	String p = null;
	String n = null;
	String msg = null;
	
	public void user(String userid) {
		this.u = userid;
	}
	public void pass(String userpw) {
		this.p = userpw;
	}
	public void message(String message) {
		this.msg = message;
	}

	//클래스 형태의 메소드 getter, setter 사용이유 : 자료형에 구분없이 사용하기 위함
	public loginok_module getter(String userid, String userpw) {
		loginok_module ld = null;
		try {
			dbconfig dc = new dbconfig();
			this.ct = dc.dbcon();
			ld = new loginok_module();	//class 인스턴스 적용
			/* 중요
			   sql 문법은 해당 값이 잘못되었을 경우 또는 필드명이 잘못되었을 경우
			   해당 문법을 세그먼트를 꼭 출력해서 확인해야 함
			   암호화가 있을 경우 무조건 암호화 값이 들어가야만 확인 정상적으로 이루어 짐
			   
			   해당 필드값만 가져와서 사용할 경우 각각의 필드명을 입력	*/
			
			
			String sql = "select mid, mname from person where mid=? and mpass=?";
			PreparedStatement ps = this.ct.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, userpw);
//			System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			if (rs.next() == false) {
				ld.message("nojoin");
			}
			else {
				ld.message("okjoin");
				this.n = rs.getString("mname");
				
				
				
			}
			
			
			
			ld.user(userid);	//void method로 this를 적용시킴 = loginok.java에서 this값을 바로 load하기 위함
			ld.pass(userpw);
		}
		catch (Exception e) {
			}	
			
		
				return ld;
	}
	
	
	
}