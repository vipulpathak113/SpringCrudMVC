<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title>
            <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        </head>
        <body>
        
        <h2>Sign Up</h2>
        <div class="container">
            <form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
                
                     <fieldset class="form-group">
                     <form:label path="username">UserName</form:label>
                     <form:input path="username" type="text" class="form-control" required="required"/>
                     </fieldset>
                     <fieldset class="form-group">
                     <form:label path="password">Password</form:label>
                     <form:input path="password" type="password" class="form-control" required="required"/>
                     <form:errors path="password" />
                     </fieldset>
                    <fieldset class="form-group">
                     <form:label path="firstname">First Name</form:label>
                     <form:input path="firstname" type="text" class="form-control" required="required"/>
                     </fieldset>
                    <fieldset class="form-group">
                     <form:label path="lastname">Last Name</form:label>
                     <form:input path="lastname" type="text" class="form-control" required="required"/>
                     </fieldset>
                    <fieldset class="form-group">
                     <form:label path="email">Email</form:label>
                     <form:input path="email" type="email" class="form-control" required="required"/>
                     </fieldset>
                    <fieldset class="form-group">
                     <form:label path="address">Address</form:label>
                     <form:input path="address" type="text" class="form-control" required="required"/>
                     </fieldset>
                    <fieldset class="form-group">
                     <form:label path="phone">Phone Number</form:label>
                     <form:input path="phone" type="number" class="form-control" required="required"/>
                     </fieldset>
                    <input class="btn btn-success" type="submit" value="Register"/>
                    
             <a href="/Tutorial" class="btn btn-primary">Home</a>
                        
            </form:form>
            </div>
            <script src="webjars/jquery/3.4.1/js/jquery.min.js"></script>
            <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
 
        </body>
        </html>