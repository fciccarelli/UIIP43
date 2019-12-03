<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<title>Ticket Info</title>
<body>
	<h1>Ticket Info</h1>

	<select id="food" name="fooditems">

		<c:forEach items="${TicketData}" var="t">
			<tr>
				<td>Code: ${t.code}</td>
				<td>Name: ${t.name}</td>
				<td>Surname: ${t.surname}</td>
				<td>numberSeat: ${t.numberSeat}</td>
			</tr>
		</c:forEach>

	</select>

</body>
</html>
