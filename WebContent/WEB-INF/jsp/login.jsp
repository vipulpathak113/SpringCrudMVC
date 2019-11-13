<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login</title>
            <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        </head>
        <body>
        
        <h2>Login</h2>
        <div class="container">
            <form:form id="loginForm" modelAttribute="login" action="loginProcess" method="post">
                
                     <fieldset class="form-group">
                     <label>UserName</label>
                     <input name="username" type="text" class="form-control" required="required"/>
                     </fieldset>
                     <fieldset class="form-group">
                     <label>Password</label>
                     <input name="password" type="password" class="form-control" required="required"/>
                     </fieldset>
                    
                    <input class="btn btn-success" type="submit" value="Login"/>
                    
             <a href="/Tutorial" class="btn btn-primary">Home</a>
                        
            </form:form>
            
            <span style="font-style: italic; color: red;">${message}</span>
            
            </div>
            <script src="webjars/jquery/3.4.1/js/jquery.min.js"></script>
   <script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
 
        </body>
        </html>