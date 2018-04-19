<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
.errors{
color: red;
}
</style>

<h1>Login Data</h1>

<form:form action="filmsDatabase/add-loginData" method="POST" modelAttribute="loginDataModel">

Email: <form:input path="email"/><form:errors path="email" cssClass="errors"></form:errors><br>
Password: <form:input path="password"/> <br> 
Again: <form:input path="passwordConfirm"/> <br>
Actor: <form:select path="actor" items="${ actors }" itemLabel="lastName" itemValue="id"></form:select>

<input type="submit" value="Add">

</form:form>