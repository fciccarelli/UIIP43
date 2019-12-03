<!doctype html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<title>Passengers Info</title>
<body>
	<h1>Passengers Info</h1>
	<ul>

		<c:forEach items="${passengersData}" var="p">
			<ul>
				<h6>PASSEGGERO</h6>
				<li>UID: ${p.getUid()}</li>
				<li>Name: ${p.name}</li>
				<li>Surname: ${p.getSurname()}</li>
				<li>Passport: ${p.getPassport()}</li>
				<li>Ticket number: ${p.getTicket().getCode()}</li>
				<li>Seat number: ${p.getTicket().getNumberSeat()}</li>
			</ul>
		</c:forEach>
	</ul>
</body>
</html>