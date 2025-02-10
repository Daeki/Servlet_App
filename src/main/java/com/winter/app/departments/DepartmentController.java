package com.winter.app.departments;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DepartmentController
 */
@WebServlet("/DepartmentController")
public class DepartmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DepartmentDAO departmentDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentController() {
        super();
        // TODO Auto-generated constructor stub
        departmentDAO = new DepartmentDAO();
    }

	/**
	 *  서버 요청시 
	 *  1. URL(ip:port/경로)
	 *  2. 메서드 형식
	 *  	1) GET 
	 *  		* 단순 요청시
	 *  		* 파라미터가 주소창에 노출(파라미터가 Header에 담김)
	 *  		* 작은 용량을 보낼때 사용
	 *  	2) POST
	 *  		* 보안에 요구되는 요청시
	 *  		* 파라미터가 주소창에 노출X (파라미터가 Body에 담김)
	 *  		* 큰 용량을 보낼 때 사용
	 *  
	 *  3. 메서드 결정
	 *  	1) 주소창에 URL 직접 입력 - GET
	 *  	2) A 태그 사용         - GET
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//StringBuffer url = request.getRequestURL();
		String uri = request.getRequestURI();
				
		uri = uri.substring(uri.lastIndexOf("/")+1);
		
		String path="";
		
		try {
			switch(uri) {
			case "list.do":
				path="/WEB-INF/views/departments/list.jsp";
				
				List<DepartmentDTO> ar = departmentDAO.getList();		
				//attribute : 속성 (키:String , 값:Object)
				//          
				request.setAttribute("list", ar);				
				break;
			case "detail.do":
				path="/WEB-INF/views/departments/detail.jsp";
				String id=request.getParameter("department_id");
				DepartmentDTO departmentDTO = new DepartmentDTO();
				departmentDTO.setDepartment_id(Long.parseLong(id));
				departmentDTO = departmentDAO.getDetail(departmentDTO);
				request.setAttribute("dto", departmentDTO);
				break;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher view = request.getRequestDispatcher(path);
		view.forward(request, response);		
		
		

		
//		try {
//			DepartmentDAO departmentDAO = new DepartmentDAO();
//			List<DepartmentDTO> ar = departmentDAO.getList();		
//			//attribute : 속성 (키:String , 값:Object)
//			//          
//			request.setAttribute("list", ar);
//			
//			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/departments/list.jsp");
//			view.forward(request, response);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	


}
