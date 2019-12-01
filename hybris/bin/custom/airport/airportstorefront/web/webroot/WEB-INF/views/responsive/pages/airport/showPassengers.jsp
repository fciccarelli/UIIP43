<!doctype html>
<html>
<title>Passengers Info</title>
<body>
	<h1>Passengers Info</h1>
	<ul>
<%-- 		<c:forEach var="p" items="${passengersData}"> --%>
<%-- 			<li>${p.uid}</li> --%>
<%-- 			<li>${p.name}</li> --%>
<%-- 			<li>${p.surname}</li> --%>
<%-- 			<li>${p.passport}</li> --%>
<%-- 			<li>${ticketNumber}</li> --%>
<%-- 			<li>${numberSeat}</li> --%>
<!-- 		</c:forEach> -->

		<c:forEach items='${passengersData}' var='p'>
			<ul>
				<%-- Display the key of the current item, which
                 represents the model atteribute name --%>
				<li>Passenger UID: <c:out value='${p.uid}' /></li>
				<li>Passenger Name: <c:out value='${p.name}' /></li>
				<li>Passenger Surname: <c:out value='${p.surname}' /></li>
				<li>Passenger Passport: <c:out value='${p.passport}' /></li>
				<li>Passenger ticket number: <c:out value='${p.ticket}' /></li>
				<li>Passenger seat number: <c:out value='${p.numberSeat}' /></li>
			</ul>
		</c:forEach>
	</ul>
</body>
</html>