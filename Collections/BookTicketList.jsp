<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://w...content-available-to-author-only...k.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://j...content-available-to-author-only...n.com/jstl/core_rt" prefix="c" %>
 <%--    <%@include file="BookTicketList.jsp" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://w...content-available-to-author-only...3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Page</title>
</head>
<body>
<center>
<h2 style="color: #2755b2 ">Welcome to Passenger Page</h2>
<br><br/><br/><br/><br/><br/>
			<form:form action="bookTicketList.obj" modelAttribute="flight">
			<table border="1" cellpadding="2" cellspacing="2" align="center">
				 <tr>
               <td><form:label path = "depCity">Source</form:label></td>
               <td>
                  <form:select path = "depCity">
                     <form:option value = "NONE" label = "Select"/>
                     <form:options items = "${cityList}" />
                  </form:select>     	
               </td>
            </tr>			
				 <tr>
               <td><form:label path = "arrCity">Destination</form:label></td>
               <td>
                  <form:select path = "arrCity">
                     <form:option value = "NONE" label = "Select"/>
                     <form:options items = "${cityList}" />
                  </form:select>     	
               </td>
            </tr>
				 <tr>
		<td colspan="2" align="center">
			<input type="submit" value="Get Details" />
		</td>
			</table>
			</form:form>
 
	<%-- <table border="2">
 
 
 <tr>
  <th>flight number</th>
  <th>flight Name</th>
  <th>Departure city</th>
  <th>Arrival City</th>
  <th>Departure Date</th>
  <th>Arrival Date</th>
  <th>Departure Time</th>
  <th>Arrival Time</th>
  <th>First seats</th>
  <th>First Seats Fare</th>
  <th>Bus Seats</th>
  <th>Bus Seats Fare</th>
 </tr>
	<c:forEach var="list" items = "${list}">
		<tr>
			<td align="center">${list.flightNo}</td>
			<td align="center">${list.airline}</td>
			<td align="center">${list.depCity}</td>
			<td align="center">${list.arrCity}</td>
			<td align="center">${list.firstSeats}</td>
			<td align="center">${list.firstSeatFare}</td>
			<td align="center">${list.busSeats}</td>
			<td align="center">${list.busSeatsFare}</td>
		</tr>
	</c:forEach>
 
</table> --%>
</center>
</body>
</html>
