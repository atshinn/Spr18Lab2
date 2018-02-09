<!doctype html>

<html lang="en">
	<head>
	<meta charset="utf-8">

	<title>Login</title>
	<meta name="author" content="Alec Shinn">

	</head>

	<body>
		<form action="/task1/controller" method="POST">
			<fieldset>
				<legend>Login Information</legend>
				
				User Name<br>
				<%
					String username = (String)session.getAttribute("username");
					if(username != null){
				%>
					<input type="text" name="username" value=<%=username%>><br>
				<%
					} else {
				%>
					<input type="text" name="username"><br>
				<%}%>
				
				Password<br>
				<%
					String password = (String)session.getAttribute("password");
					if(password != null){
				%>
					<input type="password" name="password" value=<%=password%>><br>
				<%
					} else {
				%>
					<input type="password" name="password"><br>
				<%}%>
				
				<input type="submit" value="Login">
			</fieldset>
		</form>
	</body>
</html>