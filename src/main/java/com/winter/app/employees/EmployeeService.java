package com.winter.app.employees;

import javax.servlet.http.HttpServletRequest;

import com.winter.app.ActionForward;

public class EmployeeService {
	
	private EmployeeDAO employeeDAO;
	
	public EmployeeService() {
		employeeDAO = new EmployeeDAO();
	}
	
	public void login(HttpServletRequest request, ActionForward actionForward)throws Exception{
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmployee_id(Long.parseLong(request.getParameter("employee_id")));
		employeeDTO.setPassword(request.getParameter("password"));
		employeeDTO = employeeDAO.login(employeeDTO);
		
		if(employeeDTO != null) {
			//index
		}else {
			//
			request.setAttribute("result", "로그인 실패");
			request.setAttribute("path", "./login.do");
			actionForward.setFlag(true);
			actionForward.setPath("/WEB-INF/views/commons/result.jsp");
			
		}
		
	}
	
	public void add(HttpServletRequest request, ActionForward actionForward)throws Exception{
		EmployeeDTO employeeDTO = new EmployeeDTO();
//		employeeDTO.setFirst_name(request.getParameter("first_name"));
//		employeeDTO.setLast_name(request.getParameter("last_name"));
//		employeeDTO.setEmail(request.getParameter("email"));
//		employeeDTO.setPhone_number(request.getParameter("phone_number"));
//		employeeDTO.setJob_id(request.getParameter("job_id"));
//		employeeDTO.setSalary(Double.parseDouble(request.getParameter("salary")));
//		employeeDTO.setCommission_pct(Double.parseDouble(request.getParameter("commission_pct")));
//		employeeDTO.setManager_id(Long.parseLong(request.getParameter("manager_id")));
//		employeeDTO.setDepartment_id(Long.parseLong(request.getParameter("department_id")));
//		employeeDTO.setPassword(request.getParameter("password"));
//		
//		int result = employeeDAO.add(employeeDTO);
		
		//  /index.do
		actionForward.setFlag(false);
		actionForward.setPath("../index.do");
	}

}
