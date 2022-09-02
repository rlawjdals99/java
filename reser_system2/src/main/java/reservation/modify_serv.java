package reservation;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/modify_serv")
public class modify_serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public modify_serv() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
    	PrintWriter out = response.getWriter();
    	
    	info_select iv = new info_select();
    	String rnumber = request.getParameter("rnumber");
    	ArrayList<info_select> al1 = iv.select(rnumber);
    	ArrayList<String> al = new ArrayList<String>();
    	Enumeration em = request.getParameterNames();
    	while(em.hasMoreElements()) {
			String a = (String)em.nextElement();
			String b = request.getParameter(a);
			if(a.equals("rarrival")) {
				b = al1.get(0).getRarrival().substring(0,10)+" " + b + al1.get(0).getRarrival().substring(16,19);
				System.out.println(b);
			}
			al.add(b);
		}
    	al.add("0001-01-01 01:00:00");
    	modify_update mu = new modify_update();
    	if(mu.update(al)) {
    		out.print("<script>alert('수정성공');location.href='http://192.168.100.209:8080/reser_system/modify?rnumber=12345678';</script>");
    	}
    	else {
    		out.print("<script>alert('수정실패');history.go(-1);</script>");
    	}
	}

}
