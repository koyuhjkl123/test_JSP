package com.keduit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdditionServlet01
 */
@WebServlet("/AdditionServlet01")
public class AdditionServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdditionServlet01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get 방식으로 요청 올떄 Get방식으로 처리
		int num1 = 20;
		int num2 = 10;
		int sum = num1 + num2;
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Addition</title></head>");
		out.println("<body>");
		out.println("<h1>계산기</h1>");
		out.println(num1 + " + " + num2 + " = " + sum);
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Post 요청 올떄 Post방식으로 처리
		doGet(request, response);
	}

}
