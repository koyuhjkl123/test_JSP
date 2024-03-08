package com.keduit.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.BoardDAO;
import com.keduit.dto.BoardVO;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		BoardWriteAction 클래스는 해당 사용자 정보를 갖고옴
		BoardVO bVO = new BoardVO();
		bVO.setName(request.getParameter("name"));
		bVO.setPass(request.getParameter("pass"));
		bVO.setEmail(request.getParameter("email"));
		bVO.setTitle(request.getParameter("title"));
		bVO.setContent(request.getParameter("content"));
		
		BoardDAO bDAO = BoardDAO.getInstance();
		bDAO.insertBoard(bVO); // 저장된 get를 insertBoard 메서드로 해당 값을 전달
		
//		BoardList를 불러옴 / 게시글 등록하면 다시 불러와서 등록된 정보와 같이 불러온다.
		new BoardListAction().execute(request, response);
		
	}

}
