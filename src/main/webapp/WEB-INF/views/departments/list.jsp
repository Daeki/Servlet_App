<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//스크립틀릿
	Object ar = request.getAttribute("list");
	List<DepartmentDTO> list = (List<DepartmentDTO>)ar;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../template/common.jsp"%>
<link rel="stylesheet" href="../resources/css/list.css">
</head>
<body>
	<%@ include file="../template/header.jsp"%>
	<section class="wrap_left contents">
		<%@ include file="../template/nav.jsp"%>
		<div class="right contents_right">
			<div class="contents_right_list">
				<table class="table_sprite">
					<thead>
						<tr>
							<th>부서번호</th>
							<th>부서명</th>
						</tr>
					</thead>
					<tbody>
	
						<%
						for (int i = 0; i < list.size(); i++) {
						%>
						<tr>
							<td><%=list.get(i).getDepartment_id()%></td>
							<td><a
								href="./detail.do?department_id=<%=list.get(i).getDepartment_id()%>"><%=list.get(i).getDepartment_name()%></a>
							</td>
						</tr>
						<%
						}
						%>
					</tbody>
				</table>
			</div>
			<div>
				<a href="add.do">부서등록</a>
			</div>


		</div>

	</section>

	<%@ include file="../template/footer.jsp"%>



</body>
</html>