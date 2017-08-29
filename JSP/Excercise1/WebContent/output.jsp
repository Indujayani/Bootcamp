<html>
	
	<head></head>
	<body>
	
		
	<%
	int value2=Integer.parseInt(request.getParameter("value2"));
	Object val1=session.getAttribute("val1");
	String value1=val1.toString();
	int total=Integer.parseInt(value1)+value2;
	
	%>
	
	<h1>
		<%=total%>
	</h1>
	</body>
</html>