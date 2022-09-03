<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<body>
	<div class="container p-3 my-3 bg-dark text-white">
		<h1>Login</h1>
		<form action="Login" method="post">
			<div class="form-group">
				User ID: <input type="text" class="form-control" name="userId"
					placeholder="user id" required>
				Password: <input type="password" class="form-control" name="password"
					placeholder="password" required>
			</div>
			<button type="submit" class="btn btn-primary">Login</button>
		</form>
		<div>${result}</div>
	</div>
</body>
</html>