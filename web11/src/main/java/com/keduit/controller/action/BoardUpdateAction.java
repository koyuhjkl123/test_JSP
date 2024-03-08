package com.keduit.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.BoardDAO;
import com.keduit.dto.BoardVO;

public class BoardUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "/board/boardList.jsp";
		String num = request.getParameter("num");
		
		BoardDAO bDAO = BoardDAO.getInstance();
		
		BoardVO bVO = new BoardVO();
		
//		업데이트를 하기 위한 값을 불러온다.
		bVO.setEmail(request.getParameter("email"));
		bVO.setPass(request.getParameter("pass"));
		bVO.setTitle(request.getParameter("title"));
		bVO.setContent(request.getParameter("content"));
		bVO.setNum(Integer.parseInt(num));
		
		bDAO.updateBoard(bVO);
		
		List<BoardVO> bVO2 = bDAO.selectAllBoard();
		request.setAttribute("boardList", bVO2);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
			

	}

}
