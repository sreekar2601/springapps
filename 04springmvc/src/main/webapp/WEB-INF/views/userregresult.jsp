<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response</title>
</head>
<body>
	<h1>User Registered successfully</h1>
	<p>User details are: <em><%=request.getAttribute("user") %></em></p>
</body>
</html>