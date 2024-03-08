package com.keduit.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.EmployeeDAO;
import com.keduit.dto.EmployeeVO;

public class EmployeeUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String url = "/employee/employee_List.jsp";
		
		String userid = request.getParameter("userid");
		
		
		EmployeeDAO eDAO = EmployeeDAO.getInstance();
		
		EmployeeVO bvo = new EmployeeVO();
		
		
		bvo.setUserid(request.getParameter("userid"));
		bvo.setPass(request.getParameter("pass"));
		bvo.setName(request.getParameter("name"));
		
		bvo.setPhone(request.getParameter("phone"));
		
		if(request.getParameter("lev").equals("운영자")) {
			bvo.setLev("A");
		}else {
			bvo.setLev("B");
		}
		if(request.getParameter("gender").equals("남자")) {
			bvo.setGender("1");
		}else {
			bvo.setGender("2");
		}
		
		eDAO.employeeUpdate(bvo, userid);
		
		List<EmployeeVO> evo = eDAO.selectAllEmployee();
		request.setAttribute("employee", evo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		

	}

}
