<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form:form action="add-student" method="POST" modelAttribute="studentModel">

<form:input path="fullName"/> <br>
<form:input path="age"/> <br>
<form:input path="email"/> <br>
<form:select path="country" items="${ countries }" itemLabel="name" itemValue="id"></form:select>
<input type="submit" value="Add student">

</form:form>