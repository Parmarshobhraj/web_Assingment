<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Registration Form</title>
</head>
<body>
<div class="container">
		<h2>Registration Form</h2>
		<form action="UserServlet" method="post">
			<div class="form-group">
				<label for="fname">First Name:</label> <input type="text" id="fname"
					name="fname">
			</div>
			<div class="form-group">
				<label for="lname">Last Name:</label> <input type="text"
					name="lname">
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="text" name="email">
			</div>
			<div class="form-group">
				<label for="mobile">Mobile:</label> <input type="text" name="mobile">
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					name="password">
			</div>
			<div class="form-group">
				<button type="submit" name="action" value="register">Register</button>
			</div>
			<div class="form-group">
				<button type="submit" name="action" value="show">Show
					Students</button>
			</div>
		</form>
		
		
	</div>
</body>
</html>