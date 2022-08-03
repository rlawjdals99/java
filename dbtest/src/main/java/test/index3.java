package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class index3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected PrintWriter pr = null;   
	protected Connection con = null;
	protected LocalDateTime now = null;
	String mname,mid,mpw,memail;
	
    public index3() {
    	try {
    		dbconnect db = new dbconnect();
    		this.con = db.ct();
			
		} catch (Exception e) {
			this.pr.write("<script>console.log('DB접속오류')</script>");
		}
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		this.mname = request.getParameter("join_nm");
		this.mid = request.getParameter("join_id");
		this.mpw = request.getParameter("join_pw");
		this.memail = request.getParameter("join_email");
		this.now = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");
		String today = this.now.format(df);
		int point = 1000;
		//auto_increment 컬럼값도 적용해야함
		String sql = "insert into joinmember (midx,mname,mid,mpass,memail,mpoint,mdate) values"
		+ " ('0','"+this.mname+"','"+this.mid+"','"+this.mpw+"','"+this.memail+"','"+point+"','"+today+"')";
		// midx를 ?로 할 경우 1부터 시작됨
//		System.out.println(sql);
		try {
			PreparedStatement pr = this.con.prepareStatement(sql);
			int oksign = 0;
			oksign = pr.executeUpdate();
			response.setContentType("text/html;charset=utf-8");
			this.pr = response.getWriter();
			if (oksign > 0) {
				this.pr.write("회원가입 정상 진행");
			}
			else {
			this.pr.write("DB 컬럼 문제 발생");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
//		System.out.println(this.mname+this.mid+this.mpw+this.memail);
		
		
		
	}
	

}
