<!doctype html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<title>Passengers Info</title>
<body>
	<h1>Passengers Info</h1>
	<ul>

		<c:forEach items="${ticketsData}" var="t">
			<ul>
				<h6>PASSEGGERO</h6>
				<li>TicketCode: ${t.getCode()}</li>
				<li>Number of seat: ${t.getNumberSeat()}</li>
				<li>Passengers UID: ${t.getPassenger().getUid()}</li>
				<li>Passenger name: ${t.getPassenger().getName()}</li>
				<li>Passenger surname: ${t.getPassenger().getSurname()}</li>
				<li>Passenger passport: ${t.getPassenger().getPassport()}</li>
			</ul>
		</c:forEach>
	</ul>
</body>
</html>