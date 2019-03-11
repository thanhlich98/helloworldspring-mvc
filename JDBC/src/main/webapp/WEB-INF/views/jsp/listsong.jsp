<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Insert title here</title>
<style>
table, th, td {
	border: 1px solid black;
}

td {
	padding-right: 30px;
}
</style>
</head>
<body>
	<c:url value="/savesong" var="urlSave"></c:url>
	<c:url value="/viewsong" var="urlView"></c:url>
	<c:url value="/updatesong" var="urlUpdate"></c:url>
	<c:url value="/songDelete" var="urlDelete"></c:url>
	<h1>List Customer:</h1>
	<a href="${urlSave}">Add Customer</a>
	<br />
	<br />
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Artist</th>
			<th>Description</th>
			<th>View</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:if test="${not empty listsong}">
			<c:forEach var="song" items="${listsong}">
				<tr style="border: 1px black solid">
					<td>${song.id}</td>
					<td>${song.name}</td>
					<td>${song.address}</td>
					<td>${song.description }</td>
					<td><a href="${urlView}/${song.id}">View</a></td>
					<td><a href="${urlUpdate}/${song.id}">Edit</a></td>
					<td><a href="${urlDelete}/${song.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>