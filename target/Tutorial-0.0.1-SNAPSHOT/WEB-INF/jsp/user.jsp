<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
<link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1>Users List</h1>  
<div class="container">
<table class="table table-striped">  
<tr><th>UserName</th><th>First Name</th><th>Last Name</th><th>Email</th><th>Address</th><th>Phone</th><th>Action</th></tr>  
   <c:forEach var="user" items="${allUsers}">   
   <tr>  
   <td>${user.username}</td>  
   <td>${user.firstname}</td>  
   <td>${user.lastname}</td>  
   <td>${user.email}</td>
      <td>${user.address}</td>
      <td>${user.phone}</td>
   <td><a class="btn btn-primary" href="edit/${user.username}">Edit</a></td>  
   <td><a class="btn btn-danger" href="delete/${user.username}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <div>
   
   <a class="btn btn-primary" href="/Tutorial/register">Add New User</a>  
   </div>
   
   </div>
   <script src="webjars/jquery/3.4.1/js/jquery.min.js"></script>
   <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>