<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.dropbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #ddd;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: #3e8e41;}
</style>
</head>
    <body>
        <h3>Welcome, Enter The Passenger Details</h3>
        <form:form method="POST"
          action="addTicket" modelAttribute="passenger">
             <table>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="surname">Surname</form:label></td>
                    <td><form:input path="surname"/></td>
                </tr>
                <tr>
                    <td><form:label path="uid">E-mail</form:label></td>
                    <td><form:input path="uid"/></td>
                </tr>
                <tr>
                    <td><form:label path="passport">Passport</form:label></td>
                    <td><form:input path="passport"/></td>
                </tr>

                <tr>
               <select id="select1">
                    <c:forEach items="${flightsData}" var="f">
                        <option value="${f.code}">${f.departureAirport.getCity()} --> ${f.arrivalAirport.getCity()}</option>
                    </c:forEach>
                </select>

               </tr>
               <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>


    </body>
</html>