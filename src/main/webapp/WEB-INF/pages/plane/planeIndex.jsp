<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Plane index</h1>
<ul>
    <c:forEach var="plane" items="${planes}">
        <li>${plane.plateNumber}</li>
    </c:forEach>
</ul>
</body>
</html>
