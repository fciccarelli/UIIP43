<!doctype html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
	<h1>New ticket registered</h1>
	<ul>
		<li>Passenger name: ${name} </li>
		<li>Passenger surname: ${surname} </li>
		<li>Passport: ${passport} </li>
		<li>Ticket code: ${code} </li>
        <li>Seat number: ${numberSeat} </li>
	</ul>
</body>
</html>