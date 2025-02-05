<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String p1 = request.getParameter("p1");
	String p2 = request.getParameter("p2");
	String p3 = request.getParameter("p3");	
	String p4 = request.getParameter("p4");	
	String [] p5 = request.getParameterValues("p5");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>P1 : <%= p1 %> </h3>
	<h3>P2 : <%= p2 %> </h3>
	<h3>P3 : <%= p3 %> </h3>
	<h3>P4 : <%= p4 %> </h3>
	
	<% for(String s:p5){ %>
	<h3>P5 : <%= s %> </h3>
	<%} %>	
</body>
</html>