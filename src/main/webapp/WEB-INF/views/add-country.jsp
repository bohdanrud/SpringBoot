<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
.error{
color: red;
}
</style>

<form:form action="/add-country" method="POST" modelAttribute="countryModel">

<form:input path="name"/><form:errors path="name" cssClass="error"></form:errors>
<input type="submit" value="Add Country">

</form:form>