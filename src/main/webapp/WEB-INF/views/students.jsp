<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form action="/students/search" method="get">

<input type="text" name="search" placeholder="Enter Full name">
<input type="submit" value="Search">
</form>


<br>
<c:forEach items="${studentsList}" var="student">

${ student.id } | ${ student.fullName } | ${ student.age } | ${ student.country.name } <br>

</c:forEach>