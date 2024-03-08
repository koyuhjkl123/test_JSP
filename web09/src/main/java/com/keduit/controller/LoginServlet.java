package com.keduit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.keduit.dao.MemberDAO;
import com.keduit.dto.memberVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String url = "member/login.jsp";
		
		HttpSession session = request.getSession();
		
//		로그인이 되어 있으면
		if(session.getAttribute("loginUser") != null) {
			url = "main.jsp";
		}
		
		// index.jsp에서 login.do로 이동
		// a태그는 doGet메서드로 login.jsp 이동
		// login.jsp에서 다시 login.do로 이동하여 doPost메서드로 이동하여 sysout를 출력
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("dopost==========");
		
		String url = "member/login.jsp"; // 로그인 실패 시
		
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		
		MemberDAO mDAO = MemberDAO.getInstance(); // 싱글톤
		
		int result = mDAO.userCheck(userid, pwd);
		
		// result 0: -> 비밀번호 틀림
		// result 1: -> 모두 일치
		// result -1: -> 아이디 없음
		
		if(result == 1) {
			
			memberVO mVO = mDAO.getMember(userid);
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mVO);
			request.setAttribute("message", "회원 로그인 성공!");
			url = "main.jsp";
		}else if(result == 0) {
			request.setAttribute("message", "비밀번호가 맞지 않습니다.");
		}else if(result == -1){
			request.setAttribute("message", "존재하지 않은 회원입니다.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}
