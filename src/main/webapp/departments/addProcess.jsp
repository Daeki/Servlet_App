<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	DepartmentDTO departmentDTO = new DepartmentDTO();
	String name = request.getParameter("department_name");
	String manager = request.getParameter("manager_id");
	String location = request.getParameter("location_id");
	
	departmentDTO.setDepartment_name(name);
	departmentDTO.setManager_id(Long.parseLong(manager));
	departmentDTO.setLocation_id(Long.parseLong(location));
	
	DepartmentDAO departmentDAO = new DepartmentDAO();
	int result = departmentDAO.add(departmentDTO);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>부서 등록 진행 페이지</h1>

	<% if(result>0){ %>
		<h3>부서 등록 성공</h3>	

	<%}else { %>
		<h3>부서 등록 실패</h3>

	<%} %>
	
	<a href="/">Home</a>
	<a href="./list.jsp">부서 리스트</a>
</body>
</html>