package com.keduit.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.BoardDAO;
import com.keduit.dto.BoardVO;

public class BoardCheckPassAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String num = request.getParameter("num");
		String pass = request.getParameter("pass");
		
		String url = null;
		BoardDAO bDAO = BoardDAO.getInstance();
		BoardVO bVO = bDAO.selectOne(num);
		
		if(pass.equals(bVO.getPass())) {
			url = "board/checkSuccess.jsp";
		}else {
			url = "board/boardCheckPass.jsp";
			request.setAttribute("message", "비밀번호가 틀렸습니다");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
