<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@page import="com.winter.app.departments.DepartmentDTO"%>
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
	<h1>Update Form</h1>
	
	<form action="./update.do" method="post">
		<input type="hidden" name="department_id" value="<%=departmentDTO.getDepartment_id() %>" >
		<input type="text" name="department_name" value="<%= departmentDTO.getDepartment_name()%>">
		<input type="text" name="manager_id" value="<%= departmentDTO.getManager_id()%>">
		<input type="text" name="location_id" value="<%= departmentDTO.getLocation_id() %>" >
		<button type="submit">수정</button>
	</form>
</body>
</html>