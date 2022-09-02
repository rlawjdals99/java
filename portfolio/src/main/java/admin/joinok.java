package admin;

import java.io.IOException;
import java.io.*;
import java.sql.*;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class joinok extends HttpServlet {
	String aid,apw,anm,aemail,atel,ateam,aposition;
	protected PrintWriter pw = null;   
	protected Connection con = null;
	protected LocalDateTime now = null;
	private static final long serialVersionUID = 1L;
       
    public joinok() {
    	try {
    		dbconfig db = new dbconfig();
    		this.con = db.dbcon();
    		
		} catch (Exception e) {
		}
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		this.aid = request.getParameter("user_id");
		this.apw = request.getParameter("user_pw");
		this.anm = request.getParameter("user_nm");
		this.aemail = request.getParameter("user_email");
		this.atel = request.getParameter("user_tel");
		this.ateam = request.getParameter("user_team");
		this.aposition = request.getParameter("user_position");
		this.now = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String today = this.now.format(df);
		
		String sql = "insert into add_master values  ('0',?,?,?,?,?,?,?,'"+today+"','N')";
		
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ps.setString(1, this.aid);
			ps.setString(2, this.apw);
			ps.setString(3, this.anm);
			ps.setString(4, this.aemail);
			ps.setString(5, this.atel);
			ps.setString(6, this.ateam);
			ps.setString(7, this.aposition);
			System.out.println(ps);
			int n = ps.executeUpdate();
			String msg = null;
			
			if (n > 0) {
				this.pw.write("회원가입 되었습니다.");
				pw.write("<script>alert('회원가입이 완료되었습니다.'); location.href='./index.jsp'</script>");
			}
			else {
				pw.write("<script>alert('올바른 정보가 아닙니다.');</script>");
			}
			
		} catch (Exception e) {
			
		}
}
	}