<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.errorText {
	color: #ff000;
}

.errorBanner {
	color: #00000;
	background-color: #ffeeee;
	border: 3px solid #ff0000;
	margin: 16px;
	padding: 8px;
}
</style>
</head>
<body>


	<form:form commandName="event">
		<form:errors path="*" cssClass="errorBanner" element="div"></form:errors>
		<div>
			<h1>Add Event</h1>
		</div>
		<div>Enter Event</div>
		<div>
			<form:input path="eventName" cssErrorClass="errorText" />
		</div>
		<div>
			<input type="submit" value="save">
		</div>


	</form:form>


</body>
</html>