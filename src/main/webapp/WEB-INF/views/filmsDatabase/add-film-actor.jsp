<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Add FILM-ACTOR</h1>

<form:form action="filmsDatabase/new-film-actor" method="POST" modelAttribute="filmActorModel">

Film: <form:select path="actors" items="${ actorsList }" itemLabel="lastName" itemValue="id"></form:select>
Actor:

</form:form>