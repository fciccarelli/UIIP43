<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<title>Passenger Submit</title>
<body>
	<h1>Passenger Submit</h1>
    <form action="/addTicket" method="post">
    <b>Name</b>
    <input type="text" name="name" placeholder="Insert name">

    <b>Surname</b>
    <input type="text" name="surname" placeholder="Insert surname">
    
    <b>Passport</b>
    <input type="text" name="passport" placeholder="Insert passport">
    <input type="submit" value="Submit">

</form>
</body>
</html>