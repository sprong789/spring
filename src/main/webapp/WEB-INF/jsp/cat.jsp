<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD//XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <title>cat</title>
</head>
<body>
<table border="1">
	<thead>
		<tr>
			<th>id</th>
			<th>姓名</th>
			<th>年龄</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${cat}"  var="Mycat" varStatus="st">
		<tr>
			<td>${Mycat.id}</td>
			<td>${Mycat.name}</td>
			<td>${Mycat.catAge}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>