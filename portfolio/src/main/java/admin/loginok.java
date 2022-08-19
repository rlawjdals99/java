package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginok extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public loginok() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
			String user_id = request.getParameter("user_id");
			String user_pw = request.getParameter("user_pw");
			
			
			try {
				loginok_module lm = new loginok_module();
				loginok_module lm2 = lm.getter(user_id, user_pw);
				
				response.setContentType("text/html;charset=utf-8");
				PrintWriter pr = response.getWriter();
				if (lm2.msg == "nojoin") {	
					pr.write("<script>alert('아이디 및 패스워드를 다시 확인하세요.'); history.go(-1);</script>");
				}
				else {	
					HttpSession session = request.getSession();
					session.setAttribute("aid",lm2.user);
					session.setAttribute("anm",lm2.name);
					
					pr.write("<script>alert('로그인 되었습니다.'); location.href='.//admin_main.jsp';</script>");
				}
				System.out.println(lm2.msg);
				
			} catch (Exception e) {
			}
	}
}