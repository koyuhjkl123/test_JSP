package com.keduit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keduit.controller.action.Action;
import com.keduit.controller.action.EmployeeCreateAction;
import com.keduit.controller.action.EmployeeCreateFormAction;
import com.keduit.controller.action.EmployeeDelteFormAction;
import com.keduit.controller.action.EmployeeListAction;
import com.keduit.controller.action.EmployeeUpdateAction;
import com.keduit.controller.action.EmployeeUpdateFormAction;
import com.keduit.controller.action.EmployeeViewFormAction;

public class ActionFactory{
	
	private ActionFactory() {};
	
	private static ActionFactory instance = new ActionFactory();
	
	public static ActionFactory getInstance() {
		return instance;
	}

	
	
	public Action getAction(String command) {
		
		Action action = null;
		
		System.out.println(command);
//		command 변수값을 정함
		if(command.equals("employee_list")) {
			action = new EmployeeListAction();
		}else if(command.equals("employee_form_create")) {
			action = new EmployeeCreateFormAction();
		}else if(command.equals("employee_create")) {
			action = new EmployeeCreateAction();
		}else if(command.equals("employee_form_view")) {
			action = new EmployeeViewFormAction();
		}else if(command.equals("employee_form_update")) {
			action = new EmployeeUpdateFormAction();
		}else if(command.equals("employee_update")) {
			action = new EmployeeUpdateAction();
		}else if(command.equals("employee_form_delete")) {
			action = new EmployeeDelteFormAction();
		}
		
		return action;
	}

}
