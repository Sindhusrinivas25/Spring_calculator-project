<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login page</h1>
<form action="login" method="post">
<table>
<tr>
<th>Email/phone:</th>
<td><input type="email" name="phone">
</tr>
<tr>
<th>password:</th>
<td><input type="password" name="pwd"></td>
</tr>
<tr>
<td><button type="reset">cancel</button>
<td><button>Login</button></td>
</tr>
</table>
</form>
<a href="load">New? click here to signup</a>




</body>
</html>