<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form:form action="/add-country" method="POST" modelAttribute="countryModel">

<form:input path="name"/>
<input type="submit" value="Add Country">

</form:form>