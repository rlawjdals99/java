package configure;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class review extends HttpServlet {
	
	protected PrintWriter pr = null;
	protected Connection con = null;
	protected LocalDateTime now = null;
	String p_nm,p_pd,p_view;
	
	
	private static final long serialVersionUID = 1L;
	
    public review() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	this.p_nm = request.getParameter("usernm");
	this.p_pd = request.getParameter("product");
	this.p_view = request.getParameter("text");
	this.now = LocalDateTime.now();
	DateTimeFormatter df = DateTimeFormatter.ofPattern("YYYY-MM-dd- HH:mm:ss");
	String today = this.now.format(df);
	String sql = "insert into pd_review (pidx,pnm,ppd,pview,pdate) values "
			+ "('0','"+this.p_nm+"','"+this.p_pd+"','"+this.p_view+"','"+today+"')";
	
	}

}
