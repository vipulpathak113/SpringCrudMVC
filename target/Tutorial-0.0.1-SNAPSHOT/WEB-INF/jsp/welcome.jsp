<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
      "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>&lt;c:out&gt; Demo</title>
    </head>
    <body>
    
     <form:form modelAttribute="welcome" method="get">
     Welcome <c:out value="${firstname}"/>
     
     <jsp:include page="user.jsp"></jsp:include>
     
     </form:form>
     
    </body>
</html>