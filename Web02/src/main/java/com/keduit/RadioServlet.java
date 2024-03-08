package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RadioServlet
 */
@WebServlet("/RadioServlet")
public class RadioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		String gender = request.getParameter("gender");
		String chk_mail = request.getParameter("chk_mail");
		String content = request.getParameter("content");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head></head><body>");
		out.println("당신이 입력한 정보입니다. <br>");
		out.println("성별 : <b>");
		out.println(gender);
		out.println("</b><br>메일정보 수신 여부: <b>");
		out.println(chk_mail);
		out.println("</b><br>가입인사 : <b><pre>");
		out.println(content);
		out.println("</b></pre>");
		
//		체크박스
		String items[] = request.getParameterValues("item"); // item이라는 input
		if(items == null) {
			out.print("선택한 항목이 없습니다,");
		}else {
			out.print("당신이 선택한 항목입니다...<hr>");
			
			for(String item : items) {
				out.print(item + " ");
			}
		}
		out.println("<a href='javascript:history.go(-1)'>다시</a>");
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
