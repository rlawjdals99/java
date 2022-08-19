package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class joinok extends HttpServlet {
	
	String aid,apw,anm,aemail,atel,ateam,aposition;
	
	private static final long serialVersionUID = 1L;
       
    public joinok() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		this.aid = request.getParameter("user_id");
		this.apw = request.getParameter("user_pw");
		this.anm = request.getParameter("user_nm");
		this.aemail = request.getParameter("user_email");
		this.atel = request.getParameter("user_tel");
		this.ateam = request.getParameter("user_team");
		this.aposition = request.getParameter("user_position");
	
		join_module jm = new join_module();
		ArrayList<String> ar = new ArrayList<String>();
		ar.add(this.aid);
		ar.add(this.apw);
		ar.add(this.anm);
		ar.add(this.aemail);
		ar.add(this.atel);
		ar.add(this.ateam);
		ar.add(this.aposition);
		jm.insert(ar);

		String r = jm.join_msg().intern();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pr = response.getWriter();
		if (r == "ok") {
			pr.print("<script>alert('회원가입이 정상적으로 진행되었습니다.'); location.href='./index.html';</script>");
		}
		else {
			pr.print("<script>alert('데이터가 올바르지 않습니다.');history.go(-1)</script>");
		}

	
	}

}
