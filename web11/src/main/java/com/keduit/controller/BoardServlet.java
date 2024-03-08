package com.keduit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.controller.action.Action;

/**
 * Servlet implementation class BoardServlet
 */
@WebServlet("/BoardServlet")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		아래에 있는 해당 구문은 전략패턴? 사용
		
//		command변수는 다양한 String 값을 받아올 수 있다.
		String command = request.getParameter("command");
		System.out.println("BoardServlet 요청을 받음 : " + command);
		
		ActionFactory af = ActionFactory.getInstance(); // 클래스의 유일한 인스턴스를 얻기 위해 getInstance() 메서드를 호출
		
		Action action = af.getAction(command);
		
		if(action != null) {
			action.execute(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
		
		
	}

}
