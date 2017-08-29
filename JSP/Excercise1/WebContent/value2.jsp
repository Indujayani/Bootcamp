<html>
	
	<head></head>
	<body>
	<%session.setAttribute("val1",request.getParameter("value1")); %>
	<form action="output.jsp">
		<input type="text" name="value2"/>
		
		<input type="submit" name="next"/>
		
	</form>
	</body>
</html>