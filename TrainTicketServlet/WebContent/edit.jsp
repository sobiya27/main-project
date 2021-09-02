<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "g" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center" style="background-color:#008062c9;">Edit Page</h1>
<h2 align="center" style="background-color: #5bce2782;">${successfull}</h2>

<form action="edit_value" method="post">
 passangerName:
<input type="text" name="passangerName" value="${obj.passangerName}"> 

passangerAddress:
<input type="text" name="passangerAddress" value="${obj.passangerAddress}">

passangerNumber:
<input type="text" name="passangerNumber" value="${obj.passangerNumber}">

GmailId:
<input type="text" name="gmailId" value="${obj.gmailId}">

 despature:
<input type="text" name="despature" value="${obj.despature}"> 

<input type="hidden" name="passangerId" value="${obj.passangerId}">

<input type="submit" value="edit">
</form>
<br>
<br>
<br>
<br
<h1 align="center" style="background-color:#008062c9;">Thanks For Visit</h1>
</body>
</html>