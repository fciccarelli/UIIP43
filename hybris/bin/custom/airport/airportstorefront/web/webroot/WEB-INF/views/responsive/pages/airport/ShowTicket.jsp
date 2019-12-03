<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<title>Ticket Info</title>
<body>
	<h1>Ticket Info</h1>
	${ticketData}
		<c:forEach items="${ticketData}" var="t">
			<ul>
				<li>codeTicket: ${t.code}</li>
				<li>numberSeat: ${t.numberSeat}</li>
				<li></li>
				<li></li>
			</ul>
				
			
		</c:forEach>
		<c:forEach items="${passengerData}" var="p">
			<ul>
				<li>passName: ${p.name}</li>
				<li>passSurname: ${p.surname}</li>
			</ul>
				
			
		</c:forEach>

</body>
</html>
