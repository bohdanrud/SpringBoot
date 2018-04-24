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

	<c:url var="firstUrl" value="/students/students-by-page?page=0"/>
	<c:url var="lastUrl" value="/students/students-by-page?page=${ studentsList.totalPages - 1}"/>
	<c:url var="nextUrl" value="/students/students-by-page?page=${ currentIndex + 1 }"/>
	<c:url var="prevUrl" value="/students/students-by-page?page=${ currentIndex - 1 }"/>
	
<div class="container">

	<div class="row">
		<ul class="pagination">
			<c:choose>
				<c:when test="${ currentIndex == 0}">
					<li class="disabled"><a href="#">&lt;&lt;</a></li>
					<li class="disabled"><a href="#">&lt;</a></li>
					<li class="active"><a href="${ firstUrl }">1</a></li>
				</c:when>
				
				<c:otherwise>
					<li><a href="${ firstUrl }">&lt;&lt;</a></li>
					<li><a href="${ prevUrl }">&lt;</a></li>
				</c:otherwise>
			</c:choose>
			<c:forEach var="i" begin="${beginIndex}" end="${endIndex}">
				<c:url var="pageUrl" value="/students/students-by-page?page=${ i }"/>
					<c:choose>
						<c:when test="${ i == currentIndex }">
							<li class="active"><a href="#">${ i + 1 }</a></li>
						</c:when>
						
						<c:otherwise>
							<li><a href="${ pageUrl }">${ i + 1 }</a></li>
						</c:otherwise>
					</c:choose>
			</c:forEach>
			<c:choose>
				<c:when test=" ${ currentIndex == studentsList.totalPages - 1}">
					<li class="disabled"><a href="#">&gt;</a></li>
					<li class="disabled"><a href="#">&gt;&gt;</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="${ nextUrl }">&gt;</a></li>
					<li><a href="${ lastUrl }">&gt;&gt;</a></li>
				</c:otherwise>
			</c:choose>
			
		</ul>
	</div>

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