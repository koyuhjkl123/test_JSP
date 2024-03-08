package com.keduit.controller.action;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.dao.EmployeeDAO;
import com.keduit.dto.EmployeeVO;
import com.keduit.util.DBManager;

public class EmployeeCreateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		EmployeeVO bvo = new EmployeeVO();

		String lev = request.getParameter("lev");
		String gender = request.getParameter("gender");
		String enterParameter = request.getParameter("enter");

		try {
			 SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	            java.util.Date parsedDate = inputDateFormat.parse(enterParameter);
	            Timestamp enterTimestamp = new Timestamp(parsedDate.getTime());
	            
	            bvo.setEnter(enterTimestamp);
	            bvo.setUserid(request.getParameter("userid"));
	    		bvo.setPass(request.getParameter("pass"));
	    		bvo.setName(request.getParameter("name"));
	    		bvo.setPhone(request.getParameter("phone"));
	    		if (lev.equals("A")) {
	    			bvo.setLev("운영자");
	    		} else {
	    			bvo.setLev("일반회원");
	    		}

	    		if (gender.equals("1")) {
	    			bvo.setGender("남자");
	    		} else {
	    			bvo.setGender("여자");
	    		}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		

		EmployeeDAO bDAO = EmployeeDAO.getInstance();
		bDAO.employeeInsert(bvo);

		new EmployeeListAction().execute(request, response);

	}

}
