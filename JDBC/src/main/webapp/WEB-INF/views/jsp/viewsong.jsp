<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Helo Spring MVC + JDBC</title>
</head>
<body>
  <a href="<c:url value="/listsong" />" >List Song</a><br />
  <h1>View Song:</h1>  
  Song ID: ${song.id} <br/>
  Song Name: ${song.name} <br/>
  Song Artist: ${song.artist} <br/>
  Song Description : ${song.description}
</body>
</html>