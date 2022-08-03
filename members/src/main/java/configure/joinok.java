package configure;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class joinok extends HttpServlet {
	
	String mid,mpass,mname,memail,mtel,mpost,maddr1,maddr2;
	
	private static final long serialVersionUID = 1L;
       
    public joinok() {
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		this.mid = request.getParameter("userid");
		this.mpass = request.getParameter("userpw");
		this.mname = request.getParameter("usernm");
		this.memail = request.getParameter("useremail");
		this.mtel = request.getParameter("usertel");
		this.mpost = request.getParameter("addr1");
		this.maddr1 = request.getParameter("addr2");
		this.maddr2 = request.getParameter("addr3");

		join_module jm = new join_module();
		this.mpass = jm.pass_sc(this.mpass);	//base64변환
		ArrayList<String> ar = new ArrayList<String>();
		ar.add(this.mid);
		ar.add(this.mpass);
		ar.add(this.mname);
		ar.add(this.memail);
		ar.add(this.mtel);
		ar.add(this.mpost);
		ar.add(this.maddr1);
		ar.add(this.maddr2);
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
