<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Choose an animal!</h1>
	<form action="<%=request.getContextPath() %>/Animal" method="post">
		<input type="radio" value="pig" name="radio"><label> Pig</label><br>
		<input type="radio" value="cat" name="radio"><label> Cat</label><br>
		<input type="radio" value="dog" name="radio"><label> Dog</label><br>
		<input type="radio" value="donkey" name="radio"><label> Donkey</label><br>	
		<input type="submit" value="submit">	
	</form>
</body>
</html>