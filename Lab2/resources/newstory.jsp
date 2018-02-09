<!doctype html>

<html lang="en">
	<head>
	<meta charset="utf-8">

	<title>New Story</title>
	<meta name="author" content="Alec Shinn">

	</head>

	<body>
		<a href=<%=request.getRequestURL().toString() %>>View Stories</a>
		
		<form action="/task1/controller/newstory" method="POST">
			<fieldset>
				<legend>NewStory</legend>
				
				Title<br>
				<input type="text" name="title" value="" width="300" ><br>
				
				Story<br>				
				<input type="text" name="story" style="height=300;width=500;"><br>				
				
				<input type="checkbox" name="private" value="private">
				
				<input type="submit" value="Login">
			</fieldset>
		</form>
	</body>
</html>