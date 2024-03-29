package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class index2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public index2() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* DB Connect 부분은 별도 java를 생성하여 지속적으로 로드할 수 있도록 적용하게 됩니다. */
		try {
			dbconnect db = new dbconnect();
			Connection con = db.ct();
//			System.out.println(con);
			request.setCharacterEncoding("utf-8");
			String mid = request.getParameter("mid");
			
			// select * from : 세그먼트 문법
			// '"+mid+"' : 일반 세그먼트 방식
			// ? : 프리페이더 세그먼트 방식
			//String sql = "select * from shopmember where suser='"+mid+"'";
			String sql = "select * from shopmember where suser=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			//setString : 값을 대입시킬 때 사용
			//getString : 값을 가져올 때 사용
			
			ResultSet rs = ps.executeQuery();
			
			response.setContentType("text/html;charset=utf-8");
			PrintWriter pr = response.getWriter();
			while (rs.next()) {
				String user = rs.getString("suser");
				String userpw = rs.getString("spasswd");
				pr.print("해당 정보 확인. <br>아이디 : " 
				+ user + "<b r>패스워드 : " + userpw);

			}
			
			
//			db = null;
//			con.close();	//DB 접속종료 (외부 class 사용시에만 적용함)
			//Servlet에는 무조건 한번만 작동함
		} catch (Exception e) {
//			e.getMessage();
			System.out.println("DB 연결실패");
		}
		
		
	}

}
