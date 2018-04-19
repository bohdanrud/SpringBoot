<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
.error{
color: red;
}
</style>

<h1>Add actor</h1>
<form:form action="/filmsDatabase/add-actor" method="POST" modelAttribute="actorModel">

First name: <form:input path="firstName"/><form:errors path="firstName" cssClass="error"></form:errors><br>
Last name: <form:input path="lastName"/><form:errors path="lastName" cssClass="error"></form:errors><br>
Gender: <form:radiobuttons path="gender" items="${genders}"/> <br>
Date Of Birth: <form:input path="dateOfBirth"/><form:errors path="dateOfBirth" cssClass="error"></form:errors><br>
<input type="submit" value="Add actor">

</form:form>