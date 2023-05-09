<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false" %>
<html>
<head>
	<title>Internationalization</title>
</head>
<body>
	<h2>다국어 처리</h2>
	<p><a href="?language=ko">Korean</a>|<a href="?language=en">English</a>
	<p><spring:message code="Person.form.Enter.message"/>
</body>
</html>