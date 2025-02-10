<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	DepartmentDTO departmentDTO = (DepartmentDTO)request.getAttribute("dto");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Department Detail Page</h1>
	
	<% if(departmentDTO != null){ %>
		<h3><%= departmentDTO.getDepartment_id() %></h3>
		<h3><%= departmentDTO.getDepartment_name() %> </h3>
		<h3><%= departmentDTO.getManager_id() %> </h3>
		
		<a href="./update.do?department_id=<%= departmentDTO.getDepartment_id() %>">부서 수정</a>
		<a href="./delete.do?department_id=<%= departmentDTO.getDepartment_id() %>">부서삭제</a>
	
	<%}else { %>
		<h3>없는 부서</h3>
	<%} %>
</body>
</html>