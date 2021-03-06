package kr.co.ezenac02;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login4")
public class LoginServlet04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget 메서드 호출");
		doHandle(request,response);		//get방식으로 요청시 다시 dohandle()을 호출함
	}
	private void doHandle(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("dohandle 메서드 호출");
		
		String userId = request.getParameter("user_id");
		String userPw = request.getParameter("user_pw");
		
		System.out.println("아이디 : "+userId);
		System.out.println("패스워드 : " + userPw);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost 메서드 호출");
		doHandle(request,response);		//post방식으로 요청시 다시 dohandle을 이용함
	}

}
