<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ALL STUDENTS</title>
</head>
<body>
<h1> STUDENT INFORMATION</h1>
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>CONTACT</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.sid}</td>
                <td>${student.sname}</td>
                <td>${student.contact}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>