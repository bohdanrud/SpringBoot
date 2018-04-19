<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
.errors{
color: red;
}
</style>

<h1>Add Film</h1>

<form:form action="/filmsDatabase/add-film" method="POST" modelAttribute="filmModel">

Film name: <form:input path="name"/><form:errors path="name" cssClass="errors"></form:errors><br>
Description: <form:input path="description"/><form:errors path="description" cssClass="errors"></form:errors><br>
Year: <form:input path="releaseYear"/><br>
Category: <form:select path="category" items="${ categories }" itemLabel="name" itemValue="id"></form:select>
<input type="submit" value="Add film">
</form:form>