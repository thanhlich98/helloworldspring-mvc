<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Helo Spring MVC + JDBC</title>
</head>
<body>
  <a href="<c:url value="/customer-list" />">List Customer</a>
  <br />
  <h1>Edit Customer:</h1>
  <c:url value="/updateSong" var="updateSong" />
  <form:form action="${updateSong}" method="POST" modelAttribute="Song">
      Id: <form:input path="id" readonly="true" /> <br/> <br/>
      Name: <form:input path="name" /> <br/> <br/>
      Artist: <form:input path="artist" /> <br/> <br/>
      Description: <form:input path="description" /> <br/> <br/>
    <button type="submit">Submit</button>
  </form:form>
</body>
</html>