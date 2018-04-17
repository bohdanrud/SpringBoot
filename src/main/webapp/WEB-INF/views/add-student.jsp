<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
.error{
color: red;
}
</style>

<form:form action="add-student" method="POST" modelAttribute="studentModel">

<form:input path="fullName"/><form:errors path="fullName" cssClass="error"></form:errors><br>
<form:input path="age"/><form:errors path="age" cssClass="error"></form:errors> <br>
<form:input path="email"/><form:errors path="email" cssClass="error"></form:errors> <br>
<form:select path="country" items="${ countries }" itemLabel="name" itemValue="id"></form:select>
<form:errors path="country" cssClass="error"></form:errors> <br>
<input type="submit" value="Add student">

</form:form>