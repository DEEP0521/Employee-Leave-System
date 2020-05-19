<%@taglib prefix="e" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leave Check</title>
</head>
<body>
<h1>Leave</h1>

<table>
 <tr><th>Used Leaves</th><th>Remaining Leaves</th></tr>
 <tr><e:forEach var="leave" items="${leaves}">
   <td>${leave.used}</td><td>${leave.remaining}</td>
 </e:forEach></tr>
</table>
</body>
</html>