<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The New Passenger</h3>
        <form:form method="POST"
         action="passenger" modelAttribute="passenger"> 
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
                     <td><form:label path="uid"> 
                       E-mail</form:label></td> 
                    <td><form:input path="uid"/></td> 
                 </tr> 
                 <tr> 
                     <td><form:label path="passport"> 
                       Passport</form:label></td> 
                    <td><form:input path="passport"/></td> 
                 </tr> 
               <tr> 
                     <td><input type="submit" value="Submit"/></td> 
                 </tr> 
             </table> 
        </form:form> 
    </body>
</html>