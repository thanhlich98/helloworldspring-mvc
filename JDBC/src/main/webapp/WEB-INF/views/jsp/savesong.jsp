<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Helo Spring MVC + JDBC</title>
</head>
<body>
	<a href="<c:url value="/listsong" />">List Customer</a>
	<br />
	<h1>Add new Customer:</h1>
	<c:url value="/saveSong" var="saveSong" />
	<form:form action="${saveSong}" method="POST" modelAttribute="Song">
      Name: <form:input path="name" />
		<br />
		<br />
      Artist: <form:input path="artist" />
		<br />
		<br />
       Description: <form:input path="description" />
		<br />
		<br />
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>