<!doctype html>
<html>
<title>Passengers Info</title>
<body>
	<h1>Passengers Info</h1>
	<ul>
		<c:forEach items="${passengers}" var="passenger">
		    <tr>      
		        <td>${passenger.uid}</td>
		        <td>${passenger.name}</td>
		        <td>${passenger.surname}</td>
		        <td>${passenger.passport}</td>
		    </tr>
		</c:forEach>
		
	</ul>
</body>
</html>