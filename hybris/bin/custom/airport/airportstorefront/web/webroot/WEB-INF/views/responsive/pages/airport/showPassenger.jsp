<!doctype html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<title>Passenger Info</title>
<body>
	<h1>Passenger Info</h1>
	<ul>
	<c:forEach items="${passengerData}" var="p">
   	<li> ${p.name} </li>
		<li> ${p.surname} </li>
		<li> ${p.passport} </li>
		<li> ${p.getTicket().getCode()} </li>
		<li> ${p.getTicket().getNumberSeat} </li>
	</c:forEach>
		
	</ul>
</body>
</html>