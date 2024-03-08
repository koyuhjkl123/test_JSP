package com.keduit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.MemberDAO;
import com.keduit.dto.memberVO;

/**
 * Servlet implementation class MemberUpdateServlet
 */
@WebServlet("/memberUpdate.do")
public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid = request.getParameter("userid");
		
		MemberDAO mDAO = MemberDAO.getInstance();
		memberVO mvo = mDAO.getMember(userid);
		
		request.setAttribute("mvo", mvo);
		RequestDispatcher dispatcher = request.getRequestDispatcher("member/memberUpdate.jsp");
		
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
//		폼에서 입력한 정보 받아오기
		
		String name = request.getParameter("name");
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String admin = request.getParameter("admin");
		
		memberVO mvo = new memberVO(name, userid, pwd, email, phone, Integer.parseInt(admin));
		
		MemberDAO mDAO = MemberDAO.getInstance();
		int result = mDAO.updateMember(mvo);
		if(result == 1) {
			response.sendRedirect("login.do");
		}
		
		
	}

}
