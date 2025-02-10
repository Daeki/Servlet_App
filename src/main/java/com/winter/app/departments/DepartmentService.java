package com.winter.app.departments;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.winter.app.ActionForward;

public class DepartmentService {
	
	private DepartmentDAO departmentDAO;
	
	public DepartmentService() {
		this.departmentDAO = new DepartmentDAO();
	}
	
	
	public ActionForward getList(HttpServletRequest request, ActionForward actionForward)throws Exception{
		List<DepartmentDTO> ar = departmentDAO.getList();
		request.setAttribute("list", ar);
		
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/departments/list.jsp");
		return actionForward;
	}
	
	public ActionForward getDetail(HttpServletRequest request, ActionForward actionForward)throws Exception{
		String id=request.getParameter("department_id");
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_id(Long.parseLong(id));
		departmentDTO = departmentDAO.getDetail(departmentDTO);
		request.setAttribute("dto", departmentDTO);
		
		
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/departments/detail.jsp");
		return actionForward;
	}
	
	public void add(HttpServletRequest request, ActionForward actionForward)throws Exception{
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_name(request.getParameter("department_name"));
		departmentDTO.setManager_id(Long.parseLong(request.getParameter("manager_id")));
		departmentDTO.setLocation_id(Long.parseLong(request.getParameter("location_id")));
		int result = departmentDAO.add(departmentDTO);
		String str="부서 등록 실패";
		if(result>0) {
			str ="부서 등록 성공";
		}
		request.setAttribute("result", str);
		actionForward.setFlag(true);
		actionForward.setPath("/WEB-INF/views/commons/result.jsp");
	}

}
