package com.keduit.controller.action;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.BoardDAO;
import com.keduit.dto.BoardVO;

public class BoardListAction implements Action {

	@Override
//	인터페이스 상속 받은 메소드
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url = "/board/boardList.jsp";
		
		BoardDAO bDAO = BoardDAO.getInstance();
		
		// List타입인 BoardVO클래스 boardlist(참조변수)
//		bDAO 변수 selectAllBoard 메서드 호출
//		해당 메서드 selectAll 검색
		List<BoardVO> boardlist = bDAO.selectAllBoard();
		
//		서버측에서 클라이언트로 데이터를 전달하기위한 데이터 키값을 사용
		request.setAttribute("boardList", boardlist);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
