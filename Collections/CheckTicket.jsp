<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib uri="http://w...content-available-to-author-only...k.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://w...content-available-to-author-only...3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Check Ticket Details</title>
</head>
<body>
<form:form action="retrieveTicket.obj" modelAttribute="booking">
Enter Ticket No:<form:input  path="bookingId"/>
         <form:errors path="bookingId"/><br>
         <input type="submit" value="get ticket details">
</form:form>
</body>
</html>
