<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>부서 추가 페이지</h1>
	
	<form action="./addProcess.jsp" method="post">
		<input type="text" name="department_name" value="test" >
		<input type="text" name="manager_id">
		<input type="text" name="location_id">
		<input type="submit" value="등록">
		<button type="submit">등록</button>
	</form>

</body>
</html>