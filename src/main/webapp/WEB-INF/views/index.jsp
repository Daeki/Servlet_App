<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<c:import url="/WEB-INF/views/template/common.jsp"></c:import>

</head>
	<body>
		<!--Sementic tag-->
		<c:import url="/WEB-INF/views/template/header.jsp"></c:import>
		<section class="wrap_left contents">
			<c:import url="./template/nav.jsp"></c:import>
			<div class="right contents_right">
				<h4>foreach</h4>
				<%-- for(int i=1;i<=10;i++) --%>
				<c:forEach begin="1" end="10" var="i">
					<h4>${i}</h4>
				</c:forEach>
				
				<hr>
				<%-- for(int i=1;i<=10;i=i+2) --%>
				
				<c:forEach begin="1" end="10" step="2" var="i">
					<h4>${i}</h4>
				</c:forEach>
				
				<hr>
				<%-- for(int i=1;i<=10;i++) --%>
				<c:forEach begin="1" end="10" var="i" step="1" varStatus="st">
					<h4>${i}</h4>
					<h4>시작값 : ${st.begin}</h4>
					<h4>시작값 : ${st.end}</h4>
					<h4>증가값 : ${st.step}</h4>
					<hr>
				</c:forEach>
			
			
			</div>
	
		</section>
	
		<c:import url="./template/footer.jsp"></c:import>
	</body>
</html>