<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/resources/css/bootstrap.min.css">

<title>Students By Page</title>
</head>
<body>

<div class="container">
	<div class="row">
		<table class="table table-bordered"> 
			<thead>
				<th>ID</th>
				<th>Full Name</th>
				<th>Email</th>
				<th>Age</th>
				<th>Country</th>
			</thead>
			<tbody>
			<c:forEach items="${studentsListByPageSize}" var="student">
			<tr>
			<td>${student.id}</td>
			<td>${student.fullName}</td>
			<td>${student.email}</td>
			<td>${student.age}</td>
			<td>${student.country}</td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</div>


</body>
</html>