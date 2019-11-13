<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Edit User</title>
            <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        </head>
        <body>
        
        <h2>Edit User</h2>
        <div class="container">
            <form:form method="POST" action="/Tutorial/editsave" modelAttribute="edit"> 
                
                     <fieldset class="form-group">
                     <label>UserName</label>
                     <input name="username" type="text" class="form-control" required="required"/>
                     </fieldset>
                     <fieldset class="form-group">
                     <label>Password</label>
                     <input name="password" type="password" class="form-control" required="required"/>
                     </fieldset>
                    <fieldset class="form-group">
                     <label>First Name</label>
                     <input name="firstname" type="text" class="form-control" required="required"/>
                     </fieldset>
                    <fieldset class="form-group">
                     <label>Last Name</label>
                     <input name="lastname" type="text" class="form-control" required="required"/>
                     </fieldset>
                    <fieldset class="form-group">
                     <label>Email</label>
                     <input name="email" type="email" class="form-control" required="required"/>
                     </fieldset>
                    <fieldset class="form-group">
                     <label>Address</label>
                     <input name="address" type="text" class="form-control" required="required"/>
                     </fieldset>
                    <fieldset class="form-group">
                     <label>Phone Number</label>
                     <input name="phone" type="number" class="form-control" required="required"/>
                     </fieldset>
                    <input class="btn btn-success" type="submit" value="Save"/>
                    
                        
            </form:form>
            </div>
            <script src="webjars/jquery/3.4.1/js/jquery.min.js"></script>
   <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
 
        </body>
        </html>