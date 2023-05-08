<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<title>File Upload</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data" action="process.jsp">
		<p>제목 : <input type="text" name="title">
		<p>파일 : <input type="file" name="fileName">
		<p><input type="submit" name="submit">
	</form>
</body>
</html>