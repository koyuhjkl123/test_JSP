package com.keduit;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdditionServlet02
 */
@WebServlet("/add02")
public class AdditionServlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1 = 100;
		int num2 = 200;
		int sum = num1 + num2;
		
		String names = "Hello word";
		
		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2); // key : value
		request.setAttribute("sum", sum);
		request.setAttribute("names", names);
		
//		JSP 연동 request 요청 > jsp에게 jsp은 받아서 응답 화면을
		RequestDispatcher dispatcher = request.getRequestDispatcher("addition03.jsp");
		dispatcher.forward(request, response);
	}

}
