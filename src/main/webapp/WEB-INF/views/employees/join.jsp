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
					<form action="join.do" method="post">
						<fieldset>
							<legend>Password</legend>
							<input type="password" name="password">
						</fieldset>
						<fieldset>
							<legend>First Name</legend>
							<input type="text" name="first_name">
						</fieldset>
						<fieldset>
							<legend>Last Name</legend>
							<input type="text" name="last_name">
						</fieldset>	
						<fieldset>
							<legend>Email</legend>
							<input type="text" name="email">
						</fieldset>
						<fieldset>
							<legend>Phone Number</legend>
							<input type="text" name="phone_number">
						</fieldset>					
						<fieldset>
							<legend>Job Id</legend>
							<input type="text" name="job_id">
						</fieldset>
						<fieldset>
							<legend>Salary</legend>
							<input type="text" name="salary">
						</fieldset>
						<fieldset>
							<legend>Commission</legend>
							<input type="text" name="commission_pct">
						</fieldset>
						<fieldset>
							<legend>Manager</legend>
							<input type="text" name="manager_id">
						</fieldset>					
						<fieldset>
							<legend>Department</legend>
							<input type="text" name="department_id">
						</fieldset>	
						
						<fieldset>
							<button type="submit">사원등록</button>
						</fieldset>				
				</form>
				</div>
			</div>
	
		</section>	
	
	<c:import url="/WEB-INF/views/template/footer.jsp"></c:import>

</body>
</html>