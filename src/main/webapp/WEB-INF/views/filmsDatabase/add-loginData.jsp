<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Login Data</h1>

<form:form action="filmsDatabase/new-loginData" method="POST" modelAttribute="loginDataModel">

Email: <form:input path="email"/> <br>
Password: <form:input path="password"/> <br> 
Again: <form:input path="passwordConfirm"/> <br>

<input type="submit" value="Add">

</form:form>