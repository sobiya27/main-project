<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center" style="background-color:#008062c9;">Welcome To Reservation</h1>
<h2 align="center" style="background-color: #88740bb3;">${alertmsg}</h2>
<form action="train_res" method="post">
passangerName:
<br>
<input type="text" name="passangerName">
<br>
passangerAddress:
<br>
<input type="text" name="passangerAddress">
<br>
passangerNumber:
<br>
<input type="text" maxlength="10" name="passangerNumber">
<br>
gmailId:
<br>
<input type="text" name="gmailId">
<br>
Despature:
<br>
<input type="text" name="Despature">
<br>
<input type="submit" value="login">
</form>
<br>
<h3 style="background-color: #90e614d6;margin-left: 5px;margin-right: 1180px;">
<a href="train_res">Reservations View</a></h3>
<br>
<br>
<br>
<h1 align="center" style="background-color:#008062c9;">Thanks For Visit</h1>
</body>
</html>