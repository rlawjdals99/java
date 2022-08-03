package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class index4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public index4() {
    	
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String pidx = request.getParameter("midx1");
		String point = request.getParameter("data1");
		
		try {
			dbconnect db = new dbconnect();
			Connection ct = db.ct();
			//update 적용시 select 후에 update가 진행 되어야 합니다.
			String sql = "update joinmember set mpoint=? where midx=?";
			PreparedStatement ps = ct.prepareStatement(sql);
			ps.setString(1,point);
			ps.setString(2,pidx);
			int n = 0;
			n = ps.executeUpdate();
			if (n > 0) {
				System.out.println("정상 수정 완료");
			}
			else {
				throw new Exception("error");
			}
			
			
			
		} catch (Exception e) {
			System.out.println("데이터 컬럼값 오류");
		}
		finally {
			
		}
	
	
	}

}
