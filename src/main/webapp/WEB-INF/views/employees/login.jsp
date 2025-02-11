<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/template/common.jsp"></c:import>
<link rel="stylesheet" href="../resources/css/form.css">
</head>
<body>
	<c:import url="/WEB-INF/views/template/header.jsp"></c:import>
		<section class="wrap_left contents">
			<c:import url="/WEB-INF/views/template/nav.jsp"></c:import>
			<div class="right contents_right">
				<!-- contents 내용 기술 -->
				<div class="form_control">
					<form action="login.do" method="post">
						<fieldset>
							<legend>사원번호</legend>
							<input type="text" name="employee_id">
						</fieldset>
						<fieldset>
							<legend>Password</legend>
							<input type="password" name="password">
						</fieldset>

						
						<fieldset>
							<button type="submit">로그인</button>
						</fieldset>				
				</form>
				</div>
			</div>
	
		</section>	
	
	<c:import url="/WEB-INF/views/template/footer.jsp"></c:import>

</body>
</html>