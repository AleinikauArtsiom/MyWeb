<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <title>Jsp example </title>
</head>
<body>
<%--<%
    String[] temp = (String[]) request.getAttribute("names");
    for (int i = 0; i < temp.length; i++) {
        out.println("<h1>" + temp[i] + "</h1>");
    }
%>--%>
<c:if test="${visible == true}">
        JSTL EXAMPLE


<c:forEach var="name" items="${name1}">
   <h1><c:out value="${name}"/></h1>

</c:forEach>
</c:if>






</body>
</html>
