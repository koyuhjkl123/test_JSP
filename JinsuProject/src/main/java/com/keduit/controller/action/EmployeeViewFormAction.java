package com.keduit.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.EmployeeDAO;
import com.keduit.dto.EmployeeVO;

public class EmployeeViewFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url = "/employee/employee_view.jsp";
		
		String userid = request.getParameter("userid");
		System.out.println(userid);
		EmployeeVO bvo = new EmployeeVO();
		
		EmployeeDAO eDAO = EmployeeDAO.getInstance();
		
		bvo = eDAO.selectOne(userid);

		request.setAttribute("employee", bvo);

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);

	}

}
