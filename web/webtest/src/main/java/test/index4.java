package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.group.Response;

public class index4 extends HttpServlet {
	PrintWriter pr = null;
	private static final long serialVersionUID = 1L;
       
    public index4() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		//request.getMethod() : html에서 POST, GET, PUT 중 무엇인지 확인가능
//		System.out.println(request.getMethod());
		
		
		
		String m = request.getParameter("userid").intern();
		this.pr = response.getWriter();
		if(m == "") {
			//this.pr.print : ajax post, get으로 넘을때 응답만 받아야 할 경우
			this.pr.print("error");
		}
		else if(m == "hong"){	//아이디가 중복 되었을 대 ajax return
			this.pr.print("no");
		}
		else {	//아이디가 중복 되지 않았을 때 ajax return
			this.pr.print("ok");
		}
		
		System.out.println(m);
	
		
		
		
	}

}
