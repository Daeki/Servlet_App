<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/views/template/common.jsp" %>
</head>
<body>
	<%@ include file="/WEB-INF/views/template/header.jsp" %>
		<section class="wrap_left contents">
			<%@ include file="/WEB-INF/views/template/nav.jsp"%>
			<div class="right contents_right">
				<!-- contents 내용 기술 -->
				<h1>요청하신 정보를 찾을수 없습니다</h1>
				<a href="/index.do">Home</a>
			</div>
	
		</section>	
	
	<%@ include file="/WEB-INF/views/template/footer.jsp" %>

</body>
</html>