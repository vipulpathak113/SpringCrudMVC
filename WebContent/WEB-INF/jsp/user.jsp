<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Users List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>UserName</th><th>First Name</th><th>Last Name</th><th>Email</th><th>Address</th><th>Phone</th></tr>  
   <c:forEach var="user" items="${allUsers}">   
   <tr>  
   <td>${user.username}</td>  
   <td>${user.firstname}</td>  
   <td>${user.lastname}</td>  
   <td>${user.email}</td>
      <td>${user.address}</td>
      <td>${user.phone}</td>
   <td><a href="edit/${user.username}">Edit</a></td>  
   <td><a href="delete/${user.username}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="/Tutorial/register">Add New Employee</a>  

</body>
</html>