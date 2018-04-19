<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
.errors{
color: red;
}
</style>

<h1>Add Category</h1>

<form:form action="filmsDatabase/add-category" method="POST" modelAttribute="categoryModel">

Category name: <form:input path="name"/><form:errors path="name" cssClass="errors"></form:errors><br>

<input type="submit" value="Add category">

</form:form>