<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 25.10.2018
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Teachers</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <jsp:useBean id="tb" scope="request" type="beans.TeacherBean"/>
    <table>
        <thead>
        <tr>
            <th>№</th>
            <th>Имя</th>
            <th>Стаж</th>
            <th>Предметы</th>
        </tr>
        </thead>
    <c:forEach items="${tb.teachers}" var="t">
        <tr>
            <td>${t.id}</td>
            <td>${t.name}</td>
            <td>${t.experience}</td>
            <td>${t.courcesString}</td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>
