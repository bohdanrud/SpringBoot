<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Add actor</h1>
<form:form action="filmsDatabase/new-actor" method="POST" modelAttribute="actorModel">

First name: <form:input path="firstName"/> <br>
Last name: <form:input path="lastName"/> <br>
Gender: <form:input path="gender"/> <br>
Date Of Birth: <form:input path="dateOfBirth"/> <br>
<input type="submit" value="Add actor">

</form:form>