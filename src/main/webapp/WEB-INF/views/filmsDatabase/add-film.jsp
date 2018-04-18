<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Add Film</h1>

<form:form action="filmsDatabase/new-film" method="POST" modelAttribute="filmModel">

Film name: <form:input path="name"/> <br>
Description: <form:input path="description"/> <br>
Year: <form:input path="releaseYear"/> <br>

<input type="submit" value="Add film">
</form:form>