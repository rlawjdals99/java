package admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class id_check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public id_check() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String aid = request.getParameter("user_id");
		try {
			select_id sd = new select_id();
			String data[] = {aid}; 
			sd.main(data);
			PrintWriter pw = response.getWriter();
			String r = sd.result_check();	
			if (r == null) {
				throw new Exception("error");
			}
			else {
				pw.print(r);
			}
		} catch (Exception e) {
		}
	}
}