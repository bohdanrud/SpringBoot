<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Add Category</h1>

<form:form action="filmsDatabase/new-category" method="POST" modelAttribute="categoryModel">

Category name: <form:input path="name"/> <br>

<input type="submit" value="Add category">

</form:form>