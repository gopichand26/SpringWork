<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>studentForm</title>
</head>
<body>
	<form action="addStudent" method="post">
		ID : <input type="text" name="id"><br>
		Name : <input type="text" name="name"><br>
		Email : <input type="text" name="email"><br>
		Mobile : <input type="text" name="mobile">
		<input type="submit" value="Insert">
	</form>

</body>
</html>