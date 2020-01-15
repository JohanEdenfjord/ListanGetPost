<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		 <form action="<%=request.getContextPath() %>/Poster" method="post">
				<p>write a list in the text box below.</p>
				<p>For every list Item you need to have a blankspace</p>
				<p>have fun!</p>
				<textarea name="list"></textarea><br>
				<br>
				<input type="submit" value="Away!">	
		 </form>
</body>
</html>