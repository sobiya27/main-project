<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
table,th,td{
border: 1px solidblack;
}

td{
background-color: #d9c629a3;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center" style="background-color: #008062c9;">ViewRegistrationPage</h1>
<table style="width: 100%">

<tr>
<th>passangerId</th>
<th>passangerName</th>
<th>passangerAddress</th>
<th>passangerNumber</th>
<th>gmailId</th>
<th>Despature</th> 
<th>Edit</th>
<th>Delete</th>
</tr>

 <c:forEach items="${object}" var="train"> 
 <tr>
 <td>${train.passangerId}</td>
 <td>${train.passangerName}</td>
 <td>${train.passangerAddress}</td>
 <td>${train.passangerNumber}</td>
 <td>${train.gmailId}</td>
 <td>${train.despature}</td>
 <td><a href="edit_value?id=${train.passangerId}">Edit</a></td>
 <td><a href="delete_value?id=${train.passangerId}">Delete</a></td>
 </tr>
     
</c:forEach>
</table>
</body>
</html>