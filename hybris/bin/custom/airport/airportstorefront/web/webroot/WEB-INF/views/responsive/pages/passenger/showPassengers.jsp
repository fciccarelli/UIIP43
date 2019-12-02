<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Passenger Info</title>
<body>
	<h1>Passenger Info</h1>
	${passengers}
	<ul>
		<c:forEach var="passenger" items="${passengers}">
        <li> ${passenger.name} </li>
         <li> ${passenger.surname} </li>
          <li> ${passenger.passport} </li>
        </c:forEach> 
		
	</ul>
</body>
</html>

