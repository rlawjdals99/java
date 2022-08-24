package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public loginck() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String aid = request.getParameter("user_id");
		try {
			login_module lm = new login_module();
			String data[] = {aid}; 
			lm.main(data);	//static에 메인으로 전송
			response.setContentType("text/html;charset=utf-8");
			PrintWriter pw = response.getWriter();
			String r = lm.result_check();	//getter형태로 로드
			if (r == null) {
				throw new Exception("error");
			}
			else {
				pw.print(r);
			}
		} catch (Exception e) {
			PrintWriter pw = response.getWriter();
			pw.print("데이터베이스 오류");
		}
	}
}