package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamServlet
 */
@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8"); // 한글 처리
		
		String id = request.getParameter("id"); // param.jsp의 있는 아이디에 있는 name id를 갖고옴
		String age = request.getParameter("age"); // param.jsp의 있는 나이에 있는 name age를 갖고옴
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head></head><body>");
		out.println("<h1>당신이 입력한 자료입니다.</h1>");
		out.println("아이디 : " + id);
		out.println("<br>");
		out.println("나이 : " + age);
		out.println("<br><a href='javascript:history.go(-1)'>다시입력</a>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response); // 내용만 넘겨주면 doGet메소드에서 활용
//		System.out.println("doPost!!!");
	}

}
