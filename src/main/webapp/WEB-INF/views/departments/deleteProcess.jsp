<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("department_id");
	DepartmentDTO departmentDTO = new DepartmentDTO();
	departmentDTO.setDepartment_id(Long.parseLong(id));
	
	DepartmentDAO departmentDAO = new DepartmentDAO();
	int result = departmentDAO.delete(departmentDTO);
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% if(result>0){ %>
		<h3>부서 삭제 성공</h3>
	<%}else { %>
		<h3>부서 삭제 실패</h3>
	<%} %>
	<a href="/">Home</a>
	<a href="./list.jsp">부서 리스트</a>
</body>
</html>