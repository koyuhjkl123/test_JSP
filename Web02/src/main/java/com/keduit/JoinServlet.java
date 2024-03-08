package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/JoinServlet")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out =  response.getWriter();
		
		out.print("<html><body>");
		String name = request.getParameter("name"); // 이름값
		String jumin = request.getParameter("jumin_1") + "-" + request.getParameter("jumin_2");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		
		if(request.getParameter("email_dns").trim() == ""){
			email += "@" + request.getParameter("emailaddr");
		}else {
			email += "@" + request.getParameter("email_dns");
		};
		
		
		String zip = request.getParameter("zip");
		String addr = request.getParameter("addr1") + request.getParameter("addr2");
		String phone = request.getParameter("phone");
		String job = request.getParameter("job");
		String interests[] = request.getParameterValues("interest");
		
		out.print("이름 : " + name +"<br>");
		out.println("주민번호 : " + jumin+"<br>");
		out.println("아이디 : " + id+"<br>");
		out.println("비밀번호 : " + pwd+"<br>");
		out.println("이메일 : " + email+"<br>");
		out.println("우편번호 : " + zip+"<br>");
		out.println("주소 : " + addr+"<br>");
		out.println("전화 : " + phone+"<br>");
		out.println("직업 : " + job+"<br>");
		out.println("관심분야 : ");
		
		if(interests == null) {
			out.print("선택한 항목이 없습니다.");
		}else {
			for(String interest: interests) {
				out.print(interest + " ");
			}
		}
		
		out.println("<br><a href='javascript:history.go(-1)'>다시</a></body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
