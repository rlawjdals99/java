package reservation;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check_serv")
public class check_serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public check_serv() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8");
    	PrintWriter out = response.getWriter();

    	String rnumber = request.getParameter("rnumber");
    	String rname = request.getParameter("rname");
    	String rtel = request.getParameter("rtel");
    	String remail = request.getParameter("remail");
    	
    	ArrayList<String> al = new ArrayList<String>();    	
    	al.add(rnumber);
    	al.add(rname);
    	al.add(rtel);
    	al.add(remail);
    	check_select cs = new check_select();
    	if(cs.select(al)) {
    		out.print("<script>alert('확인 완료');location.href='http://192.168.100.211:8080/reser_system/reserve_info.jsp?rnumber="+rnumber+"'</script>");
//    		out.print("<script>alert('확인 완료');location.href='http://192.168.100.209:8080/reser_system/info?rnumber="+rnumber+"'</script>");
    	}
    	else {
    		out.print("<script>alert('확인 실패');history.go(-1);</script>");
    	}
    	
	}

}
